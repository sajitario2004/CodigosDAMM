package es.dam.videojuegos;

import es.dam.videojuegos.model.Videojuego;
import es.dam.videojuegos.repository.VideojuegoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final VideojuegoRepository repo;

    public DataInitializer(VideojuegoRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) {
        // Solo insertamos si la tabla está vacía
        if (repo.count() == 0) {
            repo.save(new Videojuego(null, "The Legend of Zelda", "Aventura", 59.99));
            repo.save(new Videojuego(null, "Elden Ring", "RPG", 69.99));
            repo.save(new Videojuego(null, "FIFA 24", "Deportes", 49.99));
            repo.save(new Videojuego(null, "Minecraft", "Sandbox", 29.99));
            repo.save(new Videojuego(null, "Cyberpunk 2077", "RPG", 39.99));
            
            System.out.println("✅ Datos de prueba insertados correctamente");
        }
    }
}