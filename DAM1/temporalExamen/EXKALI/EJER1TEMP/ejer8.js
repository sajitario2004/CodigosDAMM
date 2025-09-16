const prompt = require("prompt-sync")({sigint: true});
    num1 = Number(prompt("Escriba un numero "))

    if (num1 == 0) {
        console.log("El numero introducido es erroneo por que es 0")
    } else 
    moduloNum = num1 % 2
    if (moduloNum == 0) {
        console.log("El numero introducido es par")
    } else if (moduloNum != 0) {
        console.log("El numero introducido es impar")
    }