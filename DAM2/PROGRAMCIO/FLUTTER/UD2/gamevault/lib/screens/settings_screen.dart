// lib/screens/settings_screen.dart
import 'package:flutter/material.dart';
import '../services/settings_service.dart';

class SettingsScreen extends StatefulWidget {
  const SettingsScreen({super.key});

  @override
  State<SettingsScreen> createState() => _SettingsScreenState();
}

class _SettingsScreenState extends State<SettingsScreen> {
  final usernameController = TextEditingController();
  String plataforma = 'PC';

  @override
  void initState() {
    super.initState();
    final s = SettingsService.instance;
    usernameController.text = s.username;
    plataforma = s.preferredPlatform;
  }

  @override
  void dispose() {
    usernameController.dispose();
    super.dispose();
  }

  Future<void> _saveAll() async {
    final s = SettingsService.instance;
    await s.setUsername(usernameController.text);
    await s.setPreferredPlatform(plataforma);
    // darkMode se guarda al cambiar el switch (ver abajo)
    ScaffoldMessenger.of(context).showSnackBar(
      const SnackBar(content: Text('Preferencias guardadas')),
    );
  }

  @override
  Widget build(BuildContext context) {
    final s = SettingsService.instance;

    return Scaffold(
      appBar: AppBar(title: const Text('Ajustes')),
      body: Padding(
        padding: const EdgeInsets.all(16),
        child: SingleChildScrollView(
          child: Column(crossAxisAlignment: CrossAxisAlignment.start, children: [

            // Usuario
            const Text('Nombre de usuario', style: TextStyle(fontSize: 16)),
            const SizedBox(height:8),
            TextField(
              controller: usernameController,
              decoration: const InputDecoration(
                border: OutlineInputBorder(),
                hintText: 'Introduce tu nombre',
              ),
            ),

            const SizedBox(height:20),

            // Tema (Switch que guarda inmediatamente)
            ValueListenableBuilder<bool>(
              valueListenable: s.darkMode,
              builder: (_, isDark, __) {
                return SwitchListTile(
                  title: const Text('Tema oscuro'),
                  value: isDark,
                  onChanged: (v) async {
                    await s.setDarkMode(v);
                    // setState no es necesario para el switch porque ValueListenableBuilder actualiza
                  },
                );
              },
            ),

            const SizedBox(height:20),

            // Plataforma preferida (RadioGroup + RadioListTile)
            const Text('Plataforma preferida', style: TextStyle(fontSize:16)),
            RadioGroup<String>(
              groupValue: plataforma,
              onChanged: (value) => setState(() { plataforma = value!; }),
              child: Column(
                children: <Widget>[
                  RadioListTile<String>(
                    value: 'PC',
                    title: const Text('PC'),
                  ),
                  RadioListTile<String>(
                    value: 'PS5',
                    title: const Text('PS5'),
                  ),
                  RadioListTile<String>(
                    value: 'Switch',
                    title: const Text('Switch'),
                  ),
                ],
              ),
            ),

            const SizedBox(height:30),

            Center(
              child: ElevatedButton(
                onPressed: _saveAll,
                child: const Text('Guardar ajustes'),
              ),
            ),
          ]),
        ),
      ),
    );
  }
}