package com.generation.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.models.Viaje;
import com.generation.repositories.ViajeRepository;

@Service
public class ViajeService {

    @Autowired
    ViajeRepository viajeRepository;
    public void saveViaje(@Valid Viaje viaje) {

        viajeRepository.save(viaje);
    }
    public List<Viaje> findAll() {
        return viajeRepository.findAll();
    }
    
}
