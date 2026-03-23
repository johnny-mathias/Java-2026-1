package br.com.fiap.Dragons.Controllers;

import br.com.fiap.Dragons.Models.Dragon;
import br.com.fiap.Dragons.Services.DragonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dragons")
public class DragonController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private DragonService service;

    @GetMapping
    public List<Dragon> getDragons() {
        log.info("Listando todos os dragões");
        return service.getDragons();
    }

    @GetMapping("{id}")
    public ResponseEntity<Dragon> getDragonById(@PathVariable Integer id) {
        log.info("Buscando dragão por id: {}", id);
        var optionalDragon = service.getDragonById(id);
        // fail fast
        return optionalDragon.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }


    @PostMapping
    public ResponseEntity<Dragon> addDragon(@RequestBody Dragon dragon) {
        log.info("Cadastrando dragão...");
        var dragons = service.addDragon(dragon);
        return ResponseEntity
                .status(HttpStatus.CREATED) // 201
                .body(dragons);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDragon(@PathVariable Integer id, @RequestBody Dragon newDragon) {
        service.deleteDragon(id, newDragon);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Dragon> updateDragon(@PathVariable Integer id, @RequestBody Dragon newDragon) {
        Dragon dragon = service.deleteDragon(id, newDragon);
        return ResponseEntity.ok(newDragon);
    }
}
