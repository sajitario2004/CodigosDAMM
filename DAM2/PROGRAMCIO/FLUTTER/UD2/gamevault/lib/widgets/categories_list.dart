import 'package:flutter/material.dart';

class CategoriesList extends StatelessWidget {
  const CategoriesList({super.key});

  @override
  Widget build(BuildContext context) {
    final categorias = [
      {'nombre': 'Acción', 'icono': Icons.sports_martial_arts},
      {'nombre': 'RPG', 'icono': Icons.auto_stories},
      {'nombre': 'Estrategia', 'icono': Icons.psychology},
      {'nombre': 'Indie', 'icono': Icons.lightbulb},
      {'nombre': 'Deportes', 'icono': Icons.sports_soccer},
      {'nombre': 'Aventura', 'icono': Icons.explore},
    ];

    return ListView.builder(
      itemCount: categorias.length,
      itemBuilder: (context, index) {
        final categoria = categorias[index];
        return Card(
          margin: const EdgeInsets.symmetric(horizontal: 16, vertical: 8),
          child: ListTile(
            leading: Icon(
              categoria['icono'] as IconData,
              color: Colors.deepPurple,
              size: 30,
            ),
            title: Text(
              categoria['nombre'] as String,
              style: const TextStyle(fontWeight: FontWeight.w500),
            ),
            trailing: const Icon(Icons.arrow_forward_ios, size: 16),
            onTap: () {
              print('Categoría seleccionada: ${categoria['nombre']}');
            },
          ),
        );
      },
    );
  }
}