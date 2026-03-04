package br.com.fiap.heroes.controllers;

import br.com.fiap.heroes.models.Hero;
import br.com.fiap.heroes.services.HeroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HeroController {

    private final Logger log = LoggerFactory.getLogger((getClass()));

    @Autowired
    private HeroService service;

    @GetMapping("/")
    public String healthCheck() {
        return "Server UP";

    }

    @GetMapping("/heroes")
    public List<Hero> getHeroes() {
        log.info("Listando todos os heróis");
        return service.getHeroes();
    }

    @PostMapping("/heroes")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addHero(@RequestBody Hero hero) { //Binding
        log.info("Cadastrando herói...");
        service.addHero(hero);
    }
}
