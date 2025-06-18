function Alumno(nif, nExpediente, nombre, apellidos, domicilio, telefono , email){
    // this = {}
this.nif = nif;
this.nExpediente = nExpediente;
this.nombre = nombre;
this.apellidos = apellidos;
this.domicilio = domicilio;
this.telefono = telefono
this.email= email;
this.asignaturas = [];


//return this
};


Alumno.prototype.añadirAsignaturaAlumno = function(asignatura){
    console.log("Matricula al alumno ")
    this.asignaturas.push(asignatura);
    asignatura.alumno = [];
    asignatura.alumno.push(this);

}


let nacho = new Alumno('23123810X', "n342384",'Nacho', 'Toledano', 'C Mijas', 6515215, 'correo@gmail.com');
console.log(nacho)









function Curso(codigo, nombre, aula,  horario){
    this.codigo = codigo;
    this.nombre = nombre;
    this.aula = aula;
    this.horario = horario;
    this.asignatura = [];
};

Curso.prototype.añadirAsignatura = function(asignatura){
    console.log('Añade la asignatura $(asignatura) al curso');
    this.asignatura.push(asignatura);
    asignatura.curso = this;
};

function Asignatura(nombre, profesor, numHorasSem) {
    this.nombre = nombre;
    this.profesor = profesor;
    this.numHoraSem = numHorasSem;
};

let curso1DAM = new Curso('1DAMM' , 'Primero de desarrollo de aplicaciones multiplataforma', 'aula primero DAMM', 'L5-6, M6');

let entronosDeDesarrollo = new Asignatura('Entornos de desarrollo', 'JoseM', 3);

curso1DAM.añadirAsignatura(entronosDeDesarrollo);
console.log(curso1DAM);



