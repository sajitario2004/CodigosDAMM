const prompt = require('prompt-sync')();
let num1 = Number(prompt("Ingrese el número: "));
let strDivisores = 'Los numero divisores del numero anterior son:';
let contdivisores = 0;
//Mediante el uso de modulo en un bucvle he ido sumando a un string que he creado antes los divisores del numero
// He hecho esto por que un divisor es aquiel numero menor a el numero original el cual al dividir al numero original no da resto
for (let i = 2; i < num1; i++) {
    if (num1 % i === 0) {
        strDivisores += String(i)+", ";
        contdivisores++;
    }
}

//Esto lo hice mas por comodidad de si el numero es primo y no tiene divisores que no sean el mismo numero y el 1 que imprima que no tiene divisores
if (contdivisores === 0) {
    console.log('El número no tiene divisores.');
}else {
    console.log(strDivisores);
}