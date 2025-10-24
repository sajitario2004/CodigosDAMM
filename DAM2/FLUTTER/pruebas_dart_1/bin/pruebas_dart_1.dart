import 'dart:io';

import 'package:args/args.dart';
import 'dart:io'; 

/*

Realiza un programa en Dart que solicite al usuario su nombre y edad, y luego imprima un mensaje personalizado en la consola.

El programa debe seguir estos pasos:

Solicitar al usuario que escriba su nombre.
Solicitar al usuario que escriba su edad.
Mostrar un mensaje en la consola que diga: "Hola, [nombre]. Tienes [edad] años."
Utiliza las funciones de entrada y salida por consola en Dart para lograr esto.

Todavía no es necesario que controles posibles errores, como asegurarte de que la 
edad sea un número válido, pero si te ves con ánimo investiga cómo hacerlo 
(es muy similar a otros lenguajes).

 */


void main() {
  print("¿Cómo te llamas? "); 
  String? nombre = stdin.readLineSync();

  print("¿Cuántos años tienes? "); 
  String? entradaEdad = stdin.readLineSync();
  int edad = int.parse(entradaEdad!);

  stdout.write("Hola $nombre, tienes $edad años\n");

}
