package com.example.football_terrain_rental.repository;

import com.example.football_terrain_rental.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}