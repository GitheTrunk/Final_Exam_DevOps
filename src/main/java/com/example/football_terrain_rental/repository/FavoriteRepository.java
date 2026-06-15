package com.example.football_terrain_rental.repository;

import com.example.football_terrain_rental.model.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
}