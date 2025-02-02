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

let equipoMadrid = {
    //Estado del objeto
    nombre: 'Madrid',
    patrocinador: 'España',
    coloresCamisa:['blanca','negra'],
    categoria: 'senior',
    jugadores:  [],
    cambiarJugadores:function(numeroDelJugador, nombreDelJugador) {
        this.jugadores[numeroDelJugador-1] = nombreDelJugador;
    },
    anadirJugadores: function(nombreJugadorNuevo){
        this.jugadores.push(nombreJugadorNuevo)
    }
};

equipoMadrid.anadirJugadores('pepito1')
equipoMadrid.anadirJugadores('Manuel2')

equipoMadrid.cambiarJugadores(1, 'pepito2')

console.log(equipoMadrid)

let equipoBacelona = {
//ESTADO
    nombre: 'Barcelona',
    patrocinador: 'España',
    camisetas: ['roja y azul', 'roja'],
    categoria: 'senior',
    jugadores: []
};

let partido1 = {
    arbitro:'manolo',
    equipoQueJuega1: equipoBacelona,
    equipoQueJuega2: equipoMadrid,
    resultado: [0, 0],
    incidencias: []
};

/*
console.log(equipoMadrid)
console.log(equipoBacelona)*/
