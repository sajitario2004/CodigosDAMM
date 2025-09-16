
USE PcComponentes;

INSERT INTO CATEGORIA (nombre_categoria) VALUES 
('Componentes'),
('Ordenadores'),
('Perifericos');

INSERT INTO VENDEDOR (nombre_vendedor, telefono, email) VALUES 
('Pc Componentes', '678 989 898', 'soporte@pccomponentes.com'),
('Panchitos Marcket', '615 112 623', 'tiendapanchitos@sgmail.com');

-- Procesador Intel i7 (Componente)
CALL INSERTNUEVOPRODUCTO(
    1, -- id_categoria (COMPONENTES)
    1, -- id_vendedor (PcComponnetes)
    'Procesador Intel i7',-- nombre_producto
    'nuevo', -- estado
    'potente procesador para gaming',-- caracteristicas
    300.00, -- precio
    20.00, -- descuneto 
    'Procesador', -- tipo_especifico (para COMPONENTES)
    '8 nucleos, 16 hilos, frecuencia base 3.6GHz, caché 16MB' -- especificaciones_tecnicas
);

-- Laptop HP Pavilion (Ordenador)
CALL INSERTNUEVOPRODUCTO(
    2, -- (ORDENADORES)
    1,
    'Portatil HP ',
    'reacondicionado',
    'para trabajo y estudio',
    600.00,
    20.00,
    'Portatil',
    'Pantalla 15.6 pulgadas, 16GB RAM, SSD 512GB, graficos integrados Intel Iris Xe'
);

-- teclado mecanico RGB (periferico)
CALL INSERTNUEVOPRODUCTO(
    3, -- (PERIFERICOS)
    2, -- id_vendedor (Panchitos)
    'Teclado mecanico RGB',
    'nuevo',
    'Teclado profesional para gamers',
    80.00,
    35.00,
    'Teclado',
    'Switches Cherry MX Red, retroiluminacion RGB, teclas anti-gosting'
);
