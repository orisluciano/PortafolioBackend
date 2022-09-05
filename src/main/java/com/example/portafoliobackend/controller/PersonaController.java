package com.example.portafoliobackend.controller;

import com.example.portafoliobackend.dto.PersonaDto;
import com.example.portafoliobackend.model.Persona;
import com.example.portafoliobackend.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    private IPersonaService iPersonaService;

    @RequestMapping(method = RequestMethod.GET, value = "")
    public List<PersonaDto> getPersonas(){
        List<PersonaDto> lista = new ArrayList<>();
        for (Persona u : iPersonaService.getPersonas()){
            PersonaDto dto = new PersonaDto();
            dto.setId(u.getId());
            dto.setApellido(u.getApellido());
            dto.setNombres(u.getNombres());
            dto.setTelefono(u.getTelefono());
            dto.setTitulo(u.getTitulo());
            lista.add(dto);
        }
        return lista;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Persona getPersona(@PathVariable Long id){
        return iPersonaService.findPersona(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addUsuario(@RequestBody Persona persona){
        iPersonaService.savePersona(persona);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "")
    public void modPersona(@RequestBody Persona persona){
        iPersonaService.savePersona(persona);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "")
    public void deletePersona(@RequestBody Persona persona){
        iPersonaService.deletePersona(persona.getId());
    }
}
