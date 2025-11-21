import module_name                          #this import import all contend for module_name

from module_name import function_name       #this import is only for the function function_name
from module_name import function_name as fn #this import import funtion_name AK fn
from module_name import *                   #this import import every funtion of module_name

respuesta1 = function_name(2,5)
respuesta2 = fn(1,2)
respuesta3 = module_name.function_name(3,4)

print(respuesta1)
print(respuesta2)
print(respuesta3)