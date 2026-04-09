package br.com.fiap.character.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Characters {
    @Id
    private String characterCode;

    private String name;
    private String email;
    private Integer age;
    private ChracterClass characterClass;
    private Integer level;
    private Double hp;
    private LocalDate createdAt;
}
