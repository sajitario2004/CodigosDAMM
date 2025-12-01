import 'package:flutter/material.dart';
import 'package:vibration/vibration.dart';





class VibrationScreen extends StatefulWidget {
  const VibrationScreen({super.key});

  @override
  State<VibrationScreen> createState() => _VibrationScreenState();
}

class _VibrationScreenState extends State<VibrationScreen> {
  String mensajeResultado = 'Presiona un botón';

  Future<void> vibracionBasica() async {
    if (await Vibration.hasVibrator()) {
      Vibration.vibrate();
      setState(() {
        mensajeResultado = '¡Vibración básica! 📳';
      });
    }
  }

  Future<void> vibracionPersonalizada() async {
    if (await Vibration.hasVibrator()) {
      Vibration.vibrate(duration: 500);
      setState(() {
        mensajeResultado = '¡Medio segundo de vibración! ⏱️';
      });
    }
  }

  Future<void> vibracionSecuencia() async {
    if (await Vibration.hasVibrator()) {
      List<int> duraciones = [0, 200, 100, 200, 100, 500];
      Vibration.vibrate(pattern: duraciones);
      setState(() {
        mensajeResultado = '¡Patrón personalizado! 🎵';
      });
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Haciendo vibrar tu móvil'),
        centerTitle: true,
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            ElevatedButton(
              onPressed: vibracionBasica,
              child: const Text('Vibración básica'),
            ),
            const SizedBox(height: 20),
            ElevatedButton(
              onPressed: vibracionPersonalizada,
              child: const Text('Vibración de 500ms'),
            ),
            const SizedBox(height: 20),
            ElevatedButton(
              onPressed: vibracionSecuencia,
              child: const Text('Patrón personalizado'),
            ),
            const SizedBox(height: 40),
            Text(mensajeResultado, style: const TextStyle(fontSize: 18)),
          ],
        ),
      ),
    );
  }
}
