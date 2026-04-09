package br.com.fiap.character.dto;

import br.com.fiap.character.entity.Characters;
import br.com.fiap.character.entity.ChracterClass;

import java.time.LocalDate;

public record CharacterResponse (

    String characterCode,
    String name,
    String email,
    Integer age,
    ChracterClass characterClass,
    Integer level,
    Double hp,
    LocalDate createdAt
) {

    public static CharacterResponse fromEntity(Characters c) {
        return new CharacterResponse(
                c.getCharacterCode(),
                c.getName(),
                c.getEmail(),
                c.getAge(),
                c.getCharacterClass(),
                c.getLevel(),
                c.getHp(),
                c.getCreatedAt()
        );

    }
}
