package com.example.miPrimeraApi.repositories.articulos;

import com.example.miPrimeraApi.entities.articulos.ArticuloManufacturadoDetalle;
import com.example.miPrimeraApi.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloManufacturadoDetalleRepository extends BaseRepository<ArticuloManufacturadoDetalle, Long> {

    List<ArticuloManufacturadoDetalle> findAllByArticuloManufacturadoId(Long id);
    List<ArticuloManufacturadoDetalle> findAllByArticuloInsumoId(Long id);
}
