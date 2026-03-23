package br.com.fiap.Dragons.Services;

import br.com.fiap.Dragons.Models.Dragon;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class DragonService {


    private final List<Dragon> repository = new ArrayList<>();

    public List<Dragon> getDragons() {
        return repository;
    }

    public Dragon addDragon(Dragon dragon) {
        var id = Math.abs(new Random().nextInt());
        dragon.setId(id);
        repository.add(dragon);
        return dragon;
    }

    public Optional<Dragon> getDragonById(Integer id) {
        return repository
                .stream()
                .filter(dragon -> dragon.getId().equals(id))
                .findFirst();
    }


    public Dragon deleteDragon(Integer id, Dragon newDragon) {
        var optionalDragon = getDragonById(id);
        if (optionalDragon.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Dragão não encontrado");
        }
        repository.remove(optionalDragon.get());
        repository.add(newDragon);
        return newDragon;
    }
}
