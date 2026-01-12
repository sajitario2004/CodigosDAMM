package es.dam.gamehub.service;

import es.dam.gamehub.model.Videojuego;
import es.dam.gamehub.repository.VideojuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideojuegoService {

    @Autowired
    private VideojuegoRepository videojuegoRepository;

    public List<Videojuego> findAll() {
        return videojuegoRepository.findAll();
    }

    public Optional<Videojuego> findById(Long id) {
        return videojuegoRepository.findById(id);
    }

    public Videojuego save(Videojuego videojuego) {
        return videojuegoRepository.save(videojuego);
    }

    public Optional<Videojuego> update(Long id, Videojuego videojuegoDetalles) {
        return videojuegoRepository.findById(id).map(videojuegoExistente -> {
            videojuegoExistente.setTitulo(videojuegoDetalles.getTitulo());
            videojuegoExistente.setGenero(videojuegoDetalles.getGenero());
            videojuegoExistente.setPrecio(videojuegoDetalles.getPrecio());
            videojuegoExistente.setMultiplayer(videojuegoDetalles.getMultiplayer());
            // Actualizamos también los campos extra
            videojuegoExistente.setDesarrolladora(videojuegoDetalles.getDesarrolladora());
            videojuegoExistente.setAnioLanzamiento(videojuegoDetalles.getAnioLanzamiento());
            
            return videojuegoRepository.save(videojuegoExistente);
        });
    }

    public boolean deleteById(Long id) {
        if (videojuegoRepository.existsById(id)) {
            videojuegoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}