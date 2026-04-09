package br.com.fiap.character.service;

import br.com.fiap.character.entity.Characters;
import br.com.fiap.character.repositories.CharacterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {

    private final CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public Characters addCharacter(Characters character) {
        return characterRepository.save(character);
    }

    public List<Characters> findAll() {
        return characterRepository.findAll();
    }
}
