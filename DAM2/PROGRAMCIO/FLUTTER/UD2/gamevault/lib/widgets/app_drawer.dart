import 'package:flutter/material.dart';
import '../screens/settings_screen.dart';
import '../screens/categories_screen.dart';

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
                Icon(Icons.person, size: 60, color: Colors.white),
                SizedBox(height: 10),
                Text(
                  'Ignacio Toledano Caneo 001',
                  style: TextStyle(color: Colors.white, fontSize: 18),
                ),
                Text(
                  'email@ejemplo.com',
                  style: TextStyle(color: Colors.white70),
                ),
              ],
            ),
          ),
          ListTile(
            leading: const Icon(Icons.home),
            title: const Text('Inicio'),
            onTap: () => Navigator.pop(context),
          ),
          ListTile(
            leading: const Icon(Icons.person),
            title: const Text('Perfil'),
            onTap: () => Navigator.pop(context),
          ),
          // Añade este ListTile al Drawer
          ListTile(
            leading: const Icon(Icons.settings),
            title: const Text('Ajustes'),
            onTap: () {
              Navigator.pop(context);
              Navigator.push(
                context,
                MaterialPageRoute(builder: (_) => const SettingsScreen()),
              );
            },
          ),
          ListTile(
            leading: const Icon(Icons.info),
            title: const Text('Acerca de la app'),
            onTap: () => Navigator.pop(context),
          ),
          // widgets/app_drawer.dart (añadir ListTile)
          ListTile(
            leading: const Icon(Icons.list),
            title: const Text('Categorías dinámicas'),
            onTap: () {
              Navigator.pop(context);
              Navigator.push(
                context,
                MaterialPageRoute(builder: (_) => const CategoriesScreen()),
              );
            },
          ),
        ],
      ),
    );
  }
}
