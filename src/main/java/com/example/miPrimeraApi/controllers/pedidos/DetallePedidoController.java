package com.example.miPrimeraApi.controllers.pedidos;

import com.example.miPrimeraApi.controllers.BaseController;
import com.example.miPrimeraApi.entities.pedidos.DetallePedido;
import com.example.miPrimeraApi.services.pedidos.DetallePedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/detalles-pedido")
public class DetallePedidoController extends BaseController<DetallePedido, Long> {

    @Autowired
    private DetallePedidoService detallePedidoService;

    public DetallePedidoController(DetallePedidoService detallePedidoService){
        super(detallePedidoService);
    }

    @GetMapping("/pedido/{id}")
    public ResponseEntity<List<DetallePedido>> listarDetallesPedidoPorPedido(@PathVariable Long idPedido) throws Exception {
        List<DetallePedido> detallePedidos = detallePedidoService.listarDetallesPedidoPorPedido(idPedido);
        return ResponseEntity.ok(detallePedidos);
    }

    @GetMapping("/articulo/{id}")
    public ResponseEntity<List<DetallePedido>> listarDetallesPedidoPorArticulo(@PathVariable Long idPedido) throws Exception {
        List<DetallePedido> detallePedidos = detallePedidoService.listarDetallesPedidoPorArticulo(idPedido);
        return ResponseEntity.ok(detallePedidos);
    }
}
