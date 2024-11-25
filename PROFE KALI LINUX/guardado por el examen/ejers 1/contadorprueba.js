const prompt = require('prompt-sync')();

let num = prompt("dime un numero")
num = Number(num)
let contador = prompt("Dime las veces que quieres que sume ese numero a si mismo ")



let sumaTotalNum = 0
sumaTotalNum = Number(sumaTotalNum)

/*
while (contador !== 0){
    sumaTotalNum += num
    contador--;
}

console.log(sumaTotalNum)*/

for (let i = contador ; i !==0 ;i--) {
    sumaTotalNum += num
}
console.log(sumaTotalNum)