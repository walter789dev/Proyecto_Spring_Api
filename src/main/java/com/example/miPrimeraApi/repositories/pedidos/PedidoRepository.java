package com.example.miPrimeraApi.repositories.pedidos;

import com.example.miPrimeraApi.entities.pedidos.Pedido;
import com.example.miPrimeraApi.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends BaseRepository<Pedido, Long> {

    List<Pedido> findAllByEmpleadoId(Long id);
    List<Pedido> findAllByClienteId(Long id);
    List<Pedido> findAllByDomicilioId(Long id);
    List<Pedido> findAllBySucursalId(Long id);
}
