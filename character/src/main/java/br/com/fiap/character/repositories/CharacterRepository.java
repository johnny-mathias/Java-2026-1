package br.com.fiap.character.repositories;

import br.com.fiap.character.entity.Characters;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Characters, String> {

}
