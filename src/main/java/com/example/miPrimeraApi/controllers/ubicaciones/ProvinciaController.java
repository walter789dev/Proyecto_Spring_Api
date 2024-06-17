package com.example.miPrimeraApi.controllers.ubicaciones;

import com.example.miPrimeraApi.controllers.BaseController;
import com.example.miPrimeraApi.entities.ubicaciones.Provincia;
import com.example.miPrimeraApi.services.ubicaciones.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/provincias")
public class ProvinciaController extends BaseController<Provincia, Long> {

    @Autowired
    private ProvinciaService provinciaService;

    public ProvinciaController(ProvinciaService provinciaService){
        super(provinciaService);
    }

    @GetMapping("/pais/{id}")
    public ResponseEntity<List<Provincia>> listarProvinciaPorPais(@PathVariable Long id) throws Exception {
        List<Provincia> provincias = provinciaService.listarProvinciasPorPais(id);
        return ResponseEntity.of(Optional.ofNullable(provincias));
    }
}
