package com.example.miPrimeraApi.controllers.ubicaciones;

import com.example.miPrimeraApi.controllers.BaseController;
import com.example.miPrimeraApi.entities.ubicaciones.Pais;
import com.example.miPrimeraApi.services.ubicaciones.PaisService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paises")
public class PaisController extends BaseController<Pais, Long> {

    public PaisController(PaisService paisService){
        super(paisService);
    }
}
