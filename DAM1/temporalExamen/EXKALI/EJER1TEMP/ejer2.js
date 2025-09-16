const prompt = require("prompt-sync")({sigint: true});
aSTR = prompt("Introduzca a: ");
bSTR = prompt("Introduzca b: ");

aNUM = Number(bSTR);
bNUM = Number(aSTR);

resultado = aNUM + bNUM;

console.log("a + b =" + resultado );