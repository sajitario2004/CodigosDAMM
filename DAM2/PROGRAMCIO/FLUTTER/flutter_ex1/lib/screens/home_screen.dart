import 'package:flutter/material.dart';
import '../widgets/app_drawer.dart';
import 'catalogo_screen.dart';

/// Pantalla inicial con AppBar y Drawer.
class HomeScreen extends StatelessWidget {
  const HomeScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Catalogo de Productos')),
      drawer: const AppDrawer(),
      body: const Center(
        child: Text(
          'Bienvenido.\nAbre el menú lateral para navegar.',
          textAlign: TextAlign.center,
        ),
      ),
      floatingActionButton: FloatingActionButton(
        child: const Icon(Icons.list),
        onPressed: () {
          Navigator.push(
            context,
            MaterialPageRoute(builder: (_) => const CatalogoScreen()),
          );
        },
      ),
    );
  }
}
