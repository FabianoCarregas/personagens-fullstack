package com.fab.personagens.services;

import com.fab.personagens.repositories.PRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PService {

    @Autowired
    private PRepository repository;

}
