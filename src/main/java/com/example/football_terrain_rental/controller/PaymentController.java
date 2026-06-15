package com.example.football_terrain_rental.controller;

import com.example.football_terrain_rental.model.Payment;
import com.example.football_terrain_rental.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentRepository repository;

    @GetMapping
    public List<Payment> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Payment create(@RequestBody Payment payment) {
        return repository.save(payment);
    }

    @GetMapping("/{id}")
    public Payment getById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}