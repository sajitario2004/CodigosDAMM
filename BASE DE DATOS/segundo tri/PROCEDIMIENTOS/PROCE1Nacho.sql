DROP DATABASE DIA270125;
CREATE DATABASE DIA270125;
USE DIA270125;

-- VARIABLES DATOS
CREATE TABLE empleados (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(50),
puesto VARCHAR(50),
salario DECIMAL(10, 2)
);

-- procedimientos 1 INSERTAR DATOS
DELIMITER $$
CREATE PROCEDURE Insertar_Empleado (IN n1 VARCHAR(50), IN p1 VARCHAR(50), IN s1 DECIMAL(10, 2))
BEGIN

	INSERT INTO DIA270125.empleados (nombre, puesto, salario) VALUE (n1, p1, s1);
END$$
DELIMITER ;

CALL Insertar_Empleado ('nacho' , 'informatico', 25); 


-- procedimientos  2 ACTURALIZAR TABLA
DELIMITER $$
CREATE PROCEDURE Actualizar_Salario (IN id1 INT, IN n1 VARCHAR(50), IN p1 VARCHAR(50), IN s1 DECIMAL(10, 2))
BEGIN 
	UPDATE empleados
	SET nombre = n1, salario= s1
	WHERE id = id1;
END$$
DELIMITER ;

-- DROP PROCEDURE nombreProcedimiento; -- esto elimina un procedimiento si ya ha sido creado
CALL Actualizar_Salario (1, 'nacho', 'informatico', 32);


SELECT * FROM empleados;


