// lib/screens/mi_ubicacion_screen.dart
import 'package:flutter/material.dart';
import '../services/settings_service.dart';

/// MiUbicacionScreen:
/// - Debe solicitar permiso de ubicación y obtener coordenadas GPS.
/// - Aquí se implementa una versión que SIMULA la petición de permiso y devuelve coordenadas
///   porque en este proyecto solo usamos las dependencias del .txt (no añadimos geolocator).
///
/// Comentarios importantes (ver abajo): para obtener ubicación real debes añadir el paquete
/// 'geolocator' y configurarlo en Android/iOS. En el código real usarías Geolocator.checkPermission()
/// y Geolocator.getCurrentPosition(). Aquí mostramos la lógica de control y manejo de casos.
class MiUbicacionScreen extends StatefulWidget {
  const MiUbicacionScreen({super.key});

  @override
  State<MiUbicacionScreen> createState() => _MiUbicacionScreenState();
}

class _MiUbicacionScreenState extends State<MiUbicacionScreen> {
  String? _nombre;
  bool _loading = true;
  bool _permisoDenegado = false;
  double? _lat;
  double? _lon;

  @override
  void initState() {
    super.initState();
    _nombre = SettingsService.instance.nombreUsuario;
    // Intentamos "pedir permiso" y obtener ubicación (simulado).
    _pedirPermisoYObtenerUbicacion();
  }

  Future<void> _pedirPermisoYObtenerUbicacion() async {
    // --- Simulación de flujo de permisos / GPS ---
    // Mostramos un diálogo que simula pedir permiso al usuario.
    await Future.delayed(const Duration(milliseconds: 300));
    final permiso = await showDialog<bool>(
      context: context,
      barrierDismissible: false,
      builder: (ctx) {
        return AlertDialog(
          title: const Text('Permiso de ubicación'),
          content: const Text('¿Permites que la app acceda a tu ubicación? (SIMULACIÓN)'),
          actions: [
            TextButton(onPressed: () => Navigator.of(ctx).pop(false), child: const Text('Denegar')),
            ElevatedButton(onPressed: () => Navigator.of(ctx).pop(true), child: const Text('Permitir')),
          ],
        );
      },
    );

    if (permiso == true) {
      // Simulamos la obtención de coordenadas GPS.
      await Future.delayed(const Duration(milliseconds: 500));
      setState(() {
        _loading = false;
        _permisoDenegado = false;
        _lat = 40.4168; // ejemplo: lat Madrid
        _lon = -3.7038; // ejemplo: lon Madrid
      });
    } else {
      // Permiso denegado: mostramos AlertDialog explicándolo.
      setState(() {
        _loading = false;
        _permisoDenegado = true;
      });

      await showDialog(
        context: context,
        builder: (ctx) => AlertDialog(
          title: const Text('Permiso denegado'),
          content: const Text(
              'No se puede obtener la ubicación porque el permiso fue denegado. '
              'Para probar la ubicación real añade el paquete geolocator y concede permisos en el dispositivo.'),
          actions: [
            TextButton(onPressed: () => Navigator.pop(ctx), child: const Text('Aceptar')),
          ],
        ),
      );
    }
  }

  @override
  Widget build(BuildContext context) {
    final nombreAMostrar = (_nombre != null && _nombre!.isNotEmpty) ? _nombre! : 'usuario';

    return Scaffold(
      appBar: AppBar(title: const Text('Mi Ubicación')),
      body: Padding(
        padding: const EdgeInsets.all(16),
        child: _loading
            ? const Center(child: CircularProgressIndicator())
            : _permisoDenegado
                ? Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: const [
                      Text('Permiso denegado, no se puede mostrar la ubicacion.'),
                    ],
                  )
                : Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      Text('Hola, $nombreAMostrar, esta es tu ubicación actual:', style: const TextStyle(fontSize: 16)),
                      const SizedBox(height: 12),
                      Text('Latitud: ${_lat?.toStringAsFixed(6) ?? '—'}'),
                      Text('Longitud: ${_lon?.toStringAsFixed(6) ?? '—'}'),
                      const SizedBox(height: 16),
                      
                    ],
                  ),
      ),
    );
  }
}
