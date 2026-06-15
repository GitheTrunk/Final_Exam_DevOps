package com.example.football_terrain_rental.controller;

import com.example.football_terrain_rental.model.Favorite;
import com.example.football_terrain_rental.repository.FavoriteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/favorites")
@RequiredArgsConstructor
public class FavoriteController {

    private final FavoriteRepository repository;

    @GetMapping
    public List<Favorite> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Favorite create(@RequestBody Favorite favorite) {
        return repository.save(favorite);
    }

    @GetMapping("/{id}")
    public Favorite getById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}