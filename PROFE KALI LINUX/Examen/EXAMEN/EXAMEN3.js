const prompt = require('prompt-sync')();
//
let eleccion = Number(prompt("Seleccione la figura que desea dibujar:   1. Figura 8 2. Figura X "));
let num = Number(prompt("(Si has elegido la x entoces tienes que introducir un nuemro impar)Ingrese un número de la altura: "));
if (eleccion === 1) {
    dibujarFigura8(num);
}else if (eleccion === 2) {
    dibujarFiguraX(num)
}else {
    console.log("Opción no válida el programa finaliza");
}

// Dibuja la figura 8
function dibujarFigura8(num) {
    let variableFigura8 = '';
    let strHuecoDel8 = '';
    let nHuec81 = Number(num);
    let nHuec82 = 3 * nHuec81;
    console.log(variableFigura8);
    //bucle para hacer el string de los huecos con los 3 asteriscos a cada lateral
    for (let i = 0; i < nHuec81; i++) {
        strHuecoDel8 += '***';
        for (let j = 0; j < nHuec82; j++) {
            strHuecoDel8 += ' ';
        }
        strHuecoDel8 += '***'
        strHuecoDel8 += '\n';
    }
    console.log(variableFigura8);

    let anchoFigura8 = 6 + nHuec82;
    //bucle para hacer las 2 primeras filas de arteriscos
    for (let i = 0; i < 2; i++) {
        for (let j = anchoFigura8; j > 0; j--) {
            variableFigura8 += '*';
        }
        variableFigura8 += '\n';
    }

    //la variable con el string de los huecos y los asteriscos en los laterales la sumo a la variable donde estoy almacenando la figura 8
    variableFigura8 += strHuecoDel8;
    //vuelvo ha hacer 2 fillas de asteriscos en la parte inferior y se las voy sumando a la variable original
    for (let i = 0; i < 2; i++) {
        for (let j = anchoFigura8; j > 0; j--) {
            variableFigura8 += '*';
        }
        variableFigura8 += '\n';
    }

    //vuelvo ha la variable con el string de los huecos y los asteriscos en los laterales la sumo a la variable donde estoy almacenando la figura 8
    variableFigura8 += strHuecoDel8;

    //hago las ultimas 2 filas de asteriscos y las sumo al la variable original
    for (let i = 0; i < 2; i++) {
        for (let j = anchoFigura8; j > 0; j--) {
            variableFigura8 += '*';
        }
        variableFigura8 += '\n';
    }
    console.log(variableFigura8);
}

// Dibuja la figura X
function dibujarFiguraX(num) {
    if (num % 2 !== 0) {


        let variableFiguraX = '';
        let nHuecX1 = Number(((num - 1) / 2));
        let nHuecX2 = Number((num - 1) / 2);
        let contEspacios1 = num - 2;
        let contEspacios2 = 0;
        //hago un triangulo invertido como con vacio en el centro pero sin la base y ya tengo la parte de arriba de la X
        for (let i = 0; i < nHuecX1; i++) {
            for (let j = 0; j < contEspacios2; j++) {
                variableFiguraX += ' ';
            }
            variableFiguraX += '*';
            for (let j = 0; j < contEspacios1; j++) {
                variableFiguraX += ' ';
            }
            variableFiguraX += '*';
            variableFiguraX += '\n';
            contEspacios1 -= 2;
            contEspacios2++;
        }
        for (let i = 0; i < contEspacios2; i++) {
            variableFiguraX += ' ';
        }
        variableFiguraX += '*';
        variableFiguraX += '\n';
        contEspacios2--;
        contEspacios1 += 2;
        //aprobechando los contadores anteriores hago el triangulo de manera correcta sin punta y sin base 
        for (let i = 0; i < nHuecX2; i++) {
            for (let j = 0; j < contEspacios2; j++) {
                variableFiguraX += ' ';
            }
            variableFiguraX += '*';
            for (let j = 0; j < contEspacios1; j++) {
                variableFiguraX += ' ';
            }
            variableFiguraX += '*';
            variableFiguraX += '\n';
            contEspacios1 += 2;
            contEspacios2--;
        }
        console.log(variableFiguraX);
    } else {
        console.log("El número de la altura debe ser impar");
    }
}