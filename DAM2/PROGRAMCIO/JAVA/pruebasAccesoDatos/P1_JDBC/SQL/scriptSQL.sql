DROP DATABASE IF EXISTS TCG;
CREATE DATABASE TCG;
USE TCG;

CREATE TABLE informacion_jugador (
    nombre_jugador VARCHAR(50) PRIMARY KEY
);

CREATE TABLE buscaminas (
    nombre_jugador VARCHAR(50),
    tiempo_finalizacion TIME
);

CREATE TABLE cara_o_cruz (
	nombre_jugador VARCHAR(50),
    victorias INT,
    derrotas INT
);

CREATE TABLE juego_serpiente (
    nombre_jugador VARCHAR(50),
    puntuacion INT
);

ALTER TABLE buscaminas ADD FOREIGN KEY (nombre_jugador) REFERENCES informacion_jugador(nombre_jugador);

ALTER TABLE cara_o_cruz ADD FOREIGN KEY (nombre_jugador) REFERENCES informacion_jugador(nombre_jugador);

ALTER TABLE juego_serpiente ADD FOREIGN KEY (nombre_jugador) REFERENCES informacion_jugador(nombre_jugador);
 
 
INSERT INTO informacion_jugador VALUES ('Carlos'), ('Lucía'), ('Miguel');

INSERT INTO buscaminas VALUES 
('Carlos', '00:02:45'),
('Lucía', '00:03:10');

INSERT INTO cara_o_cruz VALUES 
('Carlos', 5, 3),
('Lucía', 2, 6),
('Miguel', 7, 4);

INSERT INTO juego_serpiente VALUES 
('Carlos', 1200),
('Lucía', 850),
('Miguel', 2000);
