
USE PcComponentes;

-- selects generales
SELECT * FROM COMPONENTES;

SELECT * FROM ORDENADORES;

SELECT * FROM PERIFERICOS;

-- selec de productos reacondicionados
SELECT p.id_producto, c.nombre_categoria, v.nombre_vendedor, p.nombre_producto, p.estado, p.precio
FROM PRODUCTO p
JOIN CATEGORIA c ON p.id_categoria = c.id_categoria
JOIN VENDEDOR v ON p.id_vendedor = v.id_vendedor
WHERE p.estado = 'reacondicionado';

-- select ordenados por vendedores
SELECT v.nombre_vendedor, p.id_producto, p.nombre_producto, p.estado, p.precio
FROM PRODUCTO p
JOIN VENDEDOR v ON p.id_vendedor = v.id_vendedor
ORDER BY v.nombre_vendedor;

-- select de precio de mallor a menor 
SELECT p.id_producto, c.nombre_categoria, v.nombre_vendedor, p.nombre_producto, p.estado, p.precio
FROM PRODUCTO p
JOIN CATEGORIA c ON p.id_categoria = c.id_categoria
JOIN VENDEDOR v ON p.id_vendedor = v.id_vendedor
ORDER BY p.precio DESC;

-- uso del VIEW que he creado antes este muestra los productos nuevos
SELECT * FROM VISTAUSUNOR;

