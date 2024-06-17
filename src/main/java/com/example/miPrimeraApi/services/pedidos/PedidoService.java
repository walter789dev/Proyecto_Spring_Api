package com.example.miPrimeraApi.services.pedidos;

import com.example.miPrimeraApi.entities.pedidos.DetallePedido;
import com.example.miPrimeraApi.entities.pedidos.Pedido;
import com.example.miPrimeraApi.repositories.pedidos.PedidoRepository;
import com.example.miPrimeraApi.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PedidoService extends BaseService<Pedido, Long> {

    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private DetallePedidoService detallePedidoService;

    public PedidoService(PedidoRepository pedidoRepository){
        super(pedidoRepository);
    }

    @Transactional
    public Pedido calcularTotal(Pedido pedido) throws Exception {
        try{
            List<DetallePedido> detallePedidos = detallePedidoService.listarDetallesPedidoPorPedido(pedido.getId());
            double total = 0.0;

            if (detallePedidos != null && !detallePedidos.isEmpty()) {
                total = detallePedidos.stream()
                        .mapToDouble(DetallePedido::getSubTotal)
                        .sum();
            }

            pedido.setTotal(total);
            return pedidoRepository.save(pedido);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    @Transactional
    public Pedido actualizar(Pedido pedido) throws Exception {
        try{
            calcularTotal(pedido);
            return pedidoRepository.save(pedido);
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Transactional
    public List<Pedido> listarPedidosPorEmpleado(Long id) throws Exception {
        try {
            return pedidoRepository.findAllByEmpleadoId(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Pedido> listarPedidosPorCliente(Long id) throws Exception {
        try {
            return pedidoRepository.findAllByClienteId(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Pedido> listarPedidosPorDomicilio(Long id) throws Exception {
        try {
            return pedidoRepository.findAllByDomicilioId(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Pedido> listarPedidosPorSucursal(Long id) throws Exception {
        try {
            return pedidoRepository.findAllBySucursalId(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
