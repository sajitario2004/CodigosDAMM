// lib/services/settings_service.dart
import 'package:shared_preferences/shared_preferences.dart';

/// SettingsService: gestiona SharedPreferences de forma sencilla.
/// Guarda y carga el nombre del usuario con la clave "nombreUsuario".
class SettingsService {
  SettingsService._private();
  static final SettingsService instance = SettingsService._private();

  late SharedPreferences _prefs;

  // Clave usada para almacenar el nombre del usuario (requisito).
  static const String keyNombreUsuario = 'nombreUsuario';

  String _nombreUsuario = 'Nacho';

  /// Inicializa SharedPreferences y carga el nombre si está guardado.
  Future<void> init() async {
    _prefs = await SharedPreferences.getInstance();
    _nombreUsuario = _prefs.getString(keyNombreUsuario) ?? '';
  }

  /// Devuelve el nombre almacenado.
  String get nombreUsuario => _nombreUsuario;

  /// Guarda el nombre en SharedPreferences con la clave "nombreUsuario".
  Future<void> guardarNombreUsuario(String nombre) async {
    _nombreUsuario = nombre;
    await _prefs.setString(keyNombreUsuario, nombre);
  }
}
