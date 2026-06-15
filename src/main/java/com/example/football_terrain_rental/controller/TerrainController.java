package com.example.football_terrain_rental.controller;

import com.example.football_terrain_rental.model.Terrain;
import com.example.football_terrain_rental.repository.TerrainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/terrains")
@RequiredArgsConstructor
public class TerrainController {

    private final TerrainRepository repository;

    @GetMapping
    public List<Terrain> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Terrain create(@RequestBody Terrain terrain) {
        return repository.save(terrain);
    }

    @GetMapping("/{id}")
    public Terrain getById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}