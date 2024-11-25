const prompt = require("prompt-sync")({sigint: true});
    aStr = prompt("Introduzca numero: ")
    aNum = Number(aStr)
    if (aNum > 0) {
        aRaiz = Math.sqrt(aNum)
        aCuadrado = Math.pow(aNum,2)
        console.log("La raiz es " + aRaiz + " u su cuadrado es " + aCuadrado)
        
    } else { 
        console.log("El numero que an introducido es negativo no se puede puede hacer la raiz")

    }