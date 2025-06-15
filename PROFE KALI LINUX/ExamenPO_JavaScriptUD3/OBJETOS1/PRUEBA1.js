/*
Se quiere diseñar una aplicación para gestionar todos los datos de un campeonato de fútbol sala
que se organiza este año en la ciudad. Aquellos que quieran participar deberán formar un equipo
(nombre, patrocinador, color de la 1ª camiseta, color de la 2ª camiseta, categoría, . . .) e
inscribirse en el campeonato. A medida que transcurran los partidos se irán almacenando los
resultados de éstos, así como qué equipos lo jugaron, en qué campo se jugó, quién lo arbitró y
alguna incidencia que pudiera haber ocurrido (en caso de que no ocurran incidencias no se anotará nada.
Además, los participantes deberán rellenar una ficha de suscripción con algunos datos personales
(nombre, apellidos, edad, dirección, teléfono, . . .)

*/
let cdJs = {
//ESTADO
    nombre: 'CD JS',
    patrocinador: 'vscode',
// camiseta1: 'azul',
// camiseta2: 'blanca',
    camisetas: ['azul', 'blanca'],
    categoria: 'senior',
    jugadores: [],
//COMPORTAMIENTO
    reemplazarJugador: function(jugadorReemplazo, numJugadorReemplazado) {
        this.jugadores[numJugadorReemplazado-1]=jugadorReemplazo;
    }
};

let atJava = {
//ESTADO
    nombre: 'At Java',
    patrocinador: 'oracle',
// camiseta1: 'azul',
// camiseta2: 'blanca',
    camisetas: ['gris', 'negra'],
    categoria: 'senior',
    jugadores: [],
//COMPORTAMIENTO
    reemplazarJugador: function(jugadorReemplazo, numJugadorReemplazado) {
        this.jugadores[numJugadorReemplazado-1]=jugadorReemplazo;
    }
};


let partido = {
//ESTADO
    arbitro: 'Jose',
    campo: 'IES Vega de Mijas',
    equipoLocal: cdJs,
    equipoVisitante: atJava,
    resultado: [0, 0],
    incidencias: [],
//COMPORTAMIENTO
    marcaLocal: function() {
        this.resultado[0]++;
    },
    marcaVisitante: function() {
        this.resultado[1]++;
    },
    grabaIncidencia: function(incidencia) {
        this.incidencias.push(incidencia);
    }
}

partido.incidencias.push('Esto es una incidencia');

let jugJoseM = {
//ESTADO
    nombre: 'Jose M.',
    apellidos: 'Martín Tejero',
    edad: 20,
    direccion: 'C/Portugal, Nº 3, Mijas CP 29651',
    telefono: '0034605235689',
    equipo: cdJs
}

cdJs.jugadores.push(jugJoseM);

let jugLeticia = {
//ESTADO
    nombre: 'Leticia',
    apellidos: 'Bellido Prieto',
    edad: 20,
    direccion: 'C/Los Ángeles, Nº 4, Mijas CP 29651',
    telefono: '0034605235625',
    equipo: atJava
}

cdJs.reemplazarJugador('Eduardo',1)

atJava.jugadores.push(jugLeticia);

/*console.log(cdJs);
console.log(atJava);
console.log(partido);
console.log(jugJoseM);*/
console.log(jugLeticia);