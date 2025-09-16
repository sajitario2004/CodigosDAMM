DROP DATABASE DIA030225;

CREATE DATABASE DIA030225;

USE DIA030225;

CREATE TABLE clientes (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100)
);
CREATE TABLE facturas (
id INT AUTO_INCREMENT PRIMARY KEY,
cliente_id INT,
monto DECIMAL(10,2),
FOREIGN KEY (cliente_id) REFERENCES clientes(id)
);

DELIMITER $$
CREATE TRIGGER before_delete_clientes
BEFORE DELETE ON clientes
FOR EACH ROW
BEGIN
IF EXISTS (SELECT 1 FROM facturas WHERE cliente_id = OLD.id) THEN
SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'No se puede eliminar el cliente
porque tiene facturas asociadas.';
END IF;
END $$
DELIMITER ;


-- Insertar un cliente
INSERT INTO clientes (nombre) VALUES ('Carlos Gómez');
-- Insertar una factura asociada
INSERT INTO facturas (cliente_id, monto) VALUES (1, 150.00);
-- Intentar eliminar el cliente
DELETE FROM clientes WHERE id = 1; -- Esto generará un error
-- Mensaje de error: 'No se puede eliminar el cliente porque tiene facturas asociadas.'