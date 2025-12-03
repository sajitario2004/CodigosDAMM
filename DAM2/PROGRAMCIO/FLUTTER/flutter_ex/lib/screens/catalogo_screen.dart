// lib/screens/catalogo_screen.dart
import 'package:flutter/material.dart';
import '../models/producto.dart';
import '../widgets/product_cart.dart';

/// CatalogoScreen: muestra un GridView con al menos 5 productos.
/// Usa layouts (Padding, Column, etc.) adecuadamente.
class CatalogoScreen extends StatelessWidget {
  const CatalogoScreen({super.key});

  // Generamos una lista de productos (al menos 5). Uno de ellos usa imagen local.
  List<Producto> _productosDeEjemplo() {
    return [
      Producto(
        id: 'p1',
        nombre: 'Auriculares X100',
        descripcion: 'Inalámbricos, cancelación ruido',
        precio: 59.99,
        iconCodePoint: Icons.headphones.codePoint,
      ),
      Producto(
        id: 'p2',
        nombre: 'Ratón Pro',
        descripcion: 'Ergonomico, 16000 DPI',
        precio: 39.90,
        iconCodePoint: Icons.mouse.codePoint,
      ),
      Producto(
        id: 'p3',
        nombre: 'Teclado Mecánico',
        descripcion: 'Retroiluminado, switches azules',
        precio: 89.50,
        iconCodePoint: Icons.keyboard.codePoint,
      ),
      Producto(
        id: 'p4',
        nombre: 'Auriculares razer Kraken V4, ',
        descripcion: 'Ta potente, recomendado por el dueño',
        precio: 180.00,
        assetImage: 'assets/images/local_product.png', // usa imagen local
      ),
      Producto(
        id: 'p5',
        nombre: 'Alfombrilla XL',
        descripcion: 'Superficie suave, base antideslizante',
        precio: 14.99,
        iconCodePoint: Icons.apps.codePoint,
      ),
      Producto(
        id: 'p6',
        nombre: 'Base Refrigerante',
        descripcion: 'Para portatiles hasta 17"',
        precio: 29.99,
        iconCodePoint: Icons.ac_unit.codePoint,
      ),
    ];
  }

  @override
  Widget build(BuildContext context) {
    final productos = _productosDeEjemplo();

    return Scaffold(
      appBar: AppBar(title: const Text('Catalogo de Productos')),
      body: Padding(
        padding: const EdgeInsets.all(12),
        child: GridView.builder(
          itemCount: productos.length,
          gridDelegate: const SliverGridDelegateWithFixedCrossAxisCount(
            crossAxisCount: 2, // dos columnas
            mainAxisSpacing: 12,
            crossAxisSpacing: 12,
            childAspectRatio: 0.72,
          ),
          itemBuilder: (context, index) {
            final producto = productos[index];
            return ProductCard(producto: producto);
          },
        ),
      ),
    );
  }
}
