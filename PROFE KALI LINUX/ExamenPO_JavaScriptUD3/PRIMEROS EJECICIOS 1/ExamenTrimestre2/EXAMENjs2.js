
function Bicicletas(matricula, marchas, color, cesta, averia){
    this.matricula = matricula;
    this.marchas = marchas;
    this.color = color;
    this.cesta = cesta;
    this.averia = averia;

}

function Usuarios(dni, nombre, apellidos, email, dob, tlf, numeroDeCuenta){
    this.dni = dni;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.email = email;
    this.dob = dob;
    this.tlf = tlf;
    this.numeroDeCuenta = numeroDeCuenta;
    this.codigoWeb = [1];

    function registroEnWeb(nombre, dni){
        this.codigoweb[codigoweb.length-1].push(nombre, dni)
    }
}


Usuarios.prototype.Web = function(){
    this.usuarioRegistrado = this.codigoWeb
}

Estaciones.prototype.WebInfoTodasEstacione = function(){
    console.log(this.numEstacion.length)
}

function Estaciones(nombreEstacion, direccionEstacion, capacidadMaxima, estaOperativa ){
    this.numEstacion = []
    this.nombreEstacion = nombreEstacion
    this.direccionEstacion = direccionEstacion
    this.capacidadMaxima = capacidadMaxima
    this.estaOperativa = estaOperativa
    this.horarioEstacion =[]
    function mostrarHorarioEstacion(){
        this.horarioEstacion = ['lunes 8:15-23:30', 'martes 8:15-23:30', 'miercoles 8:15-23:30', 'jueves 8:15-23:30', 'viernes 8:15-23:30']
    }
    mostrarHorarioEstacion()
}

Estaciones.prototype.nuevaBicicleta = function (anadirBici) {
    this.anadirBici = anadirBici++
}

//Estaciones.prototype.contBicis = funtion () {

//}




