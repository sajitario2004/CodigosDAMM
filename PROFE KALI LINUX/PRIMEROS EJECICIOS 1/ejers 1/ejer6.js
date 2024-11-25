const prompt = require("prompt-sync")({sigint: true});
    ChicosNum = Number(prompt("Cuantos chicos hay?"))
    ChicasNum = Number(prompt("Cuantas chicas hay?"))

    total = ChicasNum + ChicosNum
    ChicosPorcen = ChicosNum/total * 100
    ChicasPorcen = ChicasNum/total * 100
    ChicosPorcen = Math.round(ChicosPorcen)
    ChicasPorcen = Math.round(ChicasPorcen)

    console.log("el total de alumnos es " + total + ". El porcentaje de chicos es "+ ChicosPorcen +"% y el de chicas es "+ ChicasPorcen +"%")