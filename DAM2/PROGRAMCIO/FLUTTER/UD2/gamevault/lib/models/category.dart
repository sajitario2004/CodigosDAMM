//lib models category.dart

class Category {
  final int id;
  final String name;
  final String slug;

  Category({required this.id, required this.name, required this.slug});

  factory Category.fromJson(Map<String, dynamic> j){
    return Category(
      id: j["id"] as int, 
      name: j["name"] as String, 
      slug: j["slug"] as String
    );
  }
}