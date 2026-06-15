package com.example.football_terrain_rental.repository;

import com.example.football_terrain_rental.model.TerrainImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TerrainImageRepository extends JpaRepository<TerrainImage, Long> {
}