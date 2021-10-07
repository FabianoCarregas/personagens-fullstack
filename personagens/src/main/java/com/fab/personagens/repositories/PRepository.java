package com.fab.personagens.repositories;


import com.fab.personagens.Domain.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PRepository extends JpaRepository<Personagem, Long> {
}
