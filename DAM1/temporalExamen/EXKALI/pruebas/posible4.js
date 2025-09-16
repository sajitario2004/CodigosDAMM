const prompt = require('prompt-sync')();

let altura = Number(prompt("Dime la altura del triangulo"))

let base1 = altura * 2 -1


    let triangulo = "";
    let contadorBase = base1;
    for (let i = base1;i !==0; i--){
        triangulo += " * ";
    }

    let espacios = "";
    let contadorEspaciosCEntro = base1-2
    let espaciosCentro= "";
    triangulo += "\n"


    for (let i = altura; altura < 0; i-- ){
        for (let j = base1; j !== 0;j-- ) {
            espacios += "   ";
            triangulo += espacios;
            triangulo += " * "
            contadorEspaciosCEntro-=2
            for (let h = contadorEspaciosCEntro; h !== 0;h--){
                triangulo+="   "
            }
            triangulo += " * "
        }
        triangulo += "\n"
    }
    console.log(triangulo)
