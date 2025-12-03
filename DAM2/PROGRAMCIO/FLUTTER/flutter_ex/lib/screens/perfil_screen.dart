// lib/screens/perfil_screen.dart
import 'package:flutter/material.dart';
import '../services/settings_service.dart';

/// PerfilScreen: permite al usuario escribir su nombre y guardarlo en SharedPreferences.
/// Clave usada: "nombreUsuario" (requisito).
/// Muestra SnackBar indicando que el nombre ha sido guardado.
class PerfilScreen extends StatefulWidget {
  const PerfilScreen({super.key});

  @override
  State<PerfilScreen> createState() => _PerfilScreenState();
}

class _PerfilScreenState extends State<PerfilScreen> {
  final TextEditingController _controller = TextEditingController();

  @override
  void initState() {
    super.initState();
    // Carga el nombre previamente guardado (si existe).
    _controller.text = SettingsService.instance.nombreUsuario;
  }

  @override
  void dispose() {
    _controller.dispose();
    super.dispose();
  }

  Future<void> _guardarNombre() async {
    final nombre = _controller.text.trim();
    await SettingsService.instance.guardarNombreUsuario(nombre);
    // Mostrar SnackBar confirmando guardado.
    ScaffoldMessenger.of(context).showSnackBar(
      const SnackBar(content: Text('Nombre guardado')),
    );
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Perfil / Configuracion')),
      body: Padding(
        padding: const EdgeInsets.all(16),
        child: Column(crossAxisAlignment: CrossAxisAlignment.start, children: [
          const Text('Introduce tu nombre:', style: TextStyle(fontSize: 16)),
          const SizedBox(height: 8),
          TextField(
            controller: _controller,
            decoration: const InputDecoration(
              border: OutlineInputBorder(),
              hintText: 'Tu nombre',
            ),
          ),
          const SizedBox(height: 20),
          Center(
            child: ElevatedButton(
              onPressed: _guardarNombre,
              child: const Text('Guardar nombre'),
            ),
          ),
        ]),
      ),
    );
  }
}
