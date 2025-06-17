// Modelo de gestión para el hotel Gran Scala

// Clase Cliente
function Cliente(nombre, apellidos, telefono, email, fechaNacimiento) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.telefono = telefono;
    this.email = email;
    this.fechaNacimiento = fechaNacimiento;
    this.reservas = [];
}

// Clase Reserva
function Reserva(fechaEntrada, fechaSalida, habitaciones, precioTotal) {
    this.fechaEntrada = fechaEntrada;
    this.fechaSalida = fechaSalida;
    this.habitaciones = habitaciones;
    this.precioTotal = precioTotal;
}

// Clase Habitacion
function Habitacion(tipo, precio, extension, numeroClientesUsado, empleados) {
    this.tipo = tipo;
    this.precio = precio;
    this.extension = extension;
    this.numeroClientesUsado = numeroClientesUsado;
    this.empleados = empleados;
}

// Clase Empleado
function Empleado(nombre, apellidos, horario, cargo) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.horario = horario;
    this.cargo = cargo;
}

// Clase Oferta
function Oferta(descuento, fechaInicio, fechaFin) {
    this.descuento = descuento;
    this.fechaInicio = fechaInicio;
    this.fechaFin = fechaFin;
}

// Modelo de gestión para el comercio electrónico

// Clase Usuario
function Usuario(nif, correo, nombre, direccion, telefono, login, password) {
    this.nif = nif;
    this.correo = correo;
    this.nombre = nombre;
    this.direccion = direccion;
    this.telefono = telefono;
    this.login = login;
    this.password = password;
    this.historialSecciones = [];
    this.carritos = [];
}

// Clase Seccion
function Seccion(codigo, nombre, descripcion, fechaCreacion) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.fechaCreacion = fechaCreacion;
}

// Clase Carrito
function Carrito(fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
    this.productos = [];
}

// Clase Producto
function Producto(codigo, nombre, descripcion, precio) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precio = precio;
}
// Cliente
let cliente1 = new Cliente(
    "Juan", 
    "Pérez", 
    "123456789", 
    "juan.perez@email.com", 
    new Date(1990, 5, 15)  // Fecha de nacimiento: 15 de junio de 1990
);

// Reserva
let reserva1 = new Reserva(
    new Date(2025, 2, 20),  // Fecha de entrada: 20 de marzo de 2025
    new Date(2025, 2, 25),  // Fecha de salida: 25 de marzo de 2025
    ["Habitación 101", "Habitación 102"],  // Habitaciones reservadas
    500  // Precio total de la reserva
);

// Habitacion
let habitacion1 = new Habitacion(
    "Doble", 
    100,  // Precio por noche
    "30 m²",  // Extensión
    5,  // Número de clientes usados
    ["Empleado 1", "Empleado 2"]  // Empleados asignados
);

// Empleado
let empleado1 = new Empleado(
    "Ana", 
    "González", 
    "09:00 - 17:00",  // Horario laboral
    "Recepcionista"  // Cargo
);

// Oferta
let oferta1 = new Oferta(
    20,  // Descuento del 20%
    new Date(2025, 1, 1),  // Fecha de inicio: 1 de febrero de 2025
    new Date(2025, 1, 28)  // Fecha de fin: 28 de febrero de 2025
);

// Usuario
let usuario1 = new Usuario(
    "12345678A", 
    "usuario1@email.com", 
    "Carlos Sánchez", 
    "Calle Ficticia 123, Madrid", 
    "987654321", 
    "carlos_s", 
    "password123"
);

// Seccion
let seccion1 = new Seccion(
    "A001", 
    "Electrónica", 
    "Todo lo relacionado con productos electrónicos como móviles, ordenadores, etc.", 
    new Date(2025, 0, 15)  // Fecha de creación: 15 de enero de 2025
);

// Carrito
let carrito1 = new Carrito(new Date(2025, 0, 30));  // Fecha de creación del carrito: 30 de enero de 2025

// Producto
let producto1 = new Producto(
    "P001", 
    "Smartphone XYZ", 
    "Smartphone con pantalla de 6.5 pulgadas, 128GB de almacenamiento", 
    299.99  // Precio del producto
);
carrito1.productos.push(producto1);
usuario1.historialSecciones.push(seccion1);
cliente1.reservas.push(reserva1);
console.log(cliente1);
console.log(reserva1);
console.log(habitacion1);
console.log(empleado1);
console.log(oferta1);
console.log(usuario1);
console.log(seccion1);
console.log(carrito1);
console.log(producto1);