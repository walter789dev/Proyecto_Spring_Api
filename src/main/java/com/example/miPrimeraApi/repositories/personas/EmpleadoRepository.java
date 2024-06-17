package com.example.miPrimeraApi.repositories.personas;

import com.example.miPrimeraApi.entities.personas.Empleado;
import com.example.miPrimeraApi.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends BaseRepository<Empleado, Long> {

    List<Empleado> findAllBySucursalId(Long id);
}
