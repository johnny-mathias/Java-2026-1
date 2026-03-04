package br.com.fiap.heroes.services;

import br.com.fiap.heroes.models.Hero;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HeroService {
    //CRUD

    private final List<Hero> repository = new ArrayList<>();

    public List<Hero> getHeroes() {
        return repository;
    }

    public Hero addHero(Hero hero) {
        repository.add(hero);
        return hero;
    }
}
