package com.example.portafoliobackend.service;

import com.example.portafoliobackend.model.Persona;
import com.example.portafoliobackend.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService{
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona findPersona(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Persona> getPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        personaRepository.deleteById(id);
    }
}
