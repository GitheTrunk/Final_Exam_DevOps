package com.example.football_terrain_rental.seeder;

import com.example.football_terrain_rental.model.Terrain;
import com.example.football_terrain_rental.repository.TerrainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class DataSeeder implements CommandLineRunner {

    private final TerrainRepository terrainRepository;

    @Override
    public void run(String... args) {

        if (terrainRepository.count() == 0) {
            Terrain t = new Terrain();

            t.setOwnerId(1L);
            t.setTitle("ITC Football Field");
            t.setLocation("Phnom Penh");
            t.setAreaSize(new BigDecimal("500"));
            t.setPricePerDay(new BigDecimal("100"));
            t.setIsAvailable(true);

            terrainRepository.save(t);
        }
    }
}