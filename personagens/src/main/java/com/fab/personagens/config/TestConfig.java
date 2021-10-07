package com.fab.personagens.config;

import com.fab.personagens.Domain.Personagem;
import com.fab.personagens.repositories.PRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private PRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Personagem p1 = new Personagem(null,"Spider-man", 5, "EUA", "Marvel", "url://");
        Personagem p2 = new Personagem(null,"Super-man", 9, "EUA", "DC", "url://");
        Personagem p3 = new Personagem(null,"Iron-man", 7, "EUA", "Marvel", "url://");

        repository.saveAll(Arrays.asList(p1,p2,p3));
    }
}
