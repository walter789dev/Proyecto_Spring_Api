package com.example.miPrimeraApi.controllers.ubicaciones;

import com.example.miPrimeraApi.controllers.BaseController;
import com.example.miPrimeraApi.entities.ubicaciones.Domicilio;
import com.example.miPrimeraApi.services.ubicaciones.DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController extends BaseController<Domicilio, Long> {

    @Autowired
    private DomicilioService domicilioService;

    public DomicilioController(DomicilioService domicilioService){
        super(domicilioService);
    }

    @GetMapping("/localidad/{id}")
    public ResponseEntity<List<Domicilio>> listarDomiciliosPorLocalidad(@PathVariable Long id) throws Exception {
        List<Domicilio> domicilios = domicilioService.listarDomiciliosPorLocalidad(id);
        return ResponseEntity.of(Optional.ofNullable(domicilios));
    }
}
