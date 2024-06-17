package com.example.miPrimeraApi.repositories.personas;

import com.example.miPrimeraApi.entities.personas.Usuario;
import com.example.miPrimeraApi.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends BaseRepository<Usuario, Long> {
}
