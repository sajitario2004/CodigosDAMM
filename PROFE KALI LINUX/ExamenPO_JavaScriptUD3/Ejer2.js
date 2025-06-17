function Usuario(nombre, apellidos, email, telefono, dni, fechaNacimiento) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.email = email;
    this.telefono = telefono;
    this.dni = dni;
    this.fechaNacimiento = fechaNacimiento;
}

function Polideportivo(nombre, direccion, extension) {
    this.nombre = nombre;
    this.direccion = direccion;
    this.extension = extension; 
    this.pistas = [];

    this.agregarPista = function(pista) {
        this.pistas.push(pista);
    };
}

function Pista(codigo, tipo, estado, precio, ultimaReserva) {
    this.codigo = codigo;
    this.tipo = tipo; 
    this.estado = estado; 
    this.precio = precio;
    this.ultimaReserva = ultimaReserva || null;
}

function Reserva(fechaReserva, fechaUso, pista, jugadores) {
    this.fechaReserva = fechaReserva;
    this.fechaUso = fechaUso;
    this.pista = pista;
    this.jugadores = jugadores;
    this.precio = pista.precio;

    pista.ultimaReserva = fechaReserva;
}

let juan = new Usuario("Juan", "Perez", "juan@mail.com", "666777888", "12345678A", "1990-01-01");
let ana = new Usuario("Ana", "Lopez", "ana@mail.com", "699888777", "87654321B", "1989-05-12");

let poliMijas = new Polideportivo("Poli Mijas Centro", "Calle Sol, 123", 5000);

let pistaTenis1 = new Pista("A", "tenis", "operativa", 10);
let pistaFutbol1 = new Pista("B", "fuutbol", "mantenimiento", 20);

poliMijas.agregarPista(pistaTenis1);
poliMijas.agregarPista(pistaFutbol1);

let reserva1 = new Reserva("2025-06-15", "2025-06-18", pistaTenis1, [juan, ana]);

console.log("Reserva realizada el:", reserva1.fechaReserva);
console.log("Uso de la pista el:", reserva1.fechaUso);
console.log("Pista:", reserva1.pista.codigo, "-", reserva1.pista.tipo);
console.log("Estado de la pista:", reserva1.pista.estado);
console.log("Jugadores:");
console.log(reserva1.jugadores)
console.log("Precio total:", reserva1.precio + "€");
