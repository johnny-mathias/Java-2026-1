package br.com.fiap.character.controller;

import br.com.fiap.character.dto.CharacterResponse;
import br.com.fiap.character.entity.Characters;
import br.com.fiap.character.service.CharacterService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/characters")
public class CharacterController {
    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Characters addCharacter(@RequestBody @Valid Characters character) {
        return characterService.addCharacter(character);
    }

    @GetMapping
    public List<CharacterResponse> findAll() {
        return characterService.findAll().stream()
                .map(CharacterResponse::fromEntity)
                .toList();
    }

}
