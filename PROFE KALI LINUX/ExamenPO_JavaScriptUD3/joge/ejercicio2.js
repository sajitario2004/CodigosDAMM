//Funciones constructoras
function Cliente(nombre, apellidos, email, telefono, dni, fechaNacimiento) {
    //this = {};
    //ESTADO - atributos
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.email = email;
    this.telefono = telefono;
    this.dni = dni;
    this.fechaNacimiento = fechaNacimiento;
    //return this;
    }
    
    function Polideportivo(nombre, direccion, extension, pistas) {
    //this = {};
    this.nombre = nombre;
    this.direccion = direccion;
    this.extension = extension;
    this.pistas = pistas;
    this.reservas = [];
    //return this;
    }
    Polideportivo.prototype.reservar = function(codigoPista, fechaReserva, clienteReserva, jugadores) {
    
    let reserva = new Reserva(Date.now(),
    fechaReserva,
    codigoPista,
    this.pistas[codigoPista-1].precio,
    clienteReserva,
    jugadores);
    
    this.reservas.push(reserva);
    
    }
    
    function Pista(codigo, tipo, estaOperativa, precio, ultimaReserva) {
    //this = {};
    this.codigo = codigo;
    this.tipo = tipo;
    this.estaOperativa = estaOperativa;
    this.precio = precio;
    this.ultimaReserva = ultimaReserva;
    //return this;
    }
    
    function Reserva(fechaGraba, fechaReserva, pista , precio, clienteReserva, jugadores) {
    this.fechaGraba = fechaGraba;
    this.fechaReserva = fechaReserva;
    this.precio = precio;
    this.pista = pista;
    this.clienteReserva = clienteReserva;
    this.jugadores = jugadores;
    }
    
    //Objetos
    
    let cliente1 = new Cliente('Jose',
    'Martín Tejero',
    'j@email.com',
    653235689,
    '74576890X', //nif 8 digitos + 1 letra
    '2000-01-31' //fecha formato anglo (como SQL)
    );
    console.log(cliente1);
    let cliente2 = new Cliente('María',
    'Díaz Capos',
    'm@email.com',
    653235623,
    '74589632X', //nif 8 digitos + 1 letra
    '2000-02-30' //fecha formato anglo (como SQL)
    );
    
    let pista1 = new Pista(1,'futbol-sala', true, 10.50, '2025-01-14 18:30:00');
    console.log(pista1);
    
    let pista2 = new Pista(2,'tenis', true, 23.75, null);
    console.log(pista2);
    
    let polideportivo1 = new Polideportivo('Las Lagunas',
    'C/Inventada, Nº1, Las Lagunas (29651)',
    4000, //m2
    [pista1, pista2]
    );
    console.log(polideportivo1);
    polideportivo1.reservar(2,'2025-01-24 16:00:00', cliente1, [cliente1, cliente2]);
    console.log(polideportivo1);
    //Funcion constructora
    function Equipo(nombre, patrocinador, camisetas, categoria, jugadores ) {
    //this = {};
    this.nombre = nombre;
    this.patrocinador = patrocinador;
    this.camisetas = camisetas;
    this.categoria = categoria;
    this.jugadores = jugadores;
    //return this;
    }
    Equipo.prototype.mmarcaLocal = function() {
    this.resultado[0]++;
    };
    Equipo.prototype.marcaVisitante = function() {
    this.resultado[1]++;
    };
    Equipo.prototype.grabaIncidencia = function(incidencia) {
    this.incidencias.push(incidencia);
    }
    
    function Partido(arbitro, campo, equipoLocal, equipoVisitante) {
    //this = {};
    this.arbitro=arbitro;
    this.campo=campo;
    this.equipoLocal=equipoLocal;
    this.equipoVisitante=equipoVisitante;
    this.resultado = [0, 0];
    this.incidencias = [];
    this.mmarcaLocal = function() {
    this.resultado[0]++;
    },
    this.marcaVisitante = function() {
    this.resultado[1]++;
    },
    this.grabaIncidencia = function(incidencia) {
    this.incidencias.push(incidencia);
    }
    //return this;
    }
    
    let cdJs = new Equipo('CD JS',
    'vscode',
    ['azul', 'blanca'],
    'senior',
    []
    );
    console.log(cdJs);
    
    
    let atJava = new Equipo('At Java',
    'oracle',
    ['gris', 'negra'],
    'senior',
    []
    );
    
    console.log(atJava);
    let partidos = [];
    let partido1 = new Partido('Profesor',
    'IES Vega de Mijas',
    cdJs,
    atJava
    );
    
    console.log(partido1);
    partidos.push(partido1);
    
    let partido2 = new Partido('Profesor',
    'PTA',
    atJava,
    cdJs
    );
    console.log(partido2);
    partidos.push(partido2);
    
    console.log(partidos);