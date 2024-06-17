package com.example.miPrimeraApi.repositories.articulos;

import com.example.miPrimeraApi.entities.articulos.ArticuloManufacturado;
import com.example.miPrimeraApi.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloManufacturadoRepository extends BaseRepository<ArticuloManufacturado, Long> {
    List<ArticuloManufacturado> findAllByUnidadMedidaId(Long id);
    List<ArticuloManufacturado> findAllByCategoriaId(Long id);
}
