//Funcion constructora
function Equipo(nombre, patrocinador, camisetas, categoria, jugadores ) {
//this = {};
    this.nombre = nombre;
    this.patrocinador = patrocinador;
    this.camisetas = camisetas;
    this.categoria = categoria;
    this.jugadores = jugadores;
//return this;
}
Equipo.prototype.mmarcaLocal = function() {
    this.resultado[0]++;
};
Equipo.prototype.marcaVisitante = function() {
    this.resultado[1]++;
};
Equipo.prototype.grabaIncidencia = function(incidencia) {
    this.incidencias.push(incidencia);
}

function Partido(arbitro, campo, equipoLocal, equipoVisitante) {
//this = {};
    this.arbitro=arbitro;
    this.campo=campo;
    this.equipoLocal=equipoLocal;
    this.equipoVisitante=equipoVisitante;
    this.resultado = [0, 0];
    this.incidencias = [];
    this.mmarcaLocal = function() {
        this.resultado[0]++;
    },
        
    this.marcaVisitante = function() {
        this.resultado[1]++;
     },

    this.grabaIncidencia = function(incidencia) {
        this.incidencias.push(incidencia);
    }
//return this;
}

let cdJs = new Equipo('CD JS',
    'vscode',
    ['azul', 'blanca'],
    'senior',
    []
);
console.log(cdJs);


let atJava = new Equipo('At Java',
    'oracle',
    ['gris', 'negra'],
    'senior',
    []
);

console.log(atJava);
let partidos = [];
let partido1 = new Partido('Profesor',
    'IES Vega de Mijas',
    cdJs,
    atJava
);

console.log(partido1);
partidos.push(partido1);

let partido2 = new Partido(
    'Profesor',
    'PTA',
    atJava,
    cdJs
);

console.log(partido2);
partidos.push(partido2);

console.log(partidos);

