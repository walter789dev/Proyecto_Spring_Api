package com.example.miPrimeraApi.controllers.pedidos;

import com.example.miPrimeraApi.controllers.BaseController;
import com.example.miPrimeraApi.entities.pedidos.Pedido;
import com.example.miPrimeraApi.services.pedidos.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedidos")
public class PedidoController extends BaseController<Pedido, Long> {

    @Autowired
    private PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService){
        super(pedidoService);
    }

    @PutMapping("/total")
    public Optional<Pedido> calcularTotal(@RequestBody Pedido pedido) throws Exception {
        Pedido pedido_aux = pedidoService.calcularTotal(pedido);
        return Optional.ofNullable(pedido_aux);
    }

    @GetMapping("/empleado/{id}")
    public ResponseEntity<List<Pedido>> listarPedidosPorEmpleado(@PathVariable Long id) throws Exception{
        List<Pedido> pedidos = pedidoService.listarPedidosPorEmpleado(id);
        return ResponseEntity.of(Optional.ofNullable(pedidos));
    }

    @GetMapping("/cliente/{id}")
    public ResponseEntity<List<Pedido>> listarPedidosPorCliente(@PathVariable Long id) throws Exception{
        List<Pedido> pedidos = pedidoService.listarPedidosPorCliente(id);
        return ResponseEntity.of(Optional.ofNullable(pedidos));
    }

    @GetMapping("/domicilio/{id}")
    public ResponseEntity<List<Pedido>> listarPedidosPorDomicilio(@PathVariable Long id) throws Exception{
        List<Pedido> pedidos = pedidoService.listarPedidosPorDomicilio(id);
        return ResponseEntity.of(Optional.ofNullable(pedidos));
    }

    @GetMapping("/sucursal/{id}")
    public ResponseEntity<List<Pedido>> listarPedidosPorSucursal(@PathVariable Long id) throws Exception{
        List<Pedido> pedidos = pedidoService.listarPedidosPorSucursal(id);
        return ResponseEntity.of(Optional.ofNullable(pedidos));
    }
}
