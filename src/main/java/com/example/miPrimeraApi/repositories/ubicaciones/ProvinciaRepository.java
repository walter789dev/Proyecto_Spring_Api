package com.example.miPrimeraApi.repositories.ubicaciones;

import com.example.miPrimeraApi.entities.ubicaciones.Provincia;
import com.example.miPrimeraApi.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinciaRepository extends BaseRepository<Provincia, Long> {

    List<Provincia> findAllByPaisId(Long id);
}
