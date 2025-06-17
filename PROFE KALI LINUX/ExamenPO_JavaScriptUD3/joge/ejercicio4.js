// Funciones constructoras
function Cliente(nombre, apellidos, telefono, email, fechaNacimiento) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.telefono = telefono;
    this.email = email;
    this.fechaNacimiento = fechaNacimiento;
    this.reservas = [];
}

function Reserva(fechaEntrada, fechaSalida, cliente) {
    this.fechaEntrada = fechaEntrada;
    this.fechaSalida = fechaSalida;
    this.cliente = cliente;
    this.habitaciones = [];
    this.precioTotal = 0;
}

function Habitacion(tipo, precio, extension) {
    this.tipo = tipo;
    this.precio = precio;
    this.extension = extension;
    this.numeroClientesUsado = 0;
    this.empleados = [];
}

function Empleado(nombre, apellidos, horario, cargo, habitacion) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.horario = horario;
    this.cargo = cargo;
    this.habitacion = habitacion;
}

function UsoServicio(fechaHora, precio, cliente, empleado) {
    this.fechaHora = fechaHora;
    this.precio = precio;
    this.cliente = cliente;
    this.empleado = empleado;
}

function Oferta(descuento, fechaInicio, fechaFin) {
    this.descuento = descuento;
    this.fechaInicio = fechaInicio;
    this.fechaFin = fechaFin;
}

// Objetos de ejemplo
let cliente1 = new Cliente('Carlos', 'Marin', '648743879', 'carlos@gmail.com', '2006-05-10');
let habitacion1 = new Habitacion('Suite', 200, 50);
let empleado1 = new Empleado('Juan', 'Pérez', 'Tarde', 'Limpiador', habitacion1);
let reserva1 = new Reserva('2025-05-11', '2025-05-15', cliente1);
let oferta1 = new Oferta(20, '2025-01-01', '2025-02-01');

console.log(cliente1);
console.log(habitacion1);
console.log(empleado1);
console.log(reserva1);
console.log(oferta1);