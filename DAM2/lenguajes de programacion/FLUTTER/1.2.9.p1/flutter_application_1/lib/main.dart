


/*
Crea un procedimiento llamado adivinaElNumero que reciba un parámetro por nombre max. 
Este parámetro será obligatorio y su valor no podrá modificarse dentro del procedimiento.

La ejecución del procedimiento iniciará el juego Adivina el Número. El programa “pensará” 
un número aleatorio entre 0 y max, y el usuario deberá adivinarlo en el menor número de intentos posible.

Instrucciones:

El programa debe indicar si el número introducido es demasiado alto o demasiado bajo.
Cuando el jugador acierte, se mostrará un mensaje de felicitación y el número de intentos realizados.
Finalmente, se preguntará si desea jugar de nuevo (s/n).
Usa la clase Random disponible en la librería dart:math para generar el número aleatorio.
*/
import 'dart:io';
import 'dart:math' as math;

void adivinaElNumero({required int max}) {
  final random = math.Random();
  bool jugar = true;

  while (jugar) {
    int secreto = random.nextInt(max + 1);
    int intentos = 0;
    int? num;

    print('Adivina un número entre 0 y $max');

    do {
      stdout.write('Tu intento: ');
      num = int.tryParse(stdin.readLineSync() ?? '');
      
      if (num == null) {
        print('Número inválido');
        continue;
      }
      intentos++;
      if (num < secreto) print('Demasiado bajo');
      if (num > secreto) print('Demasiado alto');
    } while (num != secreto);

    print('¡Acertaste en $intentos intentos!');
    stdout.write('¿Jugar de nuevo? (s/n): ');
    if ((stdin.readLineSync() ?? '').toLowerCase() != 's') jugar = false;
  }
}

void main() {
  adivinaElNumero(max: 1000);
}
