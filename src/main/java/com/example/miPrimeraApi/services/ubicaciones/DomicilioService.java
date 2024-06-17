package com.example.miPrimeraApi.services.ubicaciones;

import com.example.miPrimeraApi.entities.ubicaciones.Domicilio;
import com.example.miPrimeraApi.entities.ubicaciones.Localidad;
import com.example.miPrimeraApi.repositories.ubicaciones.DomicilioRepository;
import com.example.miPrimeraApi.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DomicilioService extends BaseService<Domicilio, Long> {

    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioService(DomicilioRepository domicilioRepository) {
        super(domicilioRepository);
    }

    @Transactional
    public List<Domicilio> listarDomiciliosPorLocalidad(Long id) throws Exception {
        try {
            return domicilioRepository.findAllByLocalidadId(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
