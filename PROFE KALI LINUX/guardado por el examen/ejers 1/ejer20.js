const prompt = require('prompt-sync')();
function reloj() {

    console.clear()
    let fecha = new Date();
    let dia = fecha.getDay();
    let hora = fecha.getHours();
    let mins = fecha.getMinutes();
    let seg = fecha.getSeconds();
    console.log('hoy es dia ' + dia + " y son las " + hora + ":" + mins + ":" + seg);

    setTimeout(reloj, 1000)
}

reloj()
function temporizador(){

    let tiempoMin = Number(prompt("introduzca los minutos que desea esperar  "))
    let tiempoSec = Number(prompt("introduzca los segundos que desea esperar  "))
    tempo2()

    function tempo2() {
        console.clear()

        console.log(tiempoMin + ":" + tiempoSec)
        tiempoSec--
        if (tiempoSec === 0) {

            tiempoMin--
            tiempoSec = 59
        }
        setTimeout(tempo2, 1000)
    }

}


/*

function reloj() {

    console.clear();

    seg++;

    if (hora === 24) {
        hora = 0;
        dia++;
    }

    if (mins === 60) {
        mins = 0;
        hora++;
    }

    if (seg === 60) {
        seg = 0;
        mins++;
    }

    let total = 'hoy es dia ' + dia + " y son las " + hora + ":" + mins + ":" + seg;
    console.log(total);

    setTimeout(reloj,1000);

}

reloj();
*/


