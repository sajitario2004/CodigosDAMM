package es.dam.gamehub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es.dam.gamehub.model.Videojuego;
import es.dam.gamehub.repository.VideojuegoRepository;
import java.util.List;

@Service
public class VideojuegoService {
    
    @Autowired
    private VideojuegoRepository repository;

    public List<Videojuego> findAll() {
        return repository.findAll();
    }

    public Videojuego findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Videojuego save(Videojuego videojuego) {
        return repository.save(videojuego);
    }

    public Videojuego update(Long id, Videojuego datos) {
        Videojuego videojuego = findById(id);

        if (videojuego != null) {
            videojuego.setTitulo(datos.getTitulo());
            videojuego.setGenero(datos.getGenero());
            videojuego.setPrecio(datos.getPrecio());
            videojuego.setMultiplayer(datos.getMultiplayer());

            return repository.save(videojuego);
        }

        return null;
    }

    public boolean deleteById(Long id) {

        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }

        return false;
    }
}
