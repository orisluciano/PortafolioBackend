package com.example.portafoliobackend.service;

import com.example.portafoliobackend.model.Persona;

import java.util.List;

public interface IPersonaService {
    public Persona findPersona(Long id);
    public List<Persona> getPersonas();
    public void savePersona(Persona persona);
    public void deletePersona(Long id);
}
