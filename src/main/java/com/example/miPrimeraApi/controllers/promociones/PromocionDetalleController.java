package com.example.miPrimeraApi.controllers.promociones;

import com.example.miPrimeraApi.controllers.BaseController;
import com.example.miPrimeraApi.entities.promociones.PromocionDetalle;
import com.example.miPrimeraApi.repositories.promociones.PromocionDetalleRepository;
import com.example.miPrimeraApi.services.promociones.PromocionDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("detalles-promocion")
public class PromocionDetalleController extends BaseController<PromocionDetalle, Long> {

    @Autowired
    private PromocionDetalleService promocionDetalleService;

    public PromocionDetalleController(PromocionDetalleService promocionDetalleService){
        super(promocionDetalleService);
    }

    @GetMapping("/promocion/{id}")
    public ResponseEntity<List<PromocionDetalle>> listarDetallesPedidoPorPromocion(@PathVariable Long id) throws Exception {
        List<PromocionDetalle> promocionDetalles = promocionDetalleService.listarDetallesPedidoPorPromocion(id);
        return ResponseEntity.of(Optional.ofNullable(promocionDetalles));
    }

    @GetMapping("/articulo/{id}")
    public ResponseEntity<List<PromocionDetalle>> listarDetallesPedidoPorArticulo(@PathVariable Long id) throws Exception {
        List<PromocionDetalle> promocionDetalles = promocionDetalleService.listarDetallesPedidoPorArticulo(id);
        return ResponseEntity.of(Optional.ofNullable(promocionDetalles));
    }
}
