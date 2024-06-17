package com.example.miPrimeraApi.repositories.promociones;

import com.example.miPrimeraApi.entities.promociones.Promocion;
import com.example.miPrimeraApi.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromocionRepository extends BaseRepository<Promocion, Long> {
}
