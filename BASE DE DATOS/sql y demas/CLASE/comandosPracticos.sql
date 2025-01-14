-- DARA LA NOTA MAXIMA DE CADA ALUMNO
SELECT ALUMNOS, max(NOTA)
FROM NOTAS
GROUP BY ALUMNOS;

-- avg dara una media de las notas de cada alumno
SELECT ALUMNOS, avg(NOTA)
FROM NOTAS
GROUP BY ALUMNOS;

-- dara una media de las notas de cada asignatura
SELECT ASIGNATURAS, avg(NOTA)
FROM NOTAS
GROUP BY ASIGNATURAS
-- EL having solo mostrara los numeros que sean superiores al 8 en este ejemplo 
-- se utiliza despues del 'group by' al contrario que el where
HAVING AVG(NOTA)>8;

-- dame la nota media de la asignatura que tenga mas de 2 alumnos
SELECT ASIGNATURAS, avg(NOTA)
FROM NOTAS
GROUP BY ASIGNATURAS
having count(alumnos)>2;

--    AVG. Devuelve el promedio de los valores en una columna. Por ejemplo, si tenía seis filas con una columna que contenía un precio, las seis filas se sumarían y se dividirían entre seis para conseguir el promedio. Si se especifica el calificador DISTINCT, sólo se realizará la media de los valores distintos; si las seis filas sólo contuviesen cuatro precios distintos, estos cuatro se sumarían y se dividirían entre cuatro para proporcionar una media.
--    COUNT. Cuenta el número de filas que contienen un valor que no sea nulo en una columna. Si se especifica el calificador DISTINCT, sólo se contarán los valores distintos.
--    MAX. Devuelve el valor máximo que las filas tienen en una determinada columna. Se puede seleccionar el calificador DISTINCT, pero no afecta a esta función.
--    MIN. Devuelve el valor mínimo que las filas tienen en una determinada columna. Se puede seleccionar el calificador DISTINCT, pero no afecta a esta función.
--    STDDEV. Devuelve la desviación del estándar para un conjunto de números.
--    VARIANCE. Devuelve la variación para un conjunto de números.


-- SELECT nombre
-- FROM CLASE20250109

-- DELETE FROM CLASE20250109.Cliente
-- WHERE nombre = 'fernando';
-- SET SQL_SAFE_UPDATES = 0


select distinct ASIGNATURAS
from NOTAS;




