import 'package:flutter/material.dart';
import '../models/producto.dart';

/// Tarjeta de producto usada dentro del Grid.
/// Al pulsarlo imprime nombre + precio en consola (requisito).
class ProductCard extends StatelessWidget {
  final Producto producto;

  const ProductCard({super.key, required this.producto});

  @override
  Widget build(BuildContext context) {
    return InkWell(
      onTap: () {
        print('Producto: ${producto.nombre}, Precio: ${producto.precio}');
      },
      child: Card(
        elevation: 2,
        child: Padding(
          padding: const EdgeInsets.all(8),
          child: Column(
            children: [
              // Imagen local o icono
              Expanded(
                child: producto.assetImage != null
                    ? Image.asset(producto.assetImage!, fit: BoxFit.contain)
                    : Icon(
                        IconData(
                          producto.iconCodePoint!,
                          fontFamily: 'MaterialIcons',
                        ),
                        size: 48,
                        color: Colors.deepPurple,
                      ),
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
                textAlign: TextAlign.center,
                style: const TextStyle(fontSize: 12, color: Colors.grey),
              ),

              const SizedBox(height: 6),

              Text(
                '${producto.precio.toStringAsFixed(2)} €',
                style: const TextStyle(fontWeight: FontWeight.w600),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
