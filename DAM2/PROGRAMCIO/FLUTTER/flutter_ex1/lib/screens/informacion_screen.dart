import 'package:flutter/material.dart';

/// Pantalla simple de información.
class InformacionScreen extends StatelessWidget {
  const InformacionScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Informacion')),
      body: const Padding(
        padding: EdgeInsets.all(16),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text('Aplicación de Catalogo de Productos',
                style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold)),
            SizedBox(height: 12),
            Text('Autor: Ignacio Toledano Caneo'),
            SizedBox(height: 8),
            Text('Esta es al practica de layouts, naveación y widgets.'),
          ],
        ),
      ),
    );
  }
}
