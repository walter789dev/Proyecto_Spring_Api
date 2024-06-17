package com.example.miPrimeraApi.controllers.promociones;

import com.example.miPrimeraApi.controllers.BaseController;
import com.example.miPrimeraApi.entities.Imagen;
import com.example.miPrimeraApi.entities.promociones.Promocion;
import com.example.miPrimeraApi.services.promociones.PromocionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("promociones")
public class PromocionController extends BaseController<Promocion, Long> {

    @Autowired
    private PromocionService promocionService;

    public PromocionController(PromocionService promocionService){
        super(promocionService);
    }

    @GetMapping("/{id}/imagenes")
    public ResponseEntity<Set<Imagen>> listarImagenesPorPromocion(@PathVariable Long id) throws Exception{
        Set<Imagen> imagenes = promocionService.listarImagenesPorPromocion(id);
        return ResponseEntity.of(Optional.ofNullable(imagenes));
    }
}
