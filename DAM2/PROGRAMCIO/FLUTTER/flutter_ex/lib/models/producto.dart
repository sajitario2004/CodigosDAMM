// lib/models/producto.dart
/// Modelo simple para un producto en el catálogo.
/// Usamos nombres claros: Producto, productName, price, description.
class Producto {
  final String id;
  final String nombre;
  final String descripcion;
  final double precio;
  final String? assetImage; // ruta a asset local (opcional)
  final int? iconCodePoint; // si usamos Icons en lugar de imagen

  Producto({
    required this.id,
    required this.nombre,
    required this.descripcion,
    required this.precio,
    this.assetImage,
    this.iconCodePoint,
  });
}
