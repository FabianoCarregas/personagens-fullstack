package com.fab.personagens.resources;

import com.fab.personagens.Domain.Personagem;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class PResource {

    @GetMapping
    public ResponseEntity<Personagem> findAll(){
        Personagem p = new Personagem(1L,"SpiderMan", 10, "American", "DC", "url://");
        return ResponseEntity.ok().body(p);
    }
}
