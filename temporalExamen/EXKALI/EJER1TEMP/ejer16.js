const prompt = require("prompt-sync")({sigint: true});
let num = 0;
num = prompt("introduzca Numero")
num = Number(num)
while ( num > 0 ) {
    console.log(`el numero introducido es ${num}...`);
    num = prompt("introduzca Numero");
    num = Number(num)
}
