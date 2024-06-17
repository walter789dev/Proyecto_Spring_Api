package com.example.miPrimeraApi.services.articulos;

import com.example.miPrimeraApi.entities.articulos.UnidadMedida;
import com.example.miPrimeraApi.repositories.articulos.UnidadMedidaRepository;
import com.example.miPrimeraApi.services.BaseService;
import org.springframework.stereotype.Service;

@Service
public class UnidadMedidaService extends BaseService<UnidadMedida, Long> {
    public UnidadMedidaService(UnidadMedidaRepository unidadMedidaRepository){
        super(unidadMedidaRepository);
    }
}
