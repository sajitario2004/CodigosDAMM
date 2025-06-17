// Clase Inmueble
function Inmueble(codigo, direccion, poblacion, codigoPostal, precioVenta, precioAlquiler, fechaUltimoMovimiento, observaciones) {
    this.codigo = codigo;
    this.direccion = direccion;
    this.poblacion = poblacion;
    this.codigoPostal = codigoPostal;
    this.precioVenta = precioVenta;
    this.precioAlquiler = precioAlquiler;
    this.fechaUltimoMovimiento = fechaUltimoMovimiento;
    this.observaciones = observaciones;
}

// Clase Agente
function Agente(dni, nombre, direccion, poblacion, telefono, horario, salarioBase, observaciones) {
    this.dni = dni;
    this.nombre = nombre;
    this.direccion = direccion;
    this.poblacion = poblacion;
    this.telefono = telefono;
    this.horario = horario;
    this.salarioBase = salarioBase;
    this.observaciones = observaciones;
}

// Clase ClienteInmobiliaria
function ClienteInmobiliaria(dni, direccion, poblacion, telefono, email) {
    this.dni = dni;
    this.direccion = direccion;
    this.poblacion = poblacion;
    this.telefono = telefono;
    this.email = email;
}

// Clase Movimiento (Venta o Alquiler)
function Movimiento(tipo, inmueble, cliente, agente, fecha, precioFinal) {
    this.tipo = tipo; // 'venta' o 'alquiler'
    this.inmueble = inmueble;
    this.cliente = cliente;
    this.agente = agente;
    this.fecha = fecha;
    this.precioFinal = precioFinal;
}

// Clase Comision
function Comision(agente, totalVentas, porcentajeComision) {
    this.agente = agente;
    this.totalVentas = totalVentas;
    this.porcentajeComision = porcentajeComision;
    this.montoComision = function() {
        return this.totalVentas * (this.porcentajeComision / 100);
    };
}
// Inmueble
let inmueble1 = new Inmueble(
    "I001", 
    "Calle Ficticia 123", 
    "Madrid", 
    "28001", 
    250000,  // Precio de venta
    1200,     // Precio de alquiler
    new Date(2025, 0, 15),  // Último movimiento: 15 de enero de 2025
    "Piso en el centro de Madrid, 3 habitaciones, 2 baños."  // Observaciones
);

// Agente
let agente1 = new Agente(
    "12345678A", 
    "Laura García", 
    "Calle Real 45", 
    "Madrid", 
    "912345678", 
    "10:00 - 18:00",  // Horario de trabajo
    1500,  // Salario base
    "Experta en venta de pisos en el centro."  // Observaciones
);

// ClienteInmobiliaria
let cliente1 = new ClienteInmobiliaria(
    "98765432B", 
    "Avenida de la Paz 10", 
    "Madrid", 
    "674567890", 
    "cliente@email.com"
);

// Movimiento (Venta)
let movimiento1 = new Movimiento(
    "venta",  // Tipo de movimiento
    inmueble1, 
    cliente1, 
    agente1, 
    new Date(2025, 0, 20),  // Fecha de la venta
    245000  // Precio final de la venta
);

// Comision
let comision1 = new Comision(
    agente1, 
    245000,  // Total de ventas realizadas por el agente
    3  // Porcentaje de comisión
);

// Calcular comisión
let montoComision = comision1.montoComision();

// Mostrar en consola
console.log("Inmueble:", inmueble1);
console.log("Agente:", agente1);
console.log("Cliente:", cliente1);
console.log("Movimiento (Venta):", movimiento1);
console.log("Comisión para el agente:", montoComision);
