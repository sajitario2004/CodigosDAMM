DROP DATABASE PcComponentes;

CREATE DATABASE PcComponentes;

USE PcComponentes;

-- tablas ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE TABLE CATEGORIA (
    id_categoria INT AUTO_INCREMENT PRIMARY KEY,
    nombre_categoria VARCHAR(50)
    
);

CREATE TABLE VENDEDOR (
    id_vendedor INT AUTO_INCREMENT PRIMARY KEY,
    nombre_vendedor VARCHAR(100),
    telefono VARCHAR(15),
    email VARCHAR(100)
    
);

CREATE TABLE PRODUCTO (
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    id_categoria INT,
    id_vendedor INT,
    nombre_producto VARCHAR(100),
    estado VARCHAR (50),
    caracteristicas VARCHAR(1000),
    precio DECIMAL(10, 2),
    descuento DECIMAL(10, 2),
    precio_final DECIMAL(10,2),
    FOREIGN KEY (id_categoria) REFERENCES CATEGORIA(id_categoria),
    FOREIGN KEY (id_vendedor) REFERENCES VENDEDOR(id_vendedor)
    
);

CREATE TABLE COMPONENTES (
    id_componente INT AUTO_INCREMENT PRIMARY KEY,
    id_producto INT,
    tipo_componente VARCHAR(50),
    especificaciones_tecnicas VARCHAR(500),
    FOREIGN KEY (id_producto) REFERENCES PRODUCTO(id_producto)
    
);

CREATE TABLE ORDENADORES (
    id_ordenador INT AUTO_INCREMENT PRIMARY KEY,
    id_producto INT,
    tipo_ordenador VARCHAR(50),
    especificaciones_tecnicas VARCHAR(500),
    FOREIGN KEY (id_producto) REFERENCES PRODUCTO(id_producto)
    
);

CREATE TABLE PERIFERICOS (
    id_periferico INT AUTO_INCREMENT PRIMARY KEY,
    id_producto INT,
    tipo_periferico VARCHAR(50),
    especificaciones_tecnicas VARCHAR(500),
    FOREIGN KEY (id_producto) REFERENCES PRODUCTO(id_producto)
    
);


-- VIEW ------------------------------------------------------------------------------------------------------------------------------------------------------------------------

CREATE VIEW VISTAUSUNOR AS
SELECT p.id_producto, c.nombre_categoria, p.nombre_producto, p.estado, p.precio, p.descuento, p.precio_final,
    CASE
        WHEN comp.especificaciones_tecnicas THEN comp.especificaciones_tecnicas
        
        WHEN orde.especificaciones_tecnicas THEN orde.especificaciones_tecnicas
        
        WHEN peri.especificaciones_tecnicas THEN peri.especificaciones_tecnicas
        
    END AS especificaciones_tecnicas
FROM PRODUCTO p
JOIN CATEGORIA c ON p.id_categoria = c.id_categoria
LEFT JOIN COMPONENTES comp ON p.id_producto = comp.id_producto

LEFT JOIN ORDENADORES orde ON p.id_producto = orde.id_producto

LEFT JOIN PERIFERICOS peri ON p.id_producto = peri.id_producto

WHERE p.estado = 'nuevo';


-- indices y particiones ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE INDEX IDXPRECIO ON PRODUCTO(precio);


-- NO FUNCIONA POR ALGO DE QUE LOS FOREIGN KEY NO SON SOPORTADOS POR PARTICIONES
-- ALTER TABLE PRODUCTO
-- PARTITION BY LIST COLUMNS(estado) (
  --  PARTITION p_nuevo VALUES IN ('nuevo'),
  -- PARTITION p_reacondicionado VALUES IN ('reacondicionado')
    
-- );



-- procedure------------------------------------------------------------------------------------------------------------------------------------------------------------------------
DELIMITER //
CREATE PROCEDURE INSERTNUEVOPRODUCTO(
    IN p_id_categoria INT,
    IN p_id_vendedor INT,
    IN p_nombre_producto VARCHAR(100),
    IN p_estado VARCHAR(50),
    IN p_caracteristicas VARCHAR(1000),
    IN p_precio DECIMAL(10,2),
    IN p_descuento DECIMAL(10,2),
    IN p_tipo_especifico VARCHAR(50),
    IN p_especificaciones_tecnicas VARCHAR(500)
)
BEGIN
	-- declaramos un id para el nuevo producto
    DECLARE nuevo_id_producto INT;
    
    -- insertar en la tabla producto
    INSERT INTO PRODUCTO (id_categoria, id_vendedor,nombre_producto, estado,caracteristicas, precio, descuento)
    VALUES (p_id_categoria, p_id_vendedor,p_nombre_producto, p_estado, p_caracteristicas,p_precio,p_descuento);
    
    -- obtener el ID del producto que se acabs de insertar (Esto lo he buscado en https://www.w3schools.com/sql/sql_intro.asp)
    SET nuevo_id_producto = LAST_INSERT_ID();
   
    -- insercion en la tabla especifica segun la categoria atraves del id_categoria
    IF p_id_categoria = 1 THEN
        INSERT INTO COMPONENTES (id_producto, tipo_componente, especificaciones_tecnicas)
        VALUES (nuevo_id_producto, p_tipo_especifico, p_especificaciones_tecnicas);
        
    ELSEIF p_id_categoria = 2 THEN
        INSERT INTO ORDENADORES (id_producto, tipo_ordenador, especificaciones_tecnicas)
        VALUES (nuevo_id_producto, p_tipo_especifico, p_especificaciones_tecnicas);
        
    ELSEIF p_id_categoria = 3 THEN
        INSERT INTO PERIFERICOS (id_producto, tipo_periferico, especificaciones_tecnicas)
        VALUES (nuevo_id_producto, p_tipo_especifico, p_especificaciones_tecnicas);
        
    END IF;
    
END //
DELIMITER ;

-- funcion ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 DELIMITER //
CREATE FUNCTION CALCDESCUENTO(precio DECIMAL(10, 2), porcentaje DECIMAL(10, 2))
RETURNS DECIMAL(10, 2)

DETERMINISTIC -- esto me ha comido la cabeca un rato aunque sigo sin saber porque sin esto no funciona

BEGIN
	DECLARE precio_final DECIMAL(10, 2);
    SET precio_final = precio * (1 - porcentaje / 100);
    RETURN precio_final ;
    
END //
DELIMITER ;

-- trigger ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
DELIMITER //
CREATE TRIGGER IVAYDESCUENTO BEFORE INSERT ON PRODUCTO
FOR EACH ROW
BEGIN
	SET NEW.precio = NEW.precio * 1.21; 
    
    -- aqui ejecuto la funcion de arriba
    SET NEW.precio_final = CALCDESCUENTO(NEW.precio, NEW.descuento);

END //
DELIMITER ;