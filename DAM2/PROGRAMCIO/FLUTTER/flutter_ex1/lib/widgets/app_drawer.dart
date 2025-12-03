import 'package:flutter/material.dart';
import '../screens/catalogo_screen.dart';
import '../screens/informacion_screen.dart';

/// Drawer con navegación básica:
/// - Catálogo
/// - Información
class AppDrawer extends StatelessWidget {
  const AppDrawer({super.key});

  @override
  Widget build(BuildContext context) {
    return Drawer(
      child: ListView(
        children: [
          const DrawerHeader(
            decoration: BoxDecoration(color: Colors.deepPurple),
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Icon(Icons.storefront, size: 60, color: Colors.white),
                SizedBox(height: 10),
                Text(
                  'Catalogo Práctica',
                  style: TextStyle(color: Colors.white, fontSize: 18),
                ),
                Text(
                  'itolcan2711@g.educaand.es',
                  style: TextStyle(color: Colors.white54),
                )
              ],
            ),
          ),

          // OPCIÓN 1: Catálogo
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

          // OPCIÓN 2: Información
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
        ],
      ),
    );
  }
}
