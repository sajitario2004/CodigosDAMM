// lib/services/api_service.dart
import 'dart:convert';
import 'package:http/http.dart' as http;
import '../models/category.dart';

class ApiService {
  final String base = 'https://api.rawg.io/api';
  // Esta no va, hay que registrarse en https://rawg.io, luego ir a https://rawg.io/apidocs para obtener una key propia
  final String key = 'Clave con numeros largos y cosas'; 

  Future<List<Category>> fetchCategories() async {
    final url = Uri.parse('$base/genres?key=$key');
    final res = await http.get(url);

    if (res.statusCode == 200) {
      final Map<String, dynamic> data = jsonDecode(res.body);
      final List<dynamic> items = data['results'] as List<dynamic>;
      return items.map((e) => Category.fromJson(e as Map<String, dynamic>)).toList();
    } else {
      throw Exception('Error al cargar categorías: ${res.statusCode}');
    }
  }
}