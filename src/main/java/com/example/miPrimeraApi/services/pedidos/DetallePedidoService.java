package com.example.miPrimeraApi.services.pedidos;

import com.example.miPrimeraApi.entities.pedidos.DetallePedido;
import com.example.miPrimeraApi.repositories.pedidos.DetallePedidoRepository;
import com.example.miPrimeraApi.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DetallePedidoService extends BaseService<DetallePedido, Long> {

    @Autowired
    private DetallePedidoRepository detallePedidoRepository;

    public DetallePedidoService(DetallePedidoRepository detallePedidoRepository){
        super(detallePedidoRepository);
    }

    @Transactional
    public List<DetallePedido> listarDetallesPedidoPorPedido(Long idPedido) throws Exception {
        try{
            return detallePedidoRepository.findAllByPedidoId(idPedido);
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Transactional
    public List<DetallePedido> listarDetallesPedidoPorArticulo(Long idPedido) throws Exception {
        try{
            return detallePedidoRepository.findAllByArticuloId(idPedido);
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
}
