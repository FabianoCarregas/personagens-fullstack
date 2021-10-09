package com.fab.personagens.repositories;


import com.fab.personagens.Domain.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PRepository extends JpaRepository<Character, Long> {
}
