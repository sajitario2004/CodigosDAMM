// lib/widgets/app_drawer.dart
import 'package:flutter/material.dart';
import '../screens/catalogo_screen.dart';
import '../screens/informacion_screen.dart';
import '../screens/perfil_screen.dart';
import '../screens/mi_ubicacion_screen.dart';

/// AppDrawer: Drawer de navegación con las opciones requeridas:
/// - Catálogo de productos
/// - Información
/// - Perfil / Configuración
/// - Mi Ubicación
/// Navegación usando Navigator.push (requisito).
class AppDrawer extends StatelessWidget {
  const AppDrawer({super.key});

  @override
  Widget build(BuildContext context) {
    return Drawer(
      child: ListView(
        children: [
          const DrawerHeader(
            decoration: BoxDecoration(color: Color.fromARGB(255, 255, 0, 0)),
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Icon(Icons.storefront, size: 60, color: Colors.white),
                SizedBox(height: 10),
                Text(
                  'Catalogo - Practica',
                  style: TextStyle(color: Colors.white, fontSize: 18),
                ),
                Text(
                  'itolcan2711@g.educaand.es',
                  style: TextStyle(color: Colors.white70),
                ),
              ],
            ),
          ),
          ListTile(
            leading: const Icon(Icons.list),
            title: const Text('Catalogo de productos'),
            onTap: () {
              Navigator.pop(context);
              Navigator.push(
                context,
                MaterialPageRoute(builder: (_) => const CatalogoScreen()),
              );
            },
          ),
          ListTile(
            leading: const Icon(Icons.info),
            title: const Text('Informacion'),
            onTap: () {
              Navigator.pop(context);
              Navigator.push(
                context,
                MaterialPageRoute(builder: (_) => const InformacionScreen()),
              );
            },
          ),
          ListTile(
            leading: const Icon(Icons.person),
            title: const Text('Perfil / Configuracion'),
            onTap: () {
              Navigator.pop(context);
              Navigator.push(
                context,
                MaterialPageRoute(builder: (_) => const PerfilScreen()),
              );
            },
          ),
          ListTile(
            leading: const Icon(Icons.my_location),
            title: const Text('Mi Ubicacion'),
            onTap: () {
              Navigator.pop(context);
              Navigator.push(
                context,
                MaterialPageRoute(builder: (_) => const MiUbicacionScreen()),
              );
            },
          ),
        ],
      ),
    );
  }
}
