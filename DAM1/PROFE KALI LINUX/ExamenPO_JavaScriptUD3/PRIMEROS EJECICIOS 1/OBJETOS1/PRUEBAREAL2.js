

// Creacion de funcion constructora
function Cliente(nombre, apellido, DNI, fechaNacimiento, telefono, email) {
    //this y demas
    this.nombre  = nombre
    this.apellidos =apellido
    this.DNI = DNI
    this.fechaNacimiento = fechaNacimiento
    this.telefono  = telefono
    this.email  = email
}

let clienteNacho = new Cliente( 'nacho',
                            'toledano Caneo',
                            '48415418D',
                            '15/08/97',
                           6161561,
                            'manolo@gmail.com')
console.log(clienteNacho)