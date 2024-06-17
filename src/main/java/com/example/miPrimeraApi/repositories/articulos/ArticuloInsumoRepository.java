package com.example.miPrimeraApi.repositories.articulos;

import com.example.miPrimeraApi.entities.articulos.ArticuloInsumo;
import com.example.miPrimeraApi.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloInsumoRepository extends BaseRepository<ArticuloInsumo, Long> {

    List<ArticuloInsumo> findAllByUnidadMedidaId(Long id);
    List<ArticuloInsumo> findAllByCategoriaId(Long id);
}
