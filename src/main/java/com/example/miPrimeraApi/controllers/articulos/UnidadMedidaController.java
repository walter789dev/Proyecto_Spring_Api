package com.example.miPrimeraApi.controllers.articulos;

import com.example.miPrimeraApi.controllers.BaseController;
import com.example.miPrimeraApi.entities.articulos.UnidadMedida;
import com.example.miPrimeraApi.services.articulos.UnidadMedidaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("unidades-medida")
public class UnidadMedidaController extends BaseController<UnidadMedida, Long> {

    public UnidadMedidaController(UnidadMedidaService unidadMedidaService){
        super(unidadMedidaService);
    }
}
