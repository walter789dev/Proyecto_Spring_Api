package com.example.miPrimeraApi.repositories.articulos;

import com.example.miPrimeraApi.entities.articulos.UnidadMedida;
import com.example.miPrimeraApi.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadMedidaRepository extends BaseRepository<UnidadMedida, Long> {
}
