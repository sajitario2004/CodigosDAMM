DROP DATABASE DIA030225;

CREATE DATABASE DIA030225;

USE DIA030225;

CREATE TABLE empleados (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100),
puesto VARCHAR(100),
salario DECIMAL(10,2)
);
CREATE TABLE auditoria_empleados (
id INT AUTO_INCREMENT PRIMARY KEY,
empleado_id INT,
accion VARCHAR(10),
nombre VARCHAR(100),
puesto VARCHAR(100),
salario DECIMAL(10,2),
usuario VARCHAR(100),
fecha DATETIME
);

DELIMITER $$
CREATE TRIGGER after_insert_empleados
AFTER INSERT ON empleados
FOR EACH ROW
BEGIN
INSERT INTO auditoria_empleados (
empleado_id, accion, nombre, puesto, salario, usuario, fecha
) VALUES (
NEW.id, 'INSERT', NEW.nombre, NEW.puesto, NEW.salario, USER(), NOW()
);
END $$
DELIMITER ;

DELIMITER $$
CREATE TRIGGER after_update_empleados
AFTER UPDATE ON empleados
FOR EACH ROW
BEGIN
INSERT INTO auditoria_empleados (
empleado_id, accion, nombre, puesto, salario, usuario, fecha
) VALUES (
NEW.id, 'UPDATE', NEW.nombre, NEW.puesto, NEW.salario, USER(), NOW()
);
END $$
DELIMITER ;

DELIMITER $$
CREATE TRIGGER after_delete_empleados
AFTER DELETE ON empleados
FOR EACH ROW
BEGIN
INSERT INTO auditoria_empleados (

empleado_id, accion, nombre, puesto, salario, usuario, fecha
) VALUES (
OLD.id, 'DELETE', OLD.nombre, OLD.puesto, OLD.salario, USER(), NOW()
);
END $$
DELIMITER ;

-- Insertar un empleado
INSERT INTO empleados (nombre, puesto, salario) VALUES ('Laura Jiménez', 'Gerente',
5000.00);
-- Actualizar el salario del empleado
UPDATE empleados SET salario = 5500.00 WHERE id = 1;
-- Eliminar el empleado
DELETE FROM empleados WHERE id = 1;
-- Verificar los registros en la tabla de auditoría
SELECT * FROM auditoria_empleados ORDER BY fecha ASC;