package com.example.football_terrain_rental.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "terrain_images")
@Data
public class TerrainImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long terrainId;

    private String imagePath;

    private LocalDateTime uploadedAt = LocalDateTime.now();
}