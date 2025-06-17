function Inmueble(codigo, direccion, poblacion, cp, precioVenta, precioAlquiler, fechaUltMov, observaciones, enVenta, enAlquiler) {
    this.codigo = codigo;
    this.direccion = direccion;
    this.poblacion = poblacion;
    this.cp = cp;
    this.precioVenta = precioVenta;
    this.precioAlquiler = precioAlquiler;
    this.fechaUltMov = fechaUltMov;
    this.observaciones = observaciones;
    this.enVenta = enVenta;
    this.enAlquiler = enAlquiler;
    this.movimiento = null;

    this.registrarMovimiento = function(mov) {
        this.movimiento = mov;
        this.fechaUltMov = mov.fecha;
    }
}

function Agente(dni, nombre, direccion, poblacion, telefono, horario, salarioBase, observaciones) {
    this.dni = dni;
    this.nombre = nombre;
    this.direccion = direccion;
    this.poblacion = poblacion;
    this.telefono = telefono;
    this.horario = horario;
    this.salarioBase = salarioBase;
    this.observaciones = observaciones;
    this.venta1 = null;
    this.venta2 = null;

    this.registrarVenta1 = function(mov) {
        this.venta1 = mov;
    }

    this.registrarVenta2 = function(mov) {
        this.venta2 = mov;
    }

    this.calcularComision = function() {
        let comision = 0;
        if (this.venta1) comision += this.venta1.calcularComision();
        if (this.venta2) comision += this.venta2.calcularComision();
        return comision;
    }
}

function Cliente(dni, direccion, poblacion, telefono, email) {
    this.dni = dni;
    this.direccion = direccion;
    this.poblacion = poblacion;
    this.telefono = telefono;
    this.email = email;
}

function Movimiento(tipo, inmueble, agente, cliente, fecha, precioReal) {
    this.tipo = tipo; // "venta" o "alquiler"
    this.inmueble = inmueble;
    this.agente = agente;
    this.cliente = cliente;
    this.fecha = fecha;
    this.precioReal = precioReal;

    this.calcularComision = function() {
        let porcentaje = 0;
        if (this.tipo === 'venta') {
            if (inmueble.precioVenta > 100000) {
                porcentaje = 0.04;
            } else {
                porcentaje = 0.03;
            }
        } else if (this.tipo === 'alquiler') {
            porcentaje = 0.02;
        }
        return this.precioReal * porcentaje;
    }
}


let inmueble1 = new Inmueble(101, 'Calle Mayor 5', 'Madrid', '28013', 150000, 800, null, 'Buen estado', true, true);
let cliente1 = new Cliente('12345678A', 'Calle Luna 7', 'Madrid', '600123456', 'cliente@correo.com');
let agente1 = new Agente('11111111Z', 'Luis Gómez', 'Calle Sol 3', 'Madrid', '911111111', 'mañana', 1200, 'Agente experimentado');

let mov1 = new Movimiento('venta', inmueble1, agente1, cliente1, '2025-06-17', 145000);
inmueble1.registrarMovimiento(mov1);
agente1.registrarVenta1(mov1);

console.log('Comisión del agente:', agente1.calcularComision());
console.log(inmueble1);
console.log(agente1);
