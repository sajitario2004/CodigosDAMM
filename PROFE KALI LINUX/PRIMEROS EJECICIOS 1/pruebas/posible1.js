const prompt = require('prompt-sync')();

let cudrado = "";
cudrado = cuadrado2()
console.log(cudrado)

//dibuja Cuadrado sin interior
function cuadrado1() {
    let altura = Number(prompt("Digame la altura de sua cuadrado: "));
    let anchura = Number(prompt("Digame la anchura de su cuadrado: "));
    let contAltura = 1;



    let contAnchura = 0;
    while (contAnchura !== anchura) {
        process.stdout.write('*')
        contAnchura++;
    }


    console.log("")

    altura--
    while (contAltura < altura) {
        contAnchura = 1;
        if (contAnchura === 1) {
            process.stdout.write("*");
        }
        contAnchura++;
        while (contAnchura < anchura) {
            process.stdout.write(" ")
            contAnchura++;
        }
        if (contAnchura === anchura) {
            process.stdout.write("*")
        }
        contAltura++;
        console.log("")

    }

    contAnchura = 1
    while (contAnchura !== anchura) {
        process.stdout.write("*");
        contAnchura++;
    }

    process.stdout.write("*")

}
function cuadrado2(){
    let altura = Number(prompt("Digame la altura de sua cuadrado: "));
    let anchura = Number(prompt("Digame la anchura de su cuadrado: "));
    let cuadrado = "";

    for (let i = 0; i !== altura; i++){

        for (let j = 0; j !== anchura; j++){
            /*
            0.0 0.1 0.2 0.3
            1.0 1.1 1.2 1.3
            2.0 2.1 2.2 2.3
            3.0 3.1 3.2 3.3
             */

            if (i === 0|| j=== 0|| i === altura - 1|| j === anchura - 1){
                cuadrado += " * ";
            }else {
                cuadrado +="   "
            }

        }
        cuadrado += "\n"
    }
    return cuadrado;

}

//dibuja Triangulo sin interior (boca arriba y boca abajo)




/*
5.6

1.1 ----- 1.6
2.1
3.1
4.1
5.1
*/
