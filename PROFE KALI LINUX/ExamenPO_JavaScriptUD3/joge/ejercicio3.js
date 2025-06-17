function Alumno(dni, expediente, nombre, apellidos, domicilio, telefono, email) {
    this.dni = dni;
    this.expediente = expediente;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.domicilio = domicilio;
    this.telefono = telefono;
    this.email = email;
    this.matriculas = [];
}

function Matricula(id, año) {
    this.id = id;
    this.año = año;
    this.asignaturas = [];
}

function Asignatura(nombre, numHoras, profesor) {
    this.nombre = nombre;
    this.numHoras = numHoras;
    this.profesor = profesor;
    this.notas = [];
}

function Profesor(nombre, apellidos, domicilio, email) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.domicilio = domicilio;
    this.email = email;
    this.asignaturas = [];
    this.cursoTutor = null;
}

function Curso(codigo, nombre, aula, horario) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.aula = aula;
    this.horario = horario;
    this.asignaturas = [];
    this.alumnos = [];
}

function Nota(evaluacion, valor, observaciones, alumno, asignatura) {
    this.evaluacion = evaluacion;
    this.valor = valor;
    this.observaciones = observaciones;
    this.alumno = alumno;
    this.asignatura = asignatura;
}

function ParejaPractica(alumno1, alumno2, asignatura) {
    this.alumnos = [alumno1, alumno2];
    this.asignatura = asignatura;
}
// Objetos de ejemplo
let profesor1 = new Profesor('Jorge', 'Sanchez', 'Calle Esperanza ', 'jorge@gmail.com');
let curso1 = new Curso('1', 'DAM', '23', '8:15 - 14:45');
let asignatura1 = new Asignatura('Entorno de Desarrollo', 3, profesor1);
let alumno1 = new Alumno('123456789H', 23, 'jose', 'Rodriguez', 'C/ Antonio 69', '654789321', 'jose@gmail.com');
let alumno2 = new Alumno('987654321G', 24, 'Dario', 'Jimenez', 'C/ Javier 96', '314687459', 'dario@gmail.com');
let pareja1 = new ParejaPractica(alumno1, alumno2, asignatura1);
console.log(curso1);
console.log(alumno1);
console.log(alumno2);
console.log(profesor1);
console.log(asignatura1);
console.log(pareja1);
