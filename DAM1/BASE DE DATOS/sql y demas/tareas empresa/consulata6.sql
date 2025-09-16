 -- Dame una consulta con os empleados y sus proyectos de modo que nos aparezcan
 -- TODOS los empleados ordenados descencientemente excepto los que tengan el proyecto Epsilon o el proyecto Zeta.
 
 USE CLASE20250109;
 
 select e.empleado_id, e.nombre AS empleado_nombre, p.proyecto_nombre
 from Empleados e
 left join Proyectos p on e.empleado_id = p.empleado_id
 where p.proyecto_nombre NOT IN ('Proyecto Epsilon', 'Proyecto Zeta') or p.proyecto_nombre is null
 order by e.nombre
 ;
 