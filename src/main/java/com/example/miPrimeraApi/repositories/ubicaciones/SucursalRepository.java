package com.example.miPrimeraApi.repositories.ubicaciones;

import com.example.miPrimeraApi.entities.ubicaciones.Sucursal;
import com.example.miPrimeraApi.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SucursalRepository extends BaseRepository<Sucursal, Long> {

    List<Sucursal> findAllByEmpresaId(Long id);
}
