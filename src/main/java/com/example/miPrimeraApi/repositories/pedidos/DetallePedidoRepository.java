package com.example.miPrimeraApi.repositories.pedidos;

import com.example.miPrimeraApi.entities.pedidos.DetallePedido;
import com.example.miPrimeraApi.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetallePedidoRepository extends BaseRepository<DetallePedido, Long> {

    List<DetallePedido> findAllByPedidoId(Long id);
    List<DetallePedido> findAllByArticuloId(Long id);
}
