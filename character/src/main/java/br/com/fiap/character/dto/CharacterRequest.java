package br.com.fiap.character.dto;

import br.com.fiap.character.entity.Characters;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class CharacterRequest {

    @NotBlank
    @Pattern(regexp = "^CHAR-\\d{4}$", message = "Formato deve ser CHAR-1234")
    String characterCode;

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    String name;

    @NotBlank
    @Email
    String email;

    @NotNull
    @Min(12)
    @Max(120)
    Integer age;

    @NotNull
    @Min(1)
    @Max(100)
    Integer level;

    @NotNull
    @Min(0)
    Double hp;

    @NotNull
    @PastOrPresent
    LocalDate createdAt;

    public Characters toEntity() {
        return Characters.builder()
                .characterCode(characterCode)
                .name(name)
                .email(email)
                .age(age)
                .level(level)
                .hp(hp)
                .createdAt(createdAt)
                .build();
    }
}
