package com.example.portafoliobackend.controller;

import com.example.portafoliobackend.dto.UsuarioDto;
import com.example.portafoliobackend.model.Usuario;
import com.example.portafoliobackend.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService iUsuarioService;

    @RequestMapping(method = RequestMethod.GET, value = "")
    public List<UsuarioDto> getUsuarios(){
        List<UsuarioDto> lista = new ArrayList<>();
        for (Usuario u : iUsuarioService.getUsuarios()){
            UsuarioDto dto = new UsuarioDto();
            dto.setId(u.getId());
            dto.setNombreUsuario(u.getNombreUsuario());
            lista.add(dto);
        }
        return lista;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        return iUsuarioService.findUsuario(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addUsuario(@RequestBody Usuario usuario){
        iUsuarioService.saveUsuario(usuario);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "")
    public void modUsuario(@RequestBody Usuario usuario){
        iUsuarioService.saveUsuario(usuario);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "")
    public void deleteUsuario(@RequestBody Usuario usuario){
        iUsuarioService.deleteUsuario(usuario.getId());
    }
}
