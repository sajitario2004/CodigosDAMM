 -- Dame una consulta con todos los empleados con sus proyectos ordenándolos por el nombre de su proyecto. --
 USE CLASE20250109;
 
SELECT e.empleado_id, e.nombre AS empleado_nombre, p.proyecto_nombre
FROM Empleados e
JOIN Proyectos p ON e.empleado_id = p.empleado_id
ORDER BY p.proyecto_nombre;



