const prompt = require("prompt-sync")({sigint: true});


a = prompt("introduzca a: ")
b = prompt("introduzca b: ")

swap = a
a = b
b = swap

console.log("A ahora es:" + a + " y b es ahora: " + b)