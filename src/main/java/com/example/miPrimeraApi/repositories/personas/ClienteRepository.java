package com.example.miPrimeraApi.repositories.personas;

import com.example.miPrimeraApi.entities.personas.Cliente;
import com.example.miPrimeraApi.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends BaseRepository<Cliente, Long> {
}
