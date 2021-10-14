package com.fab.personagens.services;

import com.fab.personagens.Domain.Character;
import com.fab.personagens.repositories.PRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PService {

    @Autowired
    private PRepository repository;

    public List<Character> findAll() {
        return repository.findAll();
    }

    public Character findById(Long id) {
        Optional<Character> obj= repository.findById(id);
        return obj.get();
    }

    public Character insert(Character obj) {
         return repository.save(obj);
    }

    public void delete(Long id) {
        repository.deleteById(id);

    }

    public Character update(Long id, Character obj) {
        Character entity = repository.getById(id);
        updateData(entity, obj);
        return repository.save(entity);

    }

    private void updateData(Character entity, Character obj) {
        entity.setName(obj.getName());
        entity.setDescription(obj.getDescription());
        entity.setPower(obj.getPower());
        entity.setCountry(obj.getCountry());
        entity.setImageUri(obj.getImageUri());
    }

}
