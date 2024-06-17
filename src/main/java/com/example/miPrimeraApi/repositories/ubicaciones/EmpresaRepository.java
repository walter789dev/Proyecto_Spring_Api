package com.example.miPrimeraApi.repositories.ubicaciones;

import com.example.miPrimeraApi.entities.ubicaciones.Empresa;
import com.example.miPrimeraApi.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends BaseRepository<Empresa, Long> {
}
