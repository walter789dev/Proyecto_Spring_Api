package com.example.miPrimeraApi.controllers.personas;

import com.example.miPrimeraApi.controllers.BaseController;
import com.example.miPrimeraApi.entities.personas.Cliente;
import com.example.miPrimeraApi.entities.ubicaciones.Domicilio;
import com.example.miPrimeraApi.services.personas.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/clientes")
public class ClienteController extends BaseController<Cliente, Long> {

    @Autowired
    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService){
        super(clienteService);
    }

    @GetMapping("/{id}/domicilios")
    public ResponseEntity<Set<Domicilio>> listarDomiciliosPorCliente(@PathVariable Long id) throws Exception{
        Set<Domicilio> domicilios = clienteService.listarDomiciliosPorCliente(id);
        return ResponseEntity.of(Optional.ofNullable(domicilios));
    }
}
