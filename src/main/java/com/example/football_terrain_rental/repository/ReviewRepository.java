package com.example.football_terrain_rental.repository;

import com.example.football_terrain_rental.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}