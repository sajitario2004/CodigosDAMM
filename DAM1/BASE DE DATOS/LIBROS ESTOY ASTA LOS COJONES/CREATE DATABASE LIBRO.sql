DROP DATABASE PRUEBACLASE20250116;

CREATE DATABASE PRUEBACLASE20250116;

USE PRUEBACLASE20250116;

CREATE TABLE Autores (
    AutorID INT PRIMARY KEY,
    Nombre VARCHAR(100),
    Nacionalidad VARCHAR(50),
    FechaNacimiento DATE
);


CREATE TABLE Editoriales (
    EditorialID INT PRIMARY KEY,
    Nombre VARCHAR(100),
    Pais VARCHAR(50)
);

CREATE TABLE Categorias (
    CategoriaID INT PRIMARY KEY,
    Nombre VARCHAR(50)
);

CREATE TABLE Libros (
    LibroID INT PRIMARY KEY,
    Titulo VARCHAR(100),
    AutorID INT,
    EditorialID INT,
    CategoriaID INT,
    AñoPublicacion YEAR,
    FOREIGN KEY (AutorID) REFERENCES Autores(AutorID),
    FOREIGN KEY (EditorialID) REFERENCES Editoriales(EditorialID),
    FOREIGN KEY (CategoriaID) REFERENCES Categorias(CategoriaID)
);


CREATE TABLE Usuarios (
    UsuarioID INT PRIMARY KEY,
    Nombre VARCHAR(100),
    Email VARCHAR(100),
    FechaRegistro DATE
);

CREATE TABLE Prestamos (
    PrestamoID INT PRIMARY KEY,
    LibroID INT,
    UsuarioID INT,
    FechaPrestamo DATE,
    FechaDevolucion DATE
);

CREATE TABLE Reseñas (
    ReseñaID INT PRIMARY KEY,
    LibroID INT,
    UsuarioID INT,
    Calificacion INT,
    Comentario TEXT,
    FechaReseña DATE
);
