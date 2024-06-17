package com.example.miPrimeraApi.services.pedidos;

import com.example.miPrimeraApi.entities.pedidos.Factura;
import com.example.miPrimeraApi.repositories.pedidos.FacturaRepository;
import com.example.miPrimeraApi.services.BaseService;
import org.springframework.stereotype.Service;

@Service
public class FacturaService extends BaseService<Factura, Long> {
    public FacturaService(FacturaRepository facturaRepository){
        super(facturaRepository);
    }
}
