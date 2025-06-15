let cat1 = {
    name: 'oscar',
    sexo: 'mascculino',
    age: '3',
    weight: 7,
    color: 'marron',
    texture: 'rayada',

    otros:['oreja rota', 'marron'],

}

let cat2 = {
    name: 'eugenia',
    sexo: 'femeninna',
    age: 3,
    weight: 6,
    color: 'blanca',
    texture: 'normal',

    otros:['quejosa', 'cola rota'],

    familiares: {
        hermano_mayor: 'oscar',
        hermano_menor: 'manolo'
    },

    saludar:function(){
        console.log('mi nombre es ' + cat2.name + '. te gusta mi nombre?')
    }
}

cat2.saludar();

function Gato(nombre, sexo, altura, color) {
    this.nombre = nombre;
    this.sexo = sexo;
    this.altura = altura;
    this.color = color;
    this.datos = [];

    this.anadirDatos = function(dato) {
        this.datos.push(dato);
    };

    this.mostrarInfo = function() {
        console.log('Me llamo ' + this.nombre +
            '\nMido ' + this.altura + ' cm de altura,' +
            '\notros de mis datos son: ' + this.datos.join(', '));
    };
}

// Instanciación correcta con 'new'
let cat3 = new Gato(
    'Manolo',
    'macho',
    3,
    'marrón'
);

cat3.anadirDatos('le falta un ojo');
cat3.anadirDatos('es muy cariñoso');
cat3.mostrarInfo();


