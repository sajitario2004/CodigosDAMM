DROP DATABASE DIA030225;

CREATE DATABASE DIA030225;

USE DIA030225;

CREATE TABLE clientes (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100),
email VARCHAR(100),
fecha_creacion DATETIME DEFAULT CURRENT_TIMESTAMP,
fecha_modificacion DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

DELIMITER $$
CREATE TRIGGER before_update_clientes
BEFORE UPDATE ON clientes
FOR EACH ROW
BEGIN
SET NEW.fecha_modificacion = NOW();
END $$
DELIMITER ;

-- Insertar un cliente
INSERT INTO clientes (nombre, email) VALUES ('María López', 'maria@example.com');
-- Esperar un momento y luego actualizar su email
UPDATE clientes SET email = 'maria.lopez@example.com' WHERE id = 1;
-- Verificar los campos de fecha
SELECT * FROM clientes WHERE id = 1;

