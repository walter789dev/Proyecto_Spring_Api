package com.example.miPrimeraApi.services.ubicaciones;

import com.example.miPrimeraApi.entities.ubicaciones.Pais;
import com.example.miPrimeraApi.repositories.ubicaciones.PaisRepository;
import com.example.miPrimeraApi.services.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PaisService extends BaseService<Pais, Long> {
    public PaisService(PaisRepository paisRepository){
        super(paisRepository);
    }
}
