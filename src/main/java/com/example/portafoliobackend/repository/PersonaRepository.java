package com.example.portafoliobackend.repository;

import com.example.portafoliobackend.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
