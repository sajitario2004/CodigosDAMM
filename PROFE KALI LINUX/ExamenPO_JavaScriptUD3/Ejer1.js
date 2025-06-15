function Equipo(nombre, patrocinador, colorCamisa1, colorCamisa2, categoria){
    this.nombre= nombre;
    this.patrocinador  = patrocinador;
    this.colorCamisa1 = colorCamisa1;
    this.colorCamisa2 = colorCamisa2;
    this.categoria = categoria;
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

function Participante(nombre, apellidos, edad, direccion, telefono){
    this.nombre=nombre;
    this.apellidos=apellidos;
    this.edad=edad;
    this.direccion=direccion;
    this.telefono=telefono;
}

let equipo1 = new Equipo('madrid','mouriño','negro','blanco','primera');
let equipo2 = new Equipo('barsa','pepe','rojo','azul','primera');

let partido1 = new Partido(equipo1, equipo2, 3, 1, 'bernaveu', 'paco');

partido1.crearIncidencia('falta para ronaldo a favor del madrid');
partido1.verResultados();