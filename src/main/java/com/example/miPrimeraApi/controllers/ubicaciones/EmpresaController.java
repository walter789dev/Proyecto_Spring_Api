package com.example.miPrimeraApi.controllers.ubicaciones;

import com.example.miPrimeraApi.controllers.BaseController;
import com.example.miPrimeraApi.entities.ubicaciones.Empresa;
import com.example.miPrimeraApi.services.ubicaciones.EmpresaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresas")
public class EmpresaController extends BaseController<Empresa, Long> {

    public EmpresaController(EmpresaService empresaService){
        super(empresaService);
    }
}
