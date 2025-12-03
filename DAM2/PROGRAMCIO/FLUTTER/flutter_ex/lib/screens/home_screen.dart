// lib/screens/home_screen.dart
import 'package:flutter/material.dart';
import '../widgets/app_drawer.dart';
import 'catalogo_screen.dart';

/// HomeScreen: pantalla principal con AppBar que muestra título visible (requisito).
/// Incluye Drawer de navegación.
class HomeScreen extends StatelessWidget {
  const HomeScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Catalogo de Productos'),
        actions: const [
          Icon(Icons.search),
          SizedBox(width: 12),
          Icon(Icons.more_vert),
          SizedBox(width: 12),
        ],
      ),
      drawer: const AppDrawer(),
      body: const Padding(
        padding: EdgeInsets.all(16),
        child: Center(child: Text('Bienvenido al catalogo.\nAbre el Drawer para navegar.', textAlign: TextAlign.center)),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          // Ejemplo: ir al catálogo desde el FAB
          Navigator.push(context, MaterialPageRoute(builder: (_) => const CatalogoScreen()));
        },
        child: const Icon(Icons.list),
      ),
    );
  }
}
