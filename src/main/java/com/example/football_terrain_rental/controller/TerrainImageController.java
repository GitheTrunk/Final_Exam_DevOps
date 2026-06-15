package com.example.football_terrain_rental.controller;

import com.example.football_terrain_rental.model.TerrainImage;
import com.example.football_terrain_rental.repository.TerrainImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/terrain-images")
@RequiredArgsConstructor
public class TerrainImageController {

    private final TerrainImageRepository repository;

    @GetMapping
    public List<TerrainImage> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public TerrainImage create(@RequestBody TerrainImage image) {
        return repository.save(image);
    }

    @GetMapping("/{id}")
    public TerrainImage getById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}