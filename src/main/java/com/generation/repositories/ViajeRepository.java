package com.generation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.models.Viaje;

@Repository
public interface ViajeRepository extends JpaRepository <Viaje, Long> {
    
}
