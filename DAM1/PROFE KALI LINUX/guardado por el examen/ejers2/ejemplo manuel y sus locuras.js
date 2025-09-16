const prompt = require('prompt-sync')();

//-------------funcion para comrpobar si el numero es de entre 1 y 100


function leerNumero(mensaje, inicio_rango, fin_rango){

    let numUsu;

    do {
        numUsu = prompt(mensaje)
        numUsu = Number(numUsu)

    } while(numUsu < inicio_rango && numUsu > fin_rango);

    return numUsu
}

function comprobarValor(numUsu, numTrue){

    if (numUsu < numTrue){
        console.log("El numero introducido es menor al random")
        return -1
    } else if (numUsu === numTrue) {
        return 0
    } else if (numUsu > numTrue) {
        console.log('El numero introducido es mayor al random')
        return 1
    }

}


//let num = leerNumero('Introduzca numero ', 1, 100)

let num = 1;


let random = Math.floor(Math.random()*100+1)
console.log("\n" + random + "\n")


while (comprobarValor(num,random)!==0) {
    num = leerNumero('Introduzca numero ', 1, 100)
}

let correcto = random
correcto = Number(correcto)

console.log("El numero introducido es correcto y es " + correcto)