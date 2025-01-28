DROP DATABASE DIA280125;

CREATE DATABASE DIA280125;

USE DIA280125;

CREATE TABLE productos (
id_producto INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(50),
stock INT
);


CREATE TABLE ventas (
id_venta INT PRIMARY KEY AUTO_INCREMENT,
id_producto INT,
cantidad INT,
fecha DATE,
FOREIGN KEY (id_producto) REFERENCES productos(id_producto)
);

   
INSERT INTO productos (id_producto, nombre, stock) VALUES (1, 'Producto A', 100);
INSERT INTO productos (id_producto, nombre, stock) VALUES (2, 'Producto B', 50);

INSERT INTO ventas (id_venta, id_producto, cantidad, fecha) VALUES (1, 1, 5, '2025-01-01');
INSERT INTO ventas (id_venta, id_producto, cantidad, fecha) VALUES (2, 2, 3, '2025-01-01');
INSERT INTO ventas (id_venta, id_producto, cantidad, fecha) VALUES (3, 1, 2, '2025-01-02');

-- ACTUALIZAR STOCK Y GENERAR VENTA
DELIMITER $$
CREATE PROCEDURE AcStock (IN idTemp INT, IN n1 VARCHAR(50), IN st1 INT)
BEGIN
	UPDATE productos
    SET stock = stock - st1
	WHERE nombre = n1;
    
    -- UPDATE productos
    -- SET idTemp = id
	-- WHERE nombre = n1;
    
    INSERT INTO ventas (id_producto, cantidad, fecha) VALUES (idTemp, st1, sysdate() );
    
    SELECT * FROM ventas;
    SELECT * FROM productos;
END$$
DELIMITER ;

CALL AcStock (1, 'Producto A', 12);


-- CALC VENTAS POR FECHA
DELIMITER $$
CREATE PROCEDURE CalcVentasFech (IN f1 DATE)
BEGIN
    SELECT SUM(cantidad), AVG(fecha)  FROM ventas WHERE fecha = f1; 
END$$
DELIMITER ;

CALL CalcVentasFech ('2025-01-01');

