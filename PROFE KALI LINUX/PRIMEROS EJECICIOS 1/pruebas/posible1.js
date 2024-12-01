const prompt = require('prompt-sync')();

let pregunta = Number(prompt("que quieres hacer:\n"+
    "1 cuadrado metodo 1\n"+
    "2 cuadrado metodo 2\n"+
    "3 triangulo\n"+
    "4 triangulo invertido\n"+
    "5 triangulo con espacio en le centro\n"+
    "6 triangulo del dreves con espacio en el centro\n"+
    "7 rombo\n"+
    "8 rombo con espacio \n"+
    "9 piramide malla\n"+
    "10 escalera\n"))
switch (pregunta){
    case 1: cuadrado1();
    break
    case 2: cuadrado2();
    break
    case 3: triangulo1();
    break
    case 4: triangulo2();
    break
    case 5: triangulo3();
    break
    case 6: triangulo4();
    break
    case 7: rombo1();
    break
    case 8: rombo2();
    break
    case 9: piramideMalla();
    break
    case 10:escalera();
}

//dibuja Cuadrado sin interior
function cuadrado1() {
    let altura = Number(prompt("Digame la altura de sua cuadrado: "));
    let anchura = Number(prompt("Digame la anchura de su cuadrado: "));
    let contAltura = 1;



    let contAnchura = 0;
    while (contAnchura !== anchura) {
        process.stdout.write('*')
        contAnchura++;
    }


    console.log("")

    altura--
    while (contAltura < altura) {
        contAnchura = 1;
        if (contAnchura === 1) {
            process.stdout.write("*");
        }
        contAnchura++;
        while (contAnchura < anchura) {
            process.stdout.write(" ")
            contAnchura++;
        }
        if (contAnchura === anchura) {
            process.stdout.write("*")
        }
        contAltura++;
        console.log("")

    }

    contAnchura = 1
    while (contAnchura !== anchura) {
        process.stdout.write("*");
        contAnchura++;
    }

    process.stdout.write("*")

}
function cuadrado2(){
    let altura = Number(prompt("Digame la altura de sua cuadrado: "));
    let anchura = Number(prompt("Digame la anchura de su cuadrado: "));
    let cuadrado = "";

    for (let i = 0; i !== altura; i++){

        for (let j = 0; j !== anchura; j++){
            /*
            0.0 0.1 0.2 0.3
            1.0 1.1 1.2 1.3
            2.0 2.1 2.2 2.3
            3.0 3.1 3.2 3.3
             */

            if (i === 0|| j=== 0|| i === altura - 1|| j === anchura - 1){
                cuadrado += " * ";
            }else {
                cuadrado +="   "
            }

        }
        cuadrado += "\n"
    }
    return cuadrado;

}

//dibuja Triangulo con interior (boca arriba)

function triangulo1(){
    let altura = Number(prompt("Dime altura de el triangulo\n"))
    let contespacios = altura
    let contateriscos = 1
    let triangulo = "";
    for (let i = 0; i < altura; i++) {
        for (let j = 0; j <contespacios;j++){
            triangulo += "   ";
        }
        for(let h=0; h<contateriscos;h++){
            triangulo += " * "
        }
        contateriscos+=2
        contespacios--
        triangulo+="\n"
    }
    console.log(triangulo)
}
//dibuja Triangulo con interior (boca abajo)
function triangulo2(){
    let altura = Number(prompt("Dime altura de el triangulo\n"))
    let base = altura*2-1
    let contEspacios = 0;
    let piramide = "";
    for (let i = 0; i < altura; i++) {
        for (let h = 0; h < contEspacios; h++){
            piramide += "   "
        }
        for (let j = 0; j < base; j++){
            piramide += " * ";
        }
        base-=2
        contEspacios++
        piramide += "\n";
    }
    console.log(piramide)
}
//dibuja Triangulo sin interior (boca arriba)
function triangulo3(){
    let altura = Number(prompt("Dime altura de el triangulo\n"))
    let base = altura*2;
    let contespacios = altura
    let contespacios2 = 0;
    let contateriscos = 1;

    let triangulo = "";
    for (let i = 0; i < altura; i++) {
        for (let j = 0; j <contespacios;j++){
            triangulo += "   ";
        }
        triangulo += " * "
        for (let h = 0 ; h<contespacios2; h++){
            triangulo += "   ";
        }
        if (contespacios2>0){
            triangulo += " * "
        }
        contespacios2++
        if (contespacios2>1){
            contespacios2++
        }
        contateriscos+=2
        contespacios--
        triangulo+="\n"
    }
    for (let i = 0; i <= base; i++){
        triangulo+=" * "
    }
    console.log(triangulo)
}
//dibuja Triangulo sin interior (boca abajo)
function triangulo4(){
    let altura = Number(prompt("Dime altura de el triangulo\n"))
    let base = altura*2-1
    let contEspacios = 0;
    let piramide = "";
    for (let i = 0; i < altura; i--){
        piramide += " * "
    }
    for (let i = 0; i < altura; i++) {
        for (let h = 0; h <= contEspacios; h++){
            piramide += "   "
        }
        piramide += " * ";

        base-=2
        contEspacios++
        piramide += "\n";
    }
    console.log(piramide)
}
//dibuja Rombo con interior
function rombo1(){}
//dibuja Rombo sin interior
function rombo2(){}
//dibuja piramideMalla
function piramideMalla(){}
//dibuja escalera
function escalera(){
    let escalones = Number(prompt("Dime altura de el triangulo\n"))
    let contespacios = escalones
    let contateriscos = 1
    let triangulo = "";
    for (let i = 0; i < escalones; i++) {
        for (let j = 0; j <contespacios;j++){
            triangulo += "   ";
        }
        for(let h=0; h<=contateriscos;h++){
            triangulo += " * "
        }
        contateriscos++
        contespacios--
        triangulo+="\n"
    }
    console.log(triangulo)
}



