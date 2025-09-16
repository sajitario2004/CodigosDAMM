const prompt = require('prompt-sync')();
//-----------funcion 1: comprobacion de si el numero introducido esta en el rango---------
function leer(mensaje, inicio_rango, fin_rango) {

    let n;
    do {

        n = prompt(mensaje)
        n = Number(n)

    }while (n < inicio_rango || n > fin_rango)

    return n;
}
//----------funcion 2: comrpobacion si el numero es el correcto-----------------------------
function comprobarValor(numUsu, numOk) {
    if (numUsu<numOk){
        console.log('Numero introducido es menor')
        return -1;
    }else if (numUsu===numOk){
        console.log('Numero introducido es igual')
        return 0;
    }else {
        console.log('Numero introducido es mayor')
        return 1;
    }
}


let aleatorio = Math.floor(Math.random()*100+1)
console.log(aleatorio)

let num = leer('Introduzca un valor entre 1 y 100 ', 1, 100)

while (comprobarValor(num,aleatorio)!==0){
    num = leer("Introduzca valor entre 1 y 100 ", 1, 100)
}

console.log(num)