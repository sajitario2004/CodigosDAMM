// lib/main.dart
import 'package:flutter/material.dart';
import 'screens/home_screen.dart';
import 'services/settings_service.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();

  // Inicializa SharedPreferences y carga valores
  await SettingsService.instance.init();

  runApp(const GameVaultApp());
}

class GameVaultApp extends StatefulWidget {
  const GameVaultApp({super.key});

  @override
  State<GameVaultApp> createState() => _GameVaultAppState();
}

class _GameVaultAppState extends State<GameVaultApp> {
  // Escucha cambios en el ValueNotifier del servicio
  @override
  void initState() {
    super.initState();
    SettingsService.instance.darkMode.addListener(_onThemeChanged);
  }

  @override
  void dispose() {
    SettingsService.instance.darkMode.removeListener(_onThemeChanged);
    super.dispose();
  }

  void _onThemeChanged() {
    setState(() {}); // refresca la app cuando el tema cambia
  }

  @override
  Widget build(BuildContext context) {
    final isDark = SettingsService.instance.darkMode.value;

    return MaterialApp(
      title: 'GameVault',
      theme: ThemeData(
        useMaterial3: true,
        colorSchemeSeed: Colors.deepPurple,
        brightness: Brightness.light,
      ),
      darkTheme: ThemeData(
        useMaterial3: true,
        colorSchemeSeed: Colors.deepPurple,
        brightness: Brightness.dark,
      ),
      themeMode: isDark ? ThemeMode.dark : ThemeMode.light,
      home: const HomeScreen(),
    );
  }
}