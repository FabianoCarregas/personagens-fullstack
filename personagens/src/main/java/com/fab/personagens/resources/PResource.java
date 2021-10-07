package com.fab.personagens.resources;

import com.fab.personagens.Domain.Personagem;
import com.fab.personagens.services.PService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/Characters")
public class PResource {

    @Autowired
    private PService service;

    @GetMapping
    public ResponseEntity<List<Personagem>> findAll(){
        List<Personagem> list= service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
