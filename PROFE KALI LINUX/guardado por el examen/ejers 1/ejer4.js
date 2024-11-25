const prompt = require("prompt-sync")({sigint: true});
    a = prompt("introcuzca el primer numero ");
    b = prompt("introcuzca el segundo numero ");
    c = prompt("introcuzca el tercer numero ");

    if (a<0) {
        resul = a * b * c;
        console.log("El primer numero es negativo asi que multiplicaremos todos los numeros anteriores entre si:" +resul);
        
    }
    else {
        resul = Number(a) + Number(b) + Number(c);
        console.log("El primer numero es positivo, se procedera con la suma de ellos " + resul);
    }