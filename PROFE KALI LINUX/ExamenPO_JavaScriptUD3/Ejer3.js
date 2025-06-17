function Alumno(dni, nExpediente, nombre, apellidos, domicilio, telefono, email){
    this.dni= dni;
    this.nExpediente = nExpediente;
    this.nombre=nombre;
    this.apellidos=apellidos;
    this.domicilio=domicilio;
    this.telefono=telefono;
    this.email=email;
    this.observaciones=[];
    this.compaPracticas;
    this.notasAsignaturas=[];

    this.agregarObservacionPorProfe = function(observacion){
        this.observaciones.push(observacion);
    }

    this.seleccionarCompaPracticas= function(compa){
        this.compaPracticas=compa;
    }

    this.agregarNotaAsignatura = function(asigatura, nota){
        this.notasAsignaturas.push=('En la asignatura '+ asigatura.nombre + ' has sacado un '+nota);
    }

}

function Curso(codigo, nombre, aula, horario){
    this.codigo=codigo;
    this.nombre=nombre;
    this.aula=aula;
    this.horario=horario
    this.asigaturas=[];
    this.alumnos=[];
    this.profesores=[]

    this.agregarAlumno = function(alumno){
        this.alumnos.push(alumno);
    }

    this.agregarAsignatura=function(asigatura){
        this.asigaturas.push(asigatura);
    }

    this.agregarProfesor = function(profe){
        this.profesores.push(profe);
    }

    
};


function Asignatura(nombre, profesor, nHorasSemanal ){
    this.nombre=nombre;
    this.profesor=profesor;
    this.nHorasSemanal=nHorasSemanal;
    
}

function Profesor(nombre, apellidos, domicilio, email ){
    this.nombre=nombre;
    this.apellidos=apellidos;
    this.domicilio=domicilio;
    this.email=email;
    this.asignaturas=[6];

    try {
        this.agregarAsignatura=function(asignatura){
            this.asignaturas.push(asignatura);
        }
    } catch (error) {
        console.log('este profesor ya no puede impartir mas asignaturas')
    }
    
}

function Observacion(alumno, profesor, observacion){
    this.alumno=alumno;
    this.profesor=profesor;
    this.observacion=observacion;
}

let alumno1 = new Alumno('123123l',325235135613,'nacho', 'toledano caneo', 'mi casa', 657412398, 'itolca27@g.educaand.es');
let alumno2 = new Alumno('516502f',951919089888,'iker', 'cruz ', 'su casa', 651916165, 'icruz69@g.educaand.es');

let profe1 = new Profesor('Jose Manuel', 'Martin Tejero', 'Casa del profe', 'tejeroInformatico@g.educaand.es');
let profe2 = new Profesor('Leticia', 'Badillo', 'Casa seño', 'LeticiaInformatico@g.educaand.es');

let asigaturaED= new Asignatura('Entorno de Desarrollo', profe1, 3);
let asigaturaProgra = new Asignatura('Programacion', profe2, 8 );

let observacion1 = (alumno1, profe1, 'le faltan los ejercicios de la unidad 3');
alumno1.agregarObservacionPorProfe(observacion1);

alumno1.agregarNotaAsignatura(asigaturaED, 7);
alumno1.verNotas

alumno1.seleccionarCompaPracticas(alumno2);

let curso = new Curso(484518123, 'Desarrollo de aplicaciones multiplataforma', '21-planta2', '8:15-14:45 de lunes a viernes');
curso.agregarAlumno(alumno1);
curso.agregarAlumno(alumno2);
curso.agregarAsignatura(asigaturaED);
curso.agregarAsignatura(asigaturaProgra);
curso.agregarProfesor(profe1);
curso.agregarProfesor(profe2);

console.log(curso);
