// lib/main.dart
import 'package:flutter/material.dart';
import 'screens/home_screen.dart';
import 'services/settings_service.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();

  // Inicializa SharedPreferences y carga valores guardados (nombreUsuario, etc.)
  await SettingsService.instance.init();

  runApp(const CatalogoApp());
}

/// CatalogoApp: App principal que usa MaterialApp y controla el tema según SettingsService.
/// Incluye título visible en AppBar (requisito del ejercicio).
class CatalogoApp extends StatefulWidget {
  const CatalogoApp({super.key});

  @override
  State<CatalogoApp> createState() => _CatalogoAppState();
}

class _CatalogoAppState extends State<CatalogoApp> {
  @override
  void initState() {
    super.initState();
    // Si en el futuro quieres observar valores reactivos, añade listeners aquí.
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Catálogo de Productos',
      theme: ThemeData(
        useMaterial3: true,
        colorSchemeSeed: const Color.fromARGB(255, 255, 0, 0),
        brightness: Brightness.light,
      ),
      home: const HomeScreen(),
    );
  }
}
