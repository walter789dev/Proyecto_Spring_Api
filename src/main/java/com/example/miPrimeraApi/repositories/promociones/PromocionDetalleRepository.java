package com.example.miPrimeraApi.repositories.promociones;

import com.example.miPrimeraApi.entities.promociones.PromocionDetalle;
import com.example.miPrimeraApi.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PromocionDetalleRepository extends BaseRepository<PromocionDetalle, Long> {

    List<PromocionDetalle> findAllByPromocionId(Long id);
    List<PromocionDetalle> findAllByArticuloId(Long id);
}
