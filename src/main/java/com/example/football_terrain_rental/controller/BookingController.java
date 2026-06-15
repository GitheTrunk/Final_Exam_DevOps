package com.example.football_terrain_rental.controller;

import com.example.football_terrain_rental.model.Booking;
import com.example.football_terrain_rental.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
@RequiredArgsConstructor
public class BookingController {

    private final BookingRepository repository;

    @GetMapping
    public List<Booking> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Booking create(@RequestBody Booking booking) {
        return repository.save(booking);
    }

    @GetMapping("/{id}")
    public Booking getById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow();
    }

    @PutMapping("/{id}")
    public Booking update(@PathVariable Long id,
                          @RequestBody Booking booking) {
        booking.setId(id);
        return repository.save(booking);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}