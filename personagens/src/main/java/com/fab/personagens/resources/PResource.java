package com.fab.personagens.resources;

import com.fab.personagens.Domain.Character;
import com.fab.personagens.services.PService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/characters")
public class PResource {

    @Autowired
    private PService service;

    @GetMapping
    public ResponseEntity<List<Character>> findAll(){
        List<Character> list= service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Character> findById(@PathVariable Long id){
        Character obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Character> insert(@RequestBody Character obj) {
        obj =service.insert(obj);
        return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
