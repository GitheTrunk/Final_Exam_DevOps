package com.example.football_terrain_rental.repository;

import com.example.football_terrain_rental.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}