function Cliente(nombre, apellidos, telefono, email, fechaNacimiento) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.telefono = telefono;
    this.email = email;
    this.fechaNacimiento = fechaNacimiento;
    this.reservaActual = null;
    this.historicoReservas = [];

    this.realizarReserva = function(reserva) {
        this.reservaActual = reserva;
        this.historicoReservas.push(reserva);
    }
}

function Reserva(cliente, fechaEntrada, fechaSalida) {
    this.cliente = cliente;
    this.fechaEntrada = fechaEntrada;
    this.fechaSalida = fechaSalida;
    this.habitacion1 = null;
    this.habitacion2 = null;
    this.cargo1 = null;
    this.cargo2 = null;

    this.agregarHabitacion1 = function(hab) {
        this.habitacion1 = hab;
        hab.incrementarUso();
    }

    this.agregarHabitacion2 = function(hab) {
        this.habitacion2 = hab;
        hab.incrementarUso();
    }

    this.agregarCargo1 = function(cargo) {
        this.cargo1 = cargo;
    }

    this.agregarCargo2 = function(cargo) {
        this.cargo2 = cargo;
    }

    this.calcularTotal = function() {
        let total = 0;
        if (this.habitacion1 != null) {
            total += this.habitacion1.precioReal;
        }
        if (this.habitacion2 != null) {
            total += this.habitacion2.precioReal;
        }
        if (this.cargo1 != null) {
            total += this.cargo1.precio;
        }
        if (this.cargo2 != null) {
            total += this.cargo2.precio;
        }
        return total;
    }
}

function Habitacion(tipo, precioBase, extension) {
    this.tipo = tipo;
    this.precioBase = precioBase;
    this.extension = extension;
    this.numeroUsos = 0;
    this.empleado1 = null;
    this.empleado2 = null;
    this.precioOferta = null;
    this.precioReal = precioBase;

    this.agregarEmpleado1 = function(emp) {
        if (emp.habitacionAsignada == null) {
            this.empleado1 = emp;
            emp.habitacionAsignada = this;
        }
    }

    this.agregarEmpleado2 = function(emp) {
        if (emp.habitacionAsignada == null) {
            this.empleado2 = emp;
            emp.habitacionAsignada = this;
        }
    }

    this.asignarOferta = function(oferta) {
        this.precioOferta = oferta;
        this.precioReal = oferta.precioOferta;
    }

    this.incrementarUso = function() {
        this.numeroUsos++;
    }
}

function Empleado(nombre, apellidos, horario, cargo) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.horario = horario;
    this.cargo = cargo;
    this.habitacionAsignada = null;
}

function CargoServicio(empleado, fechaHora, precio) {
    this.empleado = empleado;
    this.fechaHora = fechaHora;
    this.precio = precio;
}

function Oferta(descripcion, precioOferta) {
    this.descripcion = descripcion;
    this.precioOferta = precioOferta;
}

let cliente1 = new Cliente('Laura', 'Martinez Gomez', '666444111', 'laura@gmail.com', '1990-06-17');
let habitacion1 = new Habitacion('Suite Deluxe', 350, 50);
let habitacion2 = new Habitacion('Habitación doble', 180, 30);

let empleado1 = new Empleado('Carlos', 'Perez', '10:00-18:00', 'Servicio de habitaciones');
let empleado2 = new Empleado('Marta', 'Lopez', '8:00-16:00', 'Recepcionista');

habitacion1.agregarEmpleado1(empleado1);
habitacion2.agregarEmpleado1(empleado2);

let oferta = new Oferta('Oferta Verano -20%', 280);
habitacion1.asignarOferta(oferta);

let reserva1 = new Reserva(cliente1, '2025-08-01', '2025-08-05');
reserva1.agregarHabitacion1(habitacion1);
reserva1.agregarHabitacion2(habitacion2);

let cargo1 = new CargoServicio(empleado1, '2025-08-02 11:00', 30);
let cargo2 = new CargoServicio(empleado2, '2025-08-03 12:00', 50);

reserva1.agregarCargo1(cargo1);
reserva1.agregarCargo2(cargo2);

cliente1.realizarReserva(reserva1);

console.log('Total sin bucles:', reserva1.calcularTotal());
console.log(cliente1);
