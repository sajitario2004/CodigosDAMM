//4. Se pide representar el algoritmo que nos calcule
//la suma de los N primeros números pares. Es decir,
//si insertamos un 5, tendremos la suma de 2+4+6+8+10.
const prompt = require('prompt-sync')();

let num = prompt('Introduzca número:')

num = Number(num);

//Patrón contador - Inicialización
let contadorSec = 2;
let contadorNumPares = 1;
//Patrón acumulador - Inicialización
let acumulador = 0;
let acumStr = '0';

//Patrón contador - Condición de salida
while (contadorNumPares <= num) {

//Patrón acumulador - acumular
acumulador = acumulador + contadorSec; // 0+2, 2+4, 2+4+6
acumStr = acumStr + '+' + contadorSec; // '0+2', '0+2+4'

//Patrón contador - Incremento
contadorSec = contadorSec +2; // 4, 6, 8
contadorNumPares = contadorNumPares +1;
}

console.log(acumStr + ' = '+ acumulador);