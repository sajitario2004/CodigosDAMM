CREATE DATABASE CLASE20250109;
USE CLASE20250109;

CREATE TABLE Empleados (
    empleado_id INT PRIMARY KEY,
    nombre VARCHAR(50),
    departamento_id INT
);

CREATE TABLE Departamentos (
    departamento_id INT PRIMARY KEY,
    departamento_nombre VARCHAR(50)
);

CREATE TABLE Proyectos (
    proyecto_id INT PRIMARY KEY,
    empleado_id INT,
    proyecto_nombre VARCHAR(50)
);

-- Datos para la tabla Empleados
INSERT INTO Empleados (empleado_id, nombre, departamento_id) VALUES (1, 'Carlos', 1);
INSERT INTO Empleados (empleado_id, nombre, departamento_id) VALUES (2, 'Ana', 2);
INSERT INTO Empleados (empleado_id, nombre, departamento_id) VALUES (3, 'Luis', 4);
INSERT INTO Empleados (empleado_id, nombre, departamento_id) VALUES (4, 'Marta', 1);
INSERT INTO Empleados (empleado_id, nombre, departamento_id) VALUES (5, 'Jorge', 2);
INSERT INTO Empleados (empleado_id, nombre, departamento_id) VALUES (6, 'Elena', 4);
INSERT INTO Empleados (empleado_id, nombre, departamento_id) VALUES (7, 'Andrés', 1);
INSERT INTO Empleados (empleado_id, nombre, departamento_id) VALUES (8, 'Laura', 2);
INSERT INTO Empleados (empleado_id, nombre, departamento_id) VALUES (11, 'Tomás', 4);
INSERT INTO Empleados (empleado_id, nombre, departamento_id) VALUES (12, 'Isabel', 1);

-- Datos para la tabla Departamentos
INSERT INTO Departamentos (departamento_id, departamento_nombre) VALUES (1, 'Recursos Humanos');
INSERT INTO Departamentos (departamento_id, departamento_nombre) VALUES (2, 'Marketing');
INSERT INTO Departamentos (departamento_id, departamento_nombre) VALUES (3, 'Finanzas');

-- Datos para la tabla Proyectos
INSERT INTO Proyectos (proyecto_id, empleado_id, proyecto_nombre) VALUES (1, 1, 'Proyecto Alpha');
INSERT INTO Proyectos (proyecto_id, empleado_id, proyecto_nombre) VALUES (2, 2, 'Proyecto Beta');
INSERT INTO Proyectos (proyecto_id, empleado_id, proyecto_nombre) VALUES (3, 30, 'Proyecto Gamma');
INSERT INTO Proyectos (proyecto_id, empleado_id, proyecto_nombre) VALUES (4, 4, 'Proyecto Delta');
INSERT INTO Proyectos (proyecto_id, empleado_id, proyecto_nombre) VALUES (5, 5, 'Proyecto Epsilon');
INSERT INTO Proyectos (proyecto_id, empleado_id, proyecto_nombre) VALUES (6, 6, 'Proyecto Zeta');
INSERT INTO Proyectos (proyecto_id, empleado_id, proyecto_nombre) VALUES (7, 70, 'Proyecto Eta');
INSERT INTO Proyectos (proyecto_id, empleado_id, proyecto_nombre) VALUES (8, 8, 'Proyecto Theta');
INSERT INTO Proyectos (proyecto_id, empleado_id, proyecto_nombre) VALUES (9, 90, 'Proyecto Iota');
INSERT INTO Proyectos (proyecto_id, empleado_id, proyecto_nombre) VALUES (10, 10, 'Proyecto Kappa');
