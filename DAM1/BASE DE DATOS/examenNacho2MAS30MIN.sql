use PRUEBACLASE20250116;

-- 7 Drop de la base de datos anterior

-- DROP DATABASE PRUEBA1CLASE;

-- 8 Generar el codigo correcto 

-- 1. (0,5 puntos) Consulta que devuelva el nombre, nacionalidad y fecha de nacimiento de todos los autores.
SELECT Nombre, Nacionalidad, FechaNacimiento

FROM Autores;


-- 2. (0,5 puntos) Consulta que devuelva los nombres de todos los usuarios
SELECT Nombre
FROM Usuarios;


-- 3. (0,5 puntos) Consulta que devuelva los títulos de los libros con su año de publicación en loscuales el año de publicación sea mayor o igual a 2020

SELECT Titulo, Añopublicacion
From Libros
WHERE Añopublicacion > 2019;


-- 4. (0,5 puntos) Consulta que devuelva los nombres de los autores que sean de habla hispana.
select Nombre, Nacionalidad
FROM Autores
WHERE Nacionalidad != 'Britanica'&& Nacionalidad != 'Estadounidense';



-- 5. (0,5 puntos) Consulta que devuelva los nombres de todos los autores españoles.

select Nombre, Nacionalidad
FROM Autores
WHERE Nacionalidad = 'Español';

-- 6. (0,5 puntos) Consulta que devuelva los usuarios cuya fecha registro contenga el mes de enero.

SELECT Nombre, Fecharegistro
FROM Usuarios
WHERE MONTH(fecharegistro) = 1;


-- 7. (0,5 puntos) Consulta que devuelva los nombres de los autores ordenados alfabéticamente.

SELECT  Nombre
FROM Autores
ORDER BY Nombre ASC;

-- 8. (0,5 puntos) Consulta que devuelva los nombres de los autores ordenados de mas antiguo a más reciente filtrando aquellos que tengan menos de 100 años desde su nacimiento.
SELECT a.Nombre, a.FechaNacimiento
FROM Autores a
WHERE YEAR('2025-01-20') - YEAR(a.FechaNacimiento) < 100
ORDER BY a.FechaNacimiento;



-- 9. (0,5 puntos) Consulta que devuelva los títulos de los libros, nombre del autor y fecha de nacimiento del autor de los libros.

SELECT Autores.Nombre, Autores.AutorID , Autores.FechaNacimiento,  Libros.Titulo
FROM Autores
INNER JOIN Libros ON Autores.AutorID  = Libros.AutorId;


-- 10. (0,5 puntos) Consulta que devuelva los títulos de los libros que tengan una valoración en la reseña entre 2 y 4.

SELECT Libros.Titulo, Reseñas.Calificacion
FROM Libros
INNER JOIN Reseñas ON  Reseñas.LibroID = Libros.LibroID
WHERE Calificacion < 5 && Calificacion > 1;

-- 11. (0,5 puntos) Consulta que contenga las fechas de entrega y devolución, nombres de los usuarios que toma el préstamo y el título del libro que toma.
SELECT Usuarios.Nombre, Libros.Titulo, Prestamos.FechaPrestamo, Prestamos.FechaDevolucion
FROM  Prestamos 
JOIN Usuarios  ON Prestamos.UsuarioID = Usuarios.UsuarioID
JOIN Libros ON Prestamos.LibroID = Libros.LibroID;


-- 12. (0,5 puntos) Consulta que devuelta todos los préstamos con los títulos de los libros y nombres de usuario que los toma.
SELECT  u.Nombre , l.Titulo 
FROM Prestamos p
JOIN Usuarios u ON p.UsuarioID = u.UsuarioID
JOIN Libros l ON p.LibroID = l.LibroID;

-- 13. (0,5 puntos) Consulta que devuelva todas las categorías y los títulos de los libros asociadas a ellas.
SELECT  c.Nombre, l.Titulo 
FROM Categorias c
JOIN Libros l ON c.CategoriaID = l.CategoriaID;

-- 14. (0,5 puntos) Consulta que devuelva todos los títulos de los libros con el nombre y nacionalidad del autor que los escribe, el país de la editorial que los produce y el nombre de la categoría.
SELECT l.Titulo , a.Nombre , a.Nacionalidad , e.Pais , c.Nombre 
FROM Libros l
JOIN Autores a ON l.AutorID = a.AutorID
JOIN Editoriales e ON l.EditorialID = e.EditorialID
JOIN Categorias c ON l.CategoriaID = c.CategoriaID;

-- 15. (0,5 puntos) Consulta que agrupe por LibroID y nos indique su máximo y mínimo de las calificaciones.
SELECT LibroID, MAX(Calificacion), MIN(Calificacion)
FROM Reseñas
GROUP BY LibroID;

-- 16. (0,5 puntos) Consulta que nos devuelva el nombre de los usuarios con la media de las calificaciones que han añadido en sus reseñas.
SELECT u.Nombre, AVG(r.Calificacion)
FROM Reseñas r
JOIN Usuarios u ON r.UsuarioID = u.UsuarioID
GROUP BY u.Nombre;

-- 17. (0,5 puntos) Consulta que devuelva los títulos de los libros que toma en préstamo Ana Martínez.
SELECT l.Titulo
FROM Prestamos p
JOIN Usuarios u ON p.UsuarioID = u.UsuarioID
JOIN Libros l ON p.LibroID = l.LibroID
WHERE u.Nombre = 'Ana Martinez';
-- no tiene prestamos creo 

-- 18. (0,5 puntos) Consulta que devuelva los títulos de los libros cuya media sea superior a 4.


SELECT l.Titulo, AVG(r.Calificacion)
FROM Libros l
JOIN Reseñas r ON l.LibroID = r.LibroID

-- Este GROUP BY es obligatorio por algo de un error que me da que si no lo pongo no va 
GROUP BY l.LibroID
HAVING AVG(r.Calificacion) > 4;




-- 19. (0,5 puntos) Consulta que devuelva los títulos cuyo libros tengan al menos dos reseñas acompañado de la media de sus calificaciones.
-- No me he acordado de AS asta ahora que me ha salido buscando cosas del having
SELECT l.Titulo,AVG(r.Calificacion) AS MediaCalificacion
FROM Libros l
JOIN Reseñas r ON l.LibroID = r.LibroID
GROUP BY l.LibroID
HAVING COUNT(r.ReseñaID) >= 2;

-- 20. (0,5 puntos) Consulta que devuelva los libros con los nombres de sus categorías y que nos agrupe en caso de ser novela, historia o romantica lo consideremos en un campo nuevo como
-- “Para Adultos” y los demás como “Para niños”