package com.example.portafoliobackend.service;

import com.example.portafoliobackend.model.Usuario;

import java.util.List;

public interface IUsuarioService {
    public Usuario findUsuario(Long id);
    public List<Usuario> getUsuarios();
    public void saveUsuario(Usuario usuario);
    public void deleteUsuario(Long id);
}
