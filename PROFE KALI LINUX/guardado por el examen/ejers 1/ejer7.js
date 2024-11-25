const prompt = require("prompt-sync")({sigint: true});
    mes = Number(prompt("Escriba el mes (en numero): "))
    while (mes < 0 && mes > 12 ) {
        if (mes < 0 && mes > 12 ) {
            console.log("El numero del mes introducido es erroneo escribalo de nuevo")
            mes = Number(prompt("Escriba el mes (en numero): "))
        }
        }
    importe = Number(prompt("Escriba el importe de su compra: "))
    
    if (mes=10) {
        importeReducido = importe - (importe / 100 * 15)
        console.log("Su importe es reducido por mes de rebajas un 15% por lo tanto su importe total es: " + importe)
    } else if (mes != 10) {
    console.log("El importe no puede ser reducido" + importe)
}