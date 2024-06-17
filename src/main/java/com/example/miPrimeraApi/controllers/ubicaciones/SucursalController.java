package com.example.miPrimeraApi.controllers.ubicaciones;

import com.example.miPrimeraApi.controllers.BaseController;
import com.example.miPrimeraApi.entities.Categoria;
import com.example.miPrimeraApi.entities.promociones.Promocion;
import com.example.miPrimeraApi.entities.ubicaciones.Sucursal;
import com.example.miPrimeraApi.services.ubicaciones.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/sucursales")
public class SucursalController extends BaseController<Sucursal, Long> {

    @Autowired
    private SucursalService sucursalService;

    public SucursalController(SucursalService sucursalService){
        super(sucursalService);
    }

    @GetMapping("/empresa/{id}")
    public ResponseEntity<List<Sucursal>> listarSucursalesPorEmpresa(@PathVariable Long id) throws Exception{
        List<Sucursal> empleados = sucursalService.listarSucursalesPorEmpresa(id);
        return ResponseEntity.of(Optional.ofNullable(empleados));
    }

    @GetMapping("/{id}/categorias")
    public ResponseEntity<Set<Categoria>> listarCategoriasPorSucursales(@PathVariable Long id) throws Exception{
        Set<Categoria> empleados = sucursalService.listarCategoriasPorSucursales(id);
        return ResponseEntity.of(Optional.ofNullable(empleados));
    }

    @GetMapping("/{id}/promociones")
    public ResponseEntity<Set<Promocion>> listarPromocionesPorSucursales(@PathVariable Long id) throws Exception{
        Set<Promocion> promociones = sucursalService.listarPromocionesPorSucursales(id);
        return ResponseEntity.of(Optional.ofNullable(promociones));
    }
}
