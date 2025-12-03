import 'package:flutter/material.dart';
import '../models/producto.dart';
import '../widgets/product_cart.dart';

/// Pantalla del catálogo usando GridView.builder.
class CatalogoScreen extends StatelessWidget {
  const CatalogoScreen({super.key});

  List<Producto> _crearProductos() {
    return [
      Producto(
          id: '1',
          nombre: 'Auriculares',
          descripcion: 'Bluetooth, graves potentes',
          precio: 39.90,
          iconCodePoint: Icons.headphones.codePoint),
      Producto(
          id: '2',
          nombre: 'Ratin Gamer',
          descripcion: 'RGB, 16000 DPI',
          precio: 29.99,
          iconCodePoint: Icons.mouse.codePoint),
      Producto(
          id: '3',
          nombre: 'Teclado Mecanico',
          descripcion: 'Switches azules',
          precio: 79.00,
          iconCodePoint: Icons.keyboard.codePoint),
      Producto(
        id: '4',
        nombre: 'Cascos Razer Kraken V4',
        descripcion: 'Lo recomienda el dueño de la pagina',
        precio: 180.00,
        assetImage: 'assets/images/local_product.png', // imagen local
      ),
      Producto(
          id: '5',
          nombre: 'Webcam HD',
          descripcion: '1080p, gran angular',
          precio: 45.50,
          iconCodePoint: Icons.videocam.codePoint),
    ];
  }

  @override
  Widget build(BuildContext context) {
    final productos = _crearProductos();

    return Scaffold(
      appBar: AppBar(title: const Text('Catálogo de Productos')),
      body: Padding(
        padding: const EdgeInsets.all(12),
        child: GridView.builder(
          itemCount: productos.length,
          gridDelegate: const SliverGridDelegateWithFixedCrossAxisCount(
            crossAxisCount: 2,
            mainAxisSpacing: 12,
            crossAxisSpacing: 12,
            childAspectRatio: 0.72,
          ),
          itemBuilder: (_, i) => ProductCard(producto: productos[i]),
        ),
      ),
    );
  }
}
