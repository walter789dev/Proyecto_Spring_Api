package com.example.miPrimeraApi.controllers.ubicaciones;

import com.example.miPrimeraApi.controllers.BaseController;
import com.example.miPrimeraApi.entities.ubicaciones.Localidad;
import com.example.miPrimeraApi.services.ubicaciones.LocalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/localidades")
public class LocalidadController extends BaseController<Localidad, Long> {

    @Autowired
    private LocalidadService localidadService;

    public LocalidadController(LocalidadService localidadService){
        super(localidadService);
    }

    @GetMapping("/provincia/{id}")
    public ResponseEntity<List<Localidad>> listarLocalidadesPorProvincia(@PathVariable Long id) throws Exception {
        List<Localidad> provincias = localidadService.listarLocalidadesPorProvincia(id);
        return ResponseEntity.of(Optional.ofNullable(provincias));
    }
}