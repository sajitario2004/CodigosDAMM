/// Modelo simple representando un producto del catálogo.
///
/// assetImage: ruta a una imagen local (solo 1 producto lo usa).
/// iconCodePoint: permite usar Icons para los demás productos.
class Producto {
  final String id;
  final String nombre;
  final String descripcion;
  final double precio;
  final String? assetImage;
  final int? iconCodePoint;

  Producto({
    required this.id,
    required this.nombre,
    required this.descripcion,
    required this.precio,
    this.assetImage,
    this.iconCodePoint,
  });
}
