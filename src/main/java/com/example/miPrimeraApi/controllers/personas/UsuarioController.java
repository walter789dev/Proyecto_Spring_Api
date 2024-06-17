package com.example.miPrimeraApi.controllers.personas;

import com.example.miPrimeraApi.controllers.BaseController;
import com.example.miPrimeraApi.entities.personas.Usuario;
import com.example.miPrimeraApi.services.personas.UsuarioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController extends BaseController<Usuario, Long> {

    public UsuarioController(UsuarioService usuarioService){
        super(usuarioService);
    }
}
