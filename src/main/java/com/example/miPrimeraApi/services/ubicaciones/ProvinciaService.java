package com.example.miPrimeraApi.services.ubicaciones;

import com.example.miPrimeraApi.entities.ubicaciones.Provincia;
import com.example.miPrimeraApi.repositories.ubicaciones.ProvinciaRepository;
import com.example.miPrimeraApi.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProvinciaService extends BaseService<Provincia, Long> {

    @Autowired
    private ProvinciaRepository provinciaRepository;

    public ProvinciaService(ProvinciaRepository provinciaRepository){
        super(provinciaRepository);
    }

    @Transactional
    public List<Provincia> listarProvinciasPorPais(Long id) throws Exception {
        try {
            return provinciaRepository.findAllByPaisId(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
