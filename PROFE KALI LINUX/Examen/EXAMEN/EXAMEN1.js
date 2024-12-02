const prompt = require('prompt-sync')();


let precioTotal = 0
//Llamo a la función para leer los valores
precioTotal = leerValor();
console.log("El precio total de todas las entradas es:" + precioTotal+" Con los descuentos aplicados.");

function leerValor(){
    let precio = Number(prompt("¿Cuánto cuesta el ticket? "));
    let numeroAsistentes = Number(prompt("¿Cuántos asistentes soy? "));
    let contAsistentes = 0;
    let precioTotal=0;
    //En esta misma funcion para averiguar el precio total llamo a otra funcio llamada getDescuento() para calcular el descuento según la edad.
    //Esto lo voy a ir sumando a una variable que va a ser luego la que devuelva al usuario.
    for (let i = 1; i <= numeroAsistentes;i++) {
        let edad = Number(prompt("¿Cuántos años tiene el asistente numero "+ i +"? "));
        precioTotal+= getDescuento(edad, precio);
        if (edad < 5) {
            console.log("Este asistente no puede entrar al teatro no se le contara como asistente.");
        }else{
            contAsistentes++;
        }
    }
    console.log("Se contarán como asistentes: " + contAsistentes +" precio");
    return precioTotal;
}

// Esta función va reciviendo la edad de cada asistente comprueba segun la edad el precio con el descuento y se lo devuelve con el descuento.
function getDescuento(edad, precio){
    if(edad > 100) {
        while (edad > 100) {
            edad = prompt("Por favor, introduce una edad válida (entre 5 y 100 años): ");
        }
    }else if(edad >= 5 && edad <= 14){
        return precio * 0.7;
    }else if(edad > 14 && edad <= 19){
        return precio * 0.75;
    }else if(edad > 19 && edad <=40){
        return precio * 0.9;
    }else if(edad > 40 && edad <= 65){
        return precio * 0.75;
    }else if(edad > 65){
        return precio * 0.7;
    }else if(edad < 5){
        return 0;
    }
}