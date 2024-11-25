const prompt = require('prompt-sync')();

let altura = prompt("Cual es la altura de tu cuadrado " );
let anchura = prompt("Cuantos cuadrados tiene su anchura ");
let anchuraCentro = anchura-2;
let contAnchura = 1;
let contAltura = 1;
let cadenatxt = ""

altura = Number(altura)
anchura = Number(anchura)
anchuraCentro = Number(anchuraCentro)
cadenatxt = String(cadenatxt)


for (let i = 1; i < anchura ; i++) {

    cadenatxt += " * ";

}
    cadenatxt += " * ";
    cadenatxt += "\n" ;
    contAltura++;

if (contAltura > 1){

while (contAltura < altura) {

    if (contAnchura == 1) {
        cadenatxt += " * ";
    }
    contAnchura++;

    while (contAnchura > 1 && contAnchura < anchura) {
        cadenatxt += "   ";
        contAnchura++;
    }

    if (contAnchura == anchura) {
        cadenatxt += " * ";
        cadenatxt += "\n" ;

    }

    contAnchura = 1;

    contAltura++;
}

}
if (contAltura == altura){
    for (let i = 1; i < anchura ; i++) {

        cadenatxt += " * ";

    }
    cadenatxt += " * "
    contAltura++;
}

console.log(cadenatxt);

