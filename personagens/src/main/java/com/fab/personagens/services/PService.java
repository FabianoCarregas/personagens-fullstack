package com.fab.personagens.services;

import com.fab.personagens.Domain.Personagem;
import com.fab.personagens.repositories.PRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PService {

    @Autowired
    private PRepository repository;

    public List<Personagem> findAll(){
        return repository.findAll();
    }

}
