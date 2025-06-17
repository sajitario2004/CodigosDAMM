function Usuario(nif, correo, nombre, direccion, telefono, login, password) {
    this.nif = nif;
    this.correo = correo;
    this.nombre = nombre;
    this.direccion = direccion;
    this.telefono = telefono;
    this.login = login;
    this.password = password;
    this.visita1 = null;
    this.visita2 = null;
    this.carrito1 = null;
    this.carrito2 = null;
    this.carrito3 = null;
    this.datosBancarios = null;

    this.agregarVisita1 = function(visita) {
        this.visita1 = visita;
    }

    this.agregarVisita2 = function(visita) {
        this.visita2 = visita;
    }

    this.crearCarrito1 = function(carrito) {
        this.carrito1 = carrito;
    }

    this.crearCarrito2 = function(carrito) {
        this.carrito2 = carrito;
    }

    this.crearCarrito3 = function(carrito) {
        this.carrito3 = carrito;
    }

    this.agregarDatosBancarios = function(datos) {
        this.datosBancarios = datos;
    }

    this.totalComprado = function() {
        let total = 0;
        if (this.carrito1) total += this.carrito1.calcularTotal();
        if (this.carrito2) total += this.carrito2.calcularTotal();
        if (this.carrito3) total += this.carrito3.calcularTotal();
        return total;
    }
}

function Seccion(codigo, nombre, descripcion, fechaCreacion) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.fechaCreacion = fechaCreacion;
    this.producto1 = null;
    this.producto2 = null;

    this.agregarProducto1 = function(producto) {
        this.producto1 = producto;
    }

    this.agregarProducto2 = function(producto) {
        this.producto2 = producto;
    }
}

function Visita(usuario, seccion, fecha) {
    this.usuario = usuario;
    this.seccion = seccion;
    this.fecha = fecha;
}

function Producto(codigo, nombre, descripcion, precioUnidad) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precioUnidad = precioUnidad;
}

function Carrito(fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
    this.linea1 = null;
    this.linea2 = null;
    this.finalizado = false;

    this.agregarProducto1 = function(producto, unidades) {
        this.linea1 = { producto: producto, unidades: unidades };
    }

    this.agregarProducto2 = function(producto, unidades) {
        this.linea2 = { producto: producto, unidades: unidades };
    }

    this.eliminarProducto1 = function() {
        this.linea1 = null;
    }

    this.eliminarProducto2 = function() {
        this.linea2 = null;
    }

    this.calcularTotal = function() {
        let total = 0;
        if (this.linea1) total += this.linea1.producto.precioUnidad * this.linea1.unidades;
        if (this.linea2) total += this.linea2.producto.precioUnidad * this.linea2.unidades;
        return total;
    }

    this.finalizarCompra = function() {
        this.finalizado = true;
    }
}

function DatosBancarios(numeroTarjeta, fechaCaducidad, cvv) {
    this.numeroTarjeta = numeroTarjeta;
    this.fechaCaducidad = fechaCaducidad;
    this.cvv = cvv;
}


let usuario1 = new Usuario('12345678A', 'usuario@correo.com', 'Ana', 'Calle Falsa 123', '654123987', 'anaUser', '1234');

let seccion1 = new Seccion('A1', 'Tecnología', 'Electrónica y gadgets', '2024-01-01');
let producto1 = new Producto('P001', 'Tablet', 'Tablet Android 10"', 200);
let producto2 = new Producto('P002', 'Auriculares', 'Auriculares inalámbricos', 50);

seccion1.agregarProducto1(producto1);
seccion1.agregarProducto2(producto2);

let visita1 = new Visita(usuario1, seccion1, '2025-06-17');
usuario1.agregarVisita1(visita1);

let carrito1 = new Carrito('2025-06-17');
carrito1.agregarProducto1(producto1, 2);
carrito1.agregarProducto2(producto2, 1);
usuario1.crearCarrito1(carrito1);

let datosBancarios = new DatosBancarios('1111222233334444', '12/27', '123');
usuario1.agregarDatosBancarios(datosBancarios);

carrito1.finalizarCompra();

console.log('Total del carrito 1:', carrito1.calcularTotal());
console.log('Total gastado por el usuario:', usuario1.totalComprado());
console.log(usuario1);
