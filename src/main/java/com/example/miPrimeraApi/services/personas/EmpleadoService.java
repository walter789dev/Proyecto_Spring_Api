package com.example.miPrimeraApi.services.personas;

import com.example.miPrimeraApi.entities.personas.Empleado;
import com.example.miPrimeraApi.repositories.personas.EmpleadoRepository;
import com.example.miPrimeraApi.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpleadoService extends BaseService<Empleado, Long> {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository){
       super(empleadoRepository);
    }

    @Transactional
    public List<Empleado> listarEmpleadosPorSucursal(Long id) throws Exception {
        try {
            return empleadoRepository.findAllBySucursalId(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
