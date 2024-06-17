package com.example.miPrimeraApi.repositories.ubicaciones;

import com.example.miPrimeraApi.entities.ubicaciones.Localidad;
import com.example.miPrimeraApi.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad, Long> {

    List<Localidad> findAllByProvinciaId(Long id);
}
