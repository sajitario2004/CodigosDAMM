// lib/screens/informacion_screen.dart
import 'package:flutter/material.dart';
import '../services/settings_service.dart';

/// InformacionScreen: texto sencillo sobre la aplicación.
/// Incluye el nombre guardado (si existe).
class InformacionScreen extends StatelessWidget {
  const InformacionScreen({super.key});

  @override
  Widget build(BuildContext context) {
    final nombre = SettingsService.instance.nombreUsuario;

    return Scaffold(
      appBar: AppBar(title: const Text('Informacion')),
      body: Padding(
        padding: const EdgeInsets.all(16),
        child: Column(crossAxisAlignment: CrossAxisAlignment.start, children: [
          Text('Catalogo de Productos - Practica', style: Theme.of(context).textTheme.titleLarge),
          const SizedBox(height: 12),
          const Text('Autor: Ignacio Toledano Caneo'),
          const SizedBox(height: 8),
          const Text('Versión: 1.0.0.0.0.0.0.0.0.1'),
          const SizedBox(height: 12),
          const Text('ejemplo para practicar layouts, navegación, SharedPreferences y permisos.'),
          const SizedBox(height: 20),
          if (nombre.isNotEmpty) Text('Nombre guardado: $nombre'),
        ]),
      ),
    );
  }
}
