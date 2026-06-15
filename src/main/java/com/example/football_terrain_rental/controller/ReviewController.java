package com.example.football_terrain_rental.controller;

import com.example.football_terrain_rental.model.Review;
import com.example.football_terrain_rental.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewRepository repository;

    @GetMapping
    public List<Review> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Review create(@RequestBody Review review) {
        return repository.save(review);
    }

    @GetMapping("/{id}")
    public Review getById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow();
    }

    @PutMapping("/{id}")
    public Review update(@PathVariable Long id,
                         @RequestBody Review review) {
        review.setId(id);
        return repository.save(review);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}