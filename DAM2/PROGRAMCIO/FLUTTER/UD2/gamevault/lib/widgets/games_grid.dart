import 'package:flutter/material.dart';

class GamesGrid extends StatelessWidget {
  const GamesGrid({super.key});

  @override
  Widget build(BuildContext context) {
    final juegos = [
      {'titulo': 'The Witcher 3', 'plataforma': 'PC'},
      {'titulo': 'Zelda BOTW', 'plataforma': 'Switch'},
      {'titulo': 'God of War', 'plataforma': 'PS5'},
      {'titulo': 'Elden Ring', 'plataforma': 'PC'},
      {'titulo': 'Spider-Man', 'plataforma': 'PS5'},
      {'titulo': 'Mario Kart 8', 'plataforma': 'Switch'},
    ];

    return GridView.count(
      crossAxisCount: 2,
      padding: const EdgeInsets.all(16),
      mainAxisSpacing: 12,
      crossAxisSpacing: 12,
      children: juegos.map((juego) {
        return Card(
          elevation: 2,
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              const Icon(Icons.videogame_asset, size: 40, color: Colors.deepPurple),
              const SizedBox(height: 10),
              Text(
                juego['titulo']!,
                style: const TextStyle(fontWeight: FontWeight.bold),
                textAlign: TextAlign.center,
              ),
              const SizedBox(height: 5),
              Text(
                juego['plataforma']!, 
                style: const TextStyle(color: Colors.grey, fontSize: 12),
              ),
              const SizedBox(height: 8),
              const Icon(Icons.favorite_border, size: 20),
            ],
          ),
        );
      }).toList(),
    );
  }
}