import 'dart:io';


void main() {
  print(" ---Ejecucion ejercicio: 1.2.2.6---");
  print("Dime tu nombre de usuario");
  String? nombre_usu= stdin.readLineSync();
  print("Dime tu edad");
  int edad = int.parse(stdin.readLineSync()!);
  print("Dime a que ciudad perteneces");
  String? ciudad = stdin.readLineSync();
  print("Dime tu puntuacion media");
  double puntuacion = double.parse(stdin.readLineSync()!);
  print("Tienes el premium broustone? true or false");
  bool premium = bool.parse(stdin.readLineSync()!);

  String respuesta = comprob(premium);
  print("tu nombre es: $nombre_usu tienes $edad años \n " + 
    "Tu ciudad es $ciudad tienes una puntuacion de $puntuacion \n"+
    "$respuesta .");


}

String comprob(bool x) {
  String respuesta;
  if (x == true){
    respuesta= "si tienes premium";
    return respuesta;
  }else {
    respuesta = "no tienes premium bro ";
    return respuesta;
  }
}