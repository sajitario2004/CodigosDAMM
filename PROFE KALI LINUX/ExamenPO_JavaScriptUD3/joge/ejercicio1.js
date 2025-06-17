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
        
        atJava.jugadores.push(jugLeticia);
        
        console.log(cdJs);
        console.log(atJava);
        console.log(partido);
        console.log(jugJoseM);
        console.log(jugLeticia);
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
    
    
    console.log(atJava);
    let partidos = [];
    let partido1 = new Partido('Profesor',
    'IES Vega de Mijas',
    cdJs,
    atJava
    );
    
    console.log(partido1);
    partidos.push(partido1);
    
    let partido2 = new Partido('Profesor',
    'PTA',
    atJava,
    cdJs
    );
    console.log(partido2);
    partidos.push(partido2);
    
    console.log(partidos);
    