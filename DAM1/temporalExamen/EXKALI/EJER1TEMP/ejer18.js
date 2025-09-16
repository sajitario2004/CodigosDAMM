const prompt = require('prompt-sync')();

let num = prompt('introduzca numero')
num = Number(num)

let i=0

while (i < num){
    for (let j = 0; j<num; j++){
        process.stdout.write('*')
    }
    process.stdout.write('\n')
    i++
}