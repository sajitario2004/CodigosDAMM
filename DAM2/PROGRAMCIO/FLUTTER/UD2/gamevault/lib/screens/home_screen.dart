import 'package:flutter/material.dart';
import '../widgets/app_drawer.dart';
import '../widgets/games_grid.dart';
import '../widgets/categories_list.dart';
import '../widgets/add_game_screen.dart';

class HomeScreen extends StatelessWidget {
  const HomeScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return DefaultTabController(
      length: 3,
      child: Scaffold(
        appBar: AppBar(
          title: const Text('GameVault'),
          actions: const [
            Icon(Icons.search),
            SizedBox(width: 12),
            Icon(Icons.more_vert),
            SizedBox(width: 12),
          ],
          bottom: const TabBar(
            tabs: [
              Tab(icon: Icon(Icons.videogame_asset), text: 'Juegos'),
              Tab(icon: Icon(Icons.star), text: 'Favoritos'),
              Tab(icon: Icon(Icons.category), text: 'Categorías'),
            ],
          ),
        ),
        drawer: const AppDrawer(),
        body: TabBarView(
          children: [
            const GamesGrid(), // Cambiamos esto
            const Center(child: Text('Aquí irán los favoritos')),
            const CategoriesList(), // Cambiamos esto
          ],
        ),
        floatingActionButton: FloatingActionButton(
          child: const Icon(Icons.add),
          onPressed: () async {
            final resultado = await Navigator.push(
              context,
              MaterialPageRoute(builder: (_) => const AddGameScreen()),
            );

            if (resultado != null) {
              ScaffoldMessenger.of(context).showSnackBar(
                SnackBar(
                  content: Text('Juego añadido: ${resultado['titulo']}'),
                ),
              );
            }
          },
        ),
      ),
    );
  }
}
