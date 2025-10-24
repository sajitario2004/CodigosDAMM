Copia el siguiente contenido a un archivo llamado empleados.txt.
nombre;edad;departamento
Ana;32;Contabilidad
Luis;27;Marketing
Carlos;40;Sistemas


Lee el archivo empleados.txt y muestra su contenido en consola.


Crea una clase Empleado con los atributos nombre, edad y departamento, y guarda los datos leídos en una lista de objetos Empleado.


Convierte la lista de empleados a formato JSON utilizando la librería Gson y guarda el resultado en un archivo empleados.json. Cada ejecución de tu aplicación debe sobrescribir el JSON completo, no agregar los datos a los existentes.


Gestiona los posibles errores de lectura o escritura mediante try-with-resources. Si se produce un error, el programa debe:
Mostrar un mensaje de error en consola.
Registrar el mismo mensaje en un archivo errores.log.