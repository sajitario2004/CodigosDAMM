package es.dam.gamehub;

import es.dam.gamehub.model.Videojuego;
import es.dam.gamehub.repository.VideojuegoRepository;
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
            repo.save(new Videojuego(null, "The Legend of Zelda: Breath of the Wild" ,"Aventura","Nintendo" , 2017 , 59.99	, true));
            repo.save(new Videojuego(null, "Elden Ring", "RPG", "FromSoftware",2022,69.99, true));
            repo.save(new Videojuego(null, "Elden Ring", "RPG","Valve" ,2011,69.99,true));
            repo.save(new Videojuego(null, "Portal 2", "Puzzle", "Valve",2011, 9.99, true));
            repo.save(new Videojuego(null, "The Witcher 3: Wild Hunt", "RPG","CD Projekt Red",2015, 39.99, false));
            repo.save(new Videojuego(null, "Minecraft", "Sandbox","Mojang",2011, 39.99, false));
            
            System.out.println("✅ Datos de prueba insertados correctamente");
        }
    }
}