DROP DATABASE IF EXISTS empresa;

CREATE DATABASE IF NOT EXISTS empresa ;

USE empresa;
CREATE TABLE TD_DEPARTAMENTOS (
    id_departamento INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    ubicacion VARCHAR(100)
);

CREATE TABLE TD_EMPLEADOS (
    id_empleado INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    fecha_contratacion DATE NOT NULL,
    salario DECIMAL(10,2) NOT NULL,
    id_departamento INT,
    FOREIGN KEY (id_departamento) REFERENCES TD_DEPARTAMENTOS(id_departamento)
);

INSERT INTO TD_DEPARTAMENTOS (nombre, ubicacion) VALUES
('Recursos Humanos', 'Madrid'),
('Desarrollo', 'Barcelona'),
('Ventas', 'Valencia');

INSERT INTO TD_EMPLEADOS (nombre, apellido, fecha_contratacion, salario, id_departamento) VALUES
('Ana', 'López', '2022-05-10', 2500.00, 1),
('Carlos', 'García', '2021-03-15', 3200.00, 2),
('María', 'Fernández', '2023-01-20', 2800.00, 3);

SELECT e.id_empleado, e.nombre, e.apellido, e.salario, d.nombre AS departamento, d.ubicacion
FROM TD_EMPLEADOS e
JOIN TD_DEPARTAMENTOS d ON e.id_departamento = d.id_departamento;
