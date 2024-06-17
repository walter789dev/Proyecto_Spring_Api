package com.example.miPrimeraApi.services.ubicaciones;

import com.example.miPrimeraApi.entities.ubicaciones.Localidad;
import com.example.miPrimeraApi.repositories.ubicaciones.LocalidadRepository;
import com.example.miPrimeraApi.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LocalidadService extends BaseService<Localidad, Long> {

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadService(LocalidadRepository localidadRepository){
        super(localidadRepository);
    }

    @Transactional
    public List<Localidad> listarLocalidadesPorProvincia(Long id) throws Exception {
        try {
            return localidadRepository.findAllByProvinciaId(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
