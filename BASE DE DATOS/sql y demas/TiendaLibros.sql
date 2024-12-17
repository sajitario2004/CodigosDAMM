CREATE DATABASE Tienda_Libros;

/*
id INT AUTO_INCREMENT PRIMARY KEY, clave principal
titulo VARCHAR(100),  --- texto
autor VARCHAR(100), -- mas texto
año_publicacion YEAR, -- año
genero VARCHAR(50) mas -- texto 
fecha DATE, -- fecha

varchar significa el numero de caracteres maximos que tiene la celda

*/



/*TD DE LA TABLA*/
CREATE TABLE Tienda_Libros.TD_Cesta(
ID_CESTA INT auto_increment PRIMARY KEY,
Fecha_Cesta date
);

CREATE TABLE Tienda_Libros.TD_Cliente(
ID_CLIENTE INT auto_increment PRIMARY KEY,
NOMBRE_CLIENTE varchar(20),
APELLIDOS_CLIENTE varchar(20),
PROVINCIA_CLIENTE varchar(20),
LOCALIDAD_CLIENTE varchar(20),
DIRECCION_CLIENTE varchar(100),
EMAIL_CLIENTE varchar(50)
);

CREATE TABLE Tienda_Libros.TD_Editorial(
ID_EDITORIAL INT auto_increment PRIMARY KEY,
NOMBRE_EDITORIAL varchar(50),
PROVINCIA_EDITORIAL varchar(50),
LOCALIDAD_EDITORIAL varchar(50),
DIRECCION_EDITORIAL varchar(100),
URL_EDITORIAL varchar(1000)
);



CREATE TABLE Tienda_Libros.TD_Panel(
ID_PANEL INT auto_increment PRIMARY KEY,
LUGAR_PANEL varchar(100),
FECHA_EDICION date,
FECHA_PANEL date
);

CREATE TABLE Tienda_Libros.TD_Libros(
ID_LIBROS INT auto_increment PRIMARY KEY,
TITULO_LIBRO varchar(100),
DESC_LIBRO varchar(100),
ISBN varchar(50),
AÑO_PUBLICACION year,
FOREIGN KEY (ID_ELECTRONICO) references TD_Electronico,
FOREIGN KEY (ID_PANEL) references TD_Panel
);

CREATE TABLE Tienda_Libros.TD_Electronico(
ID_ELECTRONICO INT auto_increment PRIMARY KEY,
TAMAÑO_ELECTRONICO varchar(100),
PRECIO_ELECTRONICO varchar(20)
);

CREATE TABLE Tienda_Libros.TD_Autores(
ID_AUTORES INT auto_increment PRIMARY KEY,
NOMBRE_AUTOR varchar(20),
APELLIDO_AUTOR varchar(20),
PROVINCIA_AUTOR varchar(20),
LOCALIDAD_AUTOR varchar(20),
DIRECION_AUTOR varchar(100),
URL_AUTOR varchar(1000)
);

CREATE TABLE Tienda_Libros.TD_Almacen(
ID_ALMACEN INT auto_increment PRIMARY KEY,
TELEFONO_ALMACEN varchar(20),
PROVINCIA_ALMACEN varchar(20),
LOCALIDAD_ALMACEN varchar(20),
DIRECCION_ALMACEN varchar(100)
);


/*TH DE LA TABLA*/
CREATE TABLE Tienda_Libros.TH_Compra(
FOREIGN KEY (ID_CESTA) references TD_Cesta,
FOREIGN KEY (ID_CLIENTE) references TD_Cliente,
FOREIGN KEY (ID_Libro) references TD_Libro,
CANTIDAD_COPIAS INT
);

CREATE TABLE Tienda_Libros.TH_Almacenes(
FOREIGN KEY (ID_ALMACEN) references TD_Almacen,
FOREIGN KEY (ID_LIBRO) references TD_LIBRO,
NUM_COPIAS INT
);

/*TR DE LA TABLA*/
CREATE TABLE Tienda_Libros.TR_Editoriales(
foreign key (ID_LIBRO) references TD_Libro,
foreign key (ID_EDITORIAL) references TD_Editorial
);

CREATE TABLE Tienda_Libros.TR_Autores(
foreign key (ID_LIBRO) references TD_Libro,
foreign key (ID_AUTOR) references TD_Autor
);

/*Mostrar datos por pantalla*//*
SELECT Tienda_Libros.TD_Cesta,
FROM prestamos
JOIN libros ON prestamos.id_libro = libros.id;
*/