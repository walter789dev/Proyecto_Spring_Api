package com.example.miPrimeraApi.services.ubicaciones;

import com.example.miPrimeraApi.entities.Categoria;
import com.example.miPrimeraApi.entities.personas.Empleado;
import com.example.miPrimeraApi.entities.promociones.Promocion;
import com.example.miPrimeraApi.entities.ubicaciones.Sucursal;
import com.example.miPrimeraApi.repositories.ubicaciones.SucursalRepository;
import com.example.miPrimeraApi.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
public class SucursalService extends BaseService<Sucursal, Long> {

    @Autowired
    private SucursalRepository sucursalRepository;

    public SucursalService(SucursalRepository sucursalRepository){
        super(sucursalRepository);
    }

    @Transactional
    public List<Sucursal> listarSucursalesPorEmpresa(Long id) throws Exception {
        try {
            return sucursalRepository.findAllByEmpresaId(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public Set<Categoria> listarCategoriasPorSucursales(Long id) throws Exception {
        try {
            Sucursal sucursal = sucursalRepository.findById(id).orElse(null);
            if (sucursal != null) return sucursal.getCategorias();
            return null;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public Set<Promocion> listarPromocionesPorSucursales(Long id) throws Exception {
        try {
            Sucursal sucursal = sucursalRepository.findById(id).orElse(null);
            if (sucursal != null) return sucursal.getPromociones();
            return null;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
