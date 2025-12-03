// lib/widgets/product_card.dart
import 'package:flutter/material.dart';
import '../models/producto.dart';

/// ProductCard / _buildProductCard:
/// Widget que muestra la imagen/icono, nombre, descripción y precio.
/// Al pulsarlo imprime en consola el nombre y precio (requisito).
class ProductCard extends StatelessWidget {
  final Producto producto;

  const ProductCard({super.key, required this.producto});

  @override
  Widget build(BuildContext context) {
    return InkWell(
      onTap: () {
        // No navegamos a otra pantalla: imprimimos en la consola.
        print('Producto seleccionado: ${producto.nombre} - Precio: ${producto.precio.toStringAsFixed(2)}€');
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(content: Text('Seleccionado: ${producto.nombre} - ${producto.precio.toStringAsFixed(2)}€')),
        );
      },
      child: Card(
        elevation: 2,
        child: Padding(
          padding: const EdgeInsets.all(8.0),
          child: Column(
            children: [
              // Mostrar imagen local si existe, si no usar un Icon.
              Expanded(
                child: producto.assetImage != null
                    ? Image.asset(producto.assetImage!, fit: BoxFit.contain)
                    : (producto.iconCodePoint != null
                        ? Icon(IconData(producto.iconCodePoint!, fontFamily: 'MaterialIcons'), size: 48, color: Colors.deepPurple)
                        : const Icon(Icons.shopping_bag, size: 48, color: Colors.deepPurple)),
              ),
              const SizedBox(height: 8),
              Text(
                producto.nombre,
                style: const TextStyle(fontWeight: FontWeight.bold),
                textAlign: TextAlign.center,
              ),
              const SizedBox(height: 4),
              Text(
                producto.descripcion,
                style: const TextStyle(color: Color.fromARGB(255, 80, 80, 80), fontSize: 12),
                textAlign: TextAlign.center,
              ),
              const SizedBox(height: 6),
              Text('${producto.precio.toStringAsFixed(2)} €', style: const TextStyle(fontWeight: FontWeight.w600)),
            ],
          ),
        ),
      ),
    );
  }
}
