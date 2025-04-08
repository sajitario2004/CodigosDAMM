
DROP DATABASE DIA280125;

CREATE DATABASE DIA280125;

USE DIA280125;

CREATE TABLE productos 
( id_producto INT PRIMARY KEY, nombre VARCHAR(50), stock INT );  

-- ventas
CREATE TABLE ventas ( id_venta INT PRIMARY KEY, id_producto INT, cantidad INT, fecha DATE, 
FOREIGN KEY (id_producto) REFERENCES productos(id_producto) );    

INSERT INTO productos (id_producto, nombre, stock) 
VALUES (1, 'Producto A', 100); 

INSERT INTO productos (id_producto, nombre, stock) 
VALUES (2, 'Producto B', 50);

-- PROCEDIMIENTO ACTUALIZAR STOCK
DELIMITER $$
CREATE PROCEDURE Actualizar_Stock (IN idp INT, IN n1 VARCHAR(50) , IN st1 INT)
BEGIN
	UPDATE productos
    SET stock = stock - st1
    WHERE nombre = n1;

    INSERT INTO ventas (id_producto, cantidad, fecha) VALUES (idp, st1, SYSDATE() );
END$$
DELIMITER ;



CALL Actualizar_Stock ('Producto A', 25);

SELECT * FROM productos;
SELECT * FROM ventas;

-- SET SQL_SAFE_UPDATES = 0;
