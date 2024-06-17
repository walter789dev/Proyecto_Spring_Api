package com.example.miPrimeraApi.repositories.pedidos;

import com.example.miPrimeraApi.entities.pedidos.Factura;
import com.example.miPrimeraApi.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends BaseRepository<Factura, Long> {
}
