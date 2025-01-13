USE CLASE20250109;

CREATE TABLE Clientes 
( cliente_id INT PRIMARY KEY, 
nombre VARCHAR(50), 
direccion VARCHAR(100) ); 

CREATE TABLE Pedidos 
( pedido_id INT PRIMARY KEY, 
cliente_id INT, pedido VARCHAR(50) );

-- Datos para la tabla Clientes
INSERT INTO Clientes (cliente_id, nombre, direccion) VALUES (1, 'Alice', 'Calle A');
INSERT INTO Clientes (cliente_id, nombre, direccion) VALUES (2, 'Bob', 'Calle B');
INSERT INTO Clientes (cliente_id, nombre, direccion) VALUES (3, 'Carlos', 'Calle C');
INSERT INTO Clientes (cliente_id, nombre, direccion) VALUES (4, 'Diana', 'Calle D');
INSERT INTO Clientes (cliente_id, nombre, direccion) VALUES (5, 'Eva', 'Calle E');
INSERT INTO Clientes (cliente_id, nombre, direccion) VALUES (6, 'Fernando', 'Calle F');
INSERT INTO Clientes (cliente_id, nombre, direccion) VALUES (7, 'Gloria', 'Calle G');
INSERT INTO Clientes (cliente_id, nombre, direccion) VALUES (8, 'Hector', 'Calle H');
INSERT INTO Clientes (cliente_id, nombre, direccion) VALUES (9, 'Irene', 'Calle I');
INSERT INTO Clientes (cliente_id, nombre, direccion) VALUES (10, 'Juan', 'Calle J');

-- Datos para la tabla Pedidos
INSERT INTO Pedidos (pedido_id, cliente_id, pedido) VALUES (1, 1, 'Pedido 1');
INSERT INTO Pedidos (pedido_id, cliente_id, pedido) VALUES (2, 1, 'Pedido 2');
INSERT INTO Pedidos (pedido_id, cliente_id, pedido) VALUES (3, 12, 'Pedido 3');
INSERT INTO Pedidos (pedido_id, cliente_id, pedido) VALUES (4, 3, 'Pedido 4');
INSERT INTO Pedidos (pedido_id, cliente_id, pedido) VALUES (5, 15, 'Pedido 5');
INSERT INTO Pedidos (pedido_id, cliente_id, pedido) VALUES (6, 6, 'Pedido 6');
INSERT INTO Pedidos (pedido_id, cliente_id, pedido) VALUES (7, 7, 'Pedido 7');
INSERT INTO Pedidos (pedido_id, cliente_id, pedido) VALUES (8, 18, 'Pedido 8');
INSERT INTO Pedidos (pedido_id, cliente_id, pedido) VALUES (9, 9, 'Pedido 9');
INSERT INTO Pedidos (pedido_id, cliente_id, pedido) VALUES (10, 10, 'Pedido 10');
