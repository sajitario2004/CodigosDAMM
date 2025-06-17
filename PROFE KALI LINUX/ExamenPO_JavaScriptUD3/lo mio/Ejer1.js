function Equipo(nombre, patrocinador, colorCamisa1, colorCamisa2, categoria){
    this.nombre= nombre;
    this.patrocinador  = patrocinador;
    this.colorCamisa1 = colorCamisa1;
    this.colorCamisa2 = colorCamisa2;
    this.categoria = categoria;
    this.jugadores = [];

    this.anadirJugador = function(jugador){
        this.jugadores.push(jugador);
    }

    this.verJugadores = function(){
        console.log(this.jugadores);
    }
}

function Partido(equipo1, equipo2, golesEquipo1, golesEquipo2, campo, arbitro){
    this.equipo1=equipo1;
    this.equipo2=equipo2;
    this.golesEquipo1=golesEquipo1;
    this.golesEquipo2=golesEquipo2;
    this.campo=campo;
    this.arbitro=arbitro;
    this.incidencias=[];

    this.crearIncidencia = function(incidencia){
        this.incidencias.push(incidencia);
    }

    this.verResultados = function(){
        console.log('han jugado los equipos: '+ this.equipo1.nombre+ " contra " + this.equipo2.nombre+' y han quedado '+this.golesEquipo1+' a '+this.golesEquipo2 )
        console.log('se ha jugado en el campo: ' + this.campo)
        console.log('con el arbitro ' + this.arbitro)
        console.log('y las incidencias an sido'+this.incidencias)
    }
}

function Jugador(nombre, apellidos, edad, direccion, telefono){
    this.nombre=nombre;
    this.apellidos=apellidos;
    this.edad=edad;
    this.direccion=direccion;
    this.telefono=telefono;
}

function Campeonato(nombreCiudad, año){
    this.nombreCiudad= nombreCiudad;
    this.año=año;
    this.equipos=[];
    this.partidos=[];

    this.almacenarPartido = function(partido){
        this.partidos.push(partido);
    };

    this.almacenarEquipos = function(equipo) {
        this.equipos.push(equipo);
    };


    this.listarEquipos = function(){
        console.log(this.equipos);
    };

    this.listarPartidos = function(){
        console.log(this.partidos);
    };
}

let campeonato2025 = new Campeonato('madrid', 2025);

let cristiano = new Jugador('cristiano', 'ronaldo', 37, 'portugal su barrio', 670287267)
let mesi = new Jugador('mesi', 'goti', 35, 'argentina su barrio', 651618568)

let equipo1 = new Equipo('madrid','mouriño','negro','blanco','primera');
let equipo2 = new Equipo('barsa','pepe','rojo','azul','primera');

equipo1.anadirJugador(cristiano);
equipo2.anadirJugador(mesi);

equipo1.verJugadores();
equipo2.verJugadores();

console.log('\n');

let partido1 = new Partido(equipo1, equipo2, 3, 1, 'bernaveu', 'paco');
partido1.crearIncidencia('falta para ronaldo a favor del madrid');


partido1.verResultados();

campeonato2025.almacenarEquipos(equipo1);
campeonato2025.almacenarEquipos(equipo2);
campeonato2025.almacenarPartido(partido1);

campeonato2025.listarEquipos();
campeonato2025.listarPartidos();

