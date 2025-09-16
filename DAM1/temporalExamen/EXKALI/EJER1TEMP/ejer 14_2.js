const prompt = require("prompt-sync")()

let num1 = prompt("introduzca un numero");

let contador = 0;
let acomulador = 2;

for (let contador = 1; contador <= num1 ; contador ++) {
    acomulador += 2 * contador;
}

console.log(acomulador);