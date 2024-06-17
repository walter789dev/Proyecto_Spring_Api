package com.example.miPrimeraApi.services.ubicaciones;

import com.example.miPrimeraApi.entities.ubicaciones.Empresa;
import com.example.miPrimeraApi.repositories.ubicaciones.EmpresaRepository;
import com.example.miPrimeraApi.services.BaseService;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService extends BaseService<Empresa, Long> {
    public EmpresaService(EmpresaRepository empresaRepository){
        super(empresaRepository);
    }
}
