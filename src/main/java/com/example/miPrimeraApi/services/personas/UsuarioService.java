package com.example.miPrimeraApi.services.personas;

import com.example.miPrimeraApi.entities.personas.Usuario;
import com.example.miPrimeraApi.repositories.personas.UsuarioRepository;
import com.example.miPrimeraApi.services.BaseService;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService extends BaseService<Usuario, Long> {

    public UsuarioService(UsuarioRepository usuarioRepository){
        super(usuarioRepository);
    }
}
