const prompt = require('prompt-sync')();

let personEmpres = prompt('introduzca el numero de personas que hay en su empresa; ')
personEmpres = Number(personEmpres)


let nHijos = 0;
let pregunta1 = 'Cuantos hijos tienes? '
let comprob = 0
comprob = Boolean(comprob)
comprob = true

nHijos = Number(nHijos);

nHijos = conteoHijos(personEmpres, pregunta1, comprob)
console.log('En total hay '+nHijos)
console.log(nHijos)

function conteoHijos(pE, pregunta, comprob) {
    let todosHijos = 0
    todosHijos = Number(todosHijos)

    let personasConHijos = 0
    let personasSin = 0
    let numHijos = 0
    personasConHijos = Number(personasConHijos)
    personasSin = Number(personasSin)

    for (let i = pE; i !==0; i--) {
        numHijos = prompt(pregunta)
        numHijos = Number(numHijos)

        if (numHijos < 0){
            i = 1
            comprob = false
        }else {
            if (numHijos === 0) {

                personasSin += 1

            } else {

                personasConHijos += 1

            }

            todosHijos += numHijos
        }
        numHijos = 0
    }
    if (comprob) {
        console.log('El numero de personas sin hijos es ' + personasSin)
        console.log('El numero de personas con hijos es ' + personasConHijos)
    }else {
        console.log('Uno de los valores introducidos es incorrecto')
    }

    return todosHijos

}
