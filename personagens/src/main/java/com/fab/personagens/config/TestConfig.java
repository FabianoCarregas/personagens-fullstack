package com.fab.personagens.config;

import com.fab.personagens.Domain.Character;
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
        Character p1 = new Character(null,"Spider-man", 5, "EUA", "Marvel", "url:");
        Character p2 = new Character(null,"Super-man", 9, "EUA", "DC", "url:");
        Character p3 = new Character(null,"Iron-man", 7, "EUA", "Marvel", "url:");

        repository.saveAll(Arrays.asList(p1,p2,p3));
    }
}
