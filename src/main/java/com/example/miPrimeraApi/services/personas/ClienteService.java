package com.example.miPrimeraApi.services.personas;

import com.example.miPrimeraApi.entities.personas.Cliente;
import com.example.miPrimeraApi.entities.ubicaciones.Domicilio;
import com.example.miPrimeraApi.repositories.personas.ClienteRepository;
import com.example.miPrimeraApi.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
public class ClienteService extends BaseService<Cliente, Long> {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository){
        super(clienteRepository);
    }

    @Transactional
    public Set<Domicilio> listarDomiciliosPorCliente(Long id) throws Exception {
        try {
            Cliente cliente = clienteRepository.findById(id).orElse(null);
            if (cliente != null) return cliente.getDomicilios();
            return null;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
