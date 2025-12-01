import 'package:flutter/material.dart';
import 'package:receta1_vibrar_dispositivo/screens/home_screen.dart';
import 'package:receta1_vibrar_dispositivo/screens/vibration_screen.dart';



void main() {
    // Inicia la aplicación
    runApp(const MyApp());

}

class MyApp extends StatelessWidget {
    const MyApp({super.key});
    @override
    Widget build(BuildContext context) {
        return MaterialApp(
            title: 'Recetas Flutter',
            theme: ThemeData(
              primaryColor: Colors.deepOrange
            ),
            initialRoute: '/',
            routes: {
                '/': (contex) => ReceiptsHome(),
                '/vibration': (contex) => VibrationScreen(),
                // ... más rutas
            },
        ); 
    }
}