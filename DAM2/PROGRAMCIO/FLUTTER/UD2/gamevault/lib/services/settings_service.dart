// lib/services/settings_service.dart
import 'package:flutter/foundation.dart';
import 'package:shared_preferences/shared_preferences.dart';

class SettingsService {
  SettingsService._();

  static final SettingsService instance = SettingsService._();

  SharedPreferences? _prefs;

  // Notifier para tema (permite que la UI se entere)
  final ValueNotifier<bool> darkMode = ValueNotifier<bool>(false);

  // Preferencias simples
  String username = '';
  String preferredPlatform = 'PC';

  // Inicializar (llamar desde main)
  Future<void> init() async {
    _prefs = await SharedPreferences.getInstance();
    darkMode.value = _prefs?.getBool('darkMode') ?? false;
    username = _prefs?.getString('username') ?? '';
    preferredPlatform = _prefs?.getString('preferredPlatform') ?? 'PC';
  }

  // Guardar tema
  Future<void> setDarkMode(bool value) async {
    darkMode.value = value;
    await _prefs?.setBool('darkMode', value);
  }

  // Guardar username
  Future<void> setUsername(String value) async {
    username = value;
    await _prefs?.setString('username', value);
  }

  // Guardar plataforma preferida
  Future<void> setPreferredPlatform(String value) async {
    preferredPlatform = value;
    await _prefs?.setString('preferredPlatform', value);
  }
}