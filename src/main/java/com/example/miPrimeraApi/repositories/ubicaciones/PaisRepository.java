package com.example.miPrimeraApi.repositories.ubicaciones;

import com.example.miPrimeraApi.entities.ubicaciones.Pais;
import com.example.miPrimeraApi.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends BaseRepository<Pais, Long> {
}
