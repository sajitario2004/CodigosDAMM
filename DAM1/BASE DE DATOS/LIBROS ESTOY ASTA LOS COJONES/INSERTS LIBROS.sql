-- Insertar datos en la tabla Autores
INSERT INTO Autores (AutorID, Nombre, Nacionalidad, FechaNacimiento) VALUES 
(1, 'Gabriel Garcia Marquez', 'Colombiano', '1927-03-06'),
(2, 'J.K. Rowling', 'Británica', '1965-07-31'),
(3, 'Carlos Ruiz Zafon', 'Español', '1964-06-25'),
(4, 'Isabel Allende', 'Chilena', '1942-08-02'),
(5, 'F. Scott Fitzgerald', 'Estadounidense', '1896-09-24'),
(6,'Juan Gomez Jurado','Español','1977-12-16');

-- Insertar datos en la tabla Editoriales
INSERT INTO Editoriales (EditorialID, Nombre, Pais) VALUES 
(1, 'Penguin Random House', 'USA'),
(2, 'HarperCollins', 'USA'),
(3, 'Simon & Schuster', 'USA'),
(4, 'Macmillan', 'UK'),
(5, 'Hachette Livre', 'France');

-- Insertar datos en la tabla Categorias
INSERT INTO Categorias (CategoriaID, Nombre) VALUES 
(1, 'Novela'),
(2, 'Fantasía'),
(3, 'Ciencia Ficción'),
(4, 'Historia'),
(5, 'Literatura Juvenil'),
(6, 'Ficción'),
(7, 'Romantica');

-- Insertar datos en la tabla Usuarios
INSERT INTO Usuarios (UsuarioID, Nombre, Email, FechaRegistro) VALUES 
(1, 'Juan Perez', 'juan@example.com', '2023-01-10'),
(2, 'Maria Lopez', 'maria@example.com', '2023-02-15'),
(3, 'Carlos Ruiz', 'carlos@example.com', '2023-03-20'),
(4, 'Ana Martinez', 'ana@example.com', '2023-04-25'),
(5, 'Luis Fernandez', 'luis@example.com', '2023-05-30');

-- Insertar datos en la tabla Libros
INSERT INTO Libros (LibroID, Titulo, AutorID, EditorialID, CategoriaID, AñoPublicacion) VALUES 
(1, 'Cien años de soledad', 1, 1, 1, 1967),
(2, 'Harry Potter y la piedra filosofal', 2, 2, 2, 1997),
(3, '1984', 3, 3, 3, 1949),
(4, 'La casa de los espíritus', 4, 4, 1, 1982),
(5, 'El gran Gatsby', 5, 5, 1, 1925);

-- Insertar datos en la tabla Prestamos
INSERT INTO Prestamos (PrestamoID, LibroID, UsuarioID, FechaPrestamo, FechaDevolucion) VALUES 
(1, 1, 1, '2023-01-15', '2023-01-25'),
(2, 2, 2, '2023-02-20', '2023-03-01'),
(3, 3, 3, '2023-03-25', '2023-04-05'),
(4, 4, 9, '2023-04-30', '2023-05-10'),
(5, 6, 6, '2023-07-30', '2023-05-10'),
(6, 9, 20, '2023-07-30', '2023-05-10'),
(7, 5, 5, '2023-06-05', '2023-06-15');

-- Insertar datos en la tabla Reseñas
INSERT INTO Reseñas (ReseñaID, LibroID, UsuarioID, Calificacion, Comentario, FechaReseña) VALUES 
(1, 1, 1, 5, 'Excelente libro', '2023-01-20'),
(2, 2, 2, 4, 'Muy entretenido', '2023-02-25'),
(3, 3, 3, 5, 'Un clásico imperdible', '2023-03-30'),
(4, 4, 4, 4, 'Muy bien escrito', '2023-05-05'),
(5, 5, 5, 5, 'Una obra maestra', '2023-06-10'),
(6, 5, 5, 5, 'Buena', '2023-07-10'),
(7, 5, 4, 5, 'Mejorable', '2023-07-10'),
(8, 1, 3, 4, 'Los hay mejores', '2023-07-10'),
(9, 2, 3, 4, 'Los hay mejores', '2023-07-10'),
(10, 1, 2, 2, 'Los hay mejores', '2023-07-10');