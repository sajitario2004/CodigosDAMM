const prompt = require('prompt-sync')();


function leer1(mensaje, inicio_rango, fin_rango){

    let n1 = prompt (mensaje);

    n1 = Number(n1);

    if (n < inicio_rango || n > fin_rango){
        console.error('El valor que tiene que estar entre \n('+ inicio_rango + ' y ' + fin_rango +')')
    }

    return n1;
}



/**fat arrow o lamba: con "const" crearemos una constante que no se puede cambiar
 * vamos que luego no podemos cambiarle el valor de la variable
 */

/*
const leer2(mensaje)=>{


    let n = prompt(mensaje)

    n = Number(n);

    return n
}
*/

//funcion anonima

/*
const leer = funtion (mensaje)=>{}
 */

/*
(Math.random()*100+1).toFixed(0) -- devolvera una cadena de texto con el numero aleatorio = '0'
Math.floor(Math.random()*100+1) --- devolvera un numero tipo numero aleatorio = 0
 */