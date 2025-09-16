const prompt = require('prompt-sync')();

let pregunta


    var tiempoMin = Number(prompt("dime los minutos  "))
    var tiempoSec = Number(prompt("dime los segundos  "))

    if (tiempoSec > 59 || tiempoSec < 0 || tiempoMin < 0) {
        console.clear()
        console.log("Tienes gay grado 2 c5 en techo de chapa pancho de los huevos, y c1 en cuñao, viruela del mono coño cebolla")
    } else {
        temp2()

        function temp2() {
            console.clear()

            console.log(tiempoMin + ":" + tiempoSec)
            tiempoSec--;
            if (tiempoSec === -1) {
                tiempoMin--
                tiempoSec = 59
            }
            if (tiempoMin === 0 && tiempoSec === 0) {
                console.clear()
                console.log("tu madre en tanga")
            } else {
                setTimeout(temp2, 1000)
            }

        }


}
