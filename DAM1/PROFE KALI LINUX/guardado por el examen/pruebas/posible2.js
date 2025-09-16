const prompt = require('prompt-sync')();

function suma(numero1, numero2){
let resultado = numero1 + numero2;
return resultado;
}

let eduardo = Number(prompt("ingrese numero1  "))
let rigoberto = Number(prompt("ingrese numero2  "))

let resultado = suma(eduardo, rigoberto)

console.log("El resultado es "+ resultado)

