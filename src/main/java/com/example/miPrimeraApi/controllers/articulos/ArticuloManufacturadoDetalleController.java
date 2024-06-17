package com.example.miPrimeraApi.controllers.articulos;

import com.example.miPrimeraApi.controllers.BaseController;
import com.example.miPrimeraApi.entities.articulos.ArticuloManufacturado;
import com.example.miPrimeraApi.entities.articulos.ArticuloManufacturadoDetalle;
import com.example.miPrimeraApi.services.articulos.ArticuloManufacturadoDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("manufacturados-detalle")
public class ArticuloManufacturadoDetalleController extends BaseController<ArticuloManufacturadoDetalle, Long> {

    @Autowired
    private ArticuloManufacturadoDetalleService articuloManufacturadoDetalleService;

    public ArticuloManufacturadoDetalleController(ArticuloManufacturadoDetalleService articuloManufacturadoDetalleService){
        super(articuloManufacturadoDetalleService);
    }

    @GetMapping("/articulo-manufacturado/{id}")
    public ResponseEntity<List<ArticuloManufacturadoDetalle>> listarDetalleManufacturadoPorArticuloManufacturado(@PathVariable Long id) throws Exception {
        List<ArticuloManufacturadoDetalle> articuloInsumos = articuloManufacturadoDetalleService.listarDetalleManufacturadoPorArticuloManufacturado(id);
        return ResponseEntity.of(Optional.ofNullable(articuloInsumos));
    }

    @GetMapping("/articulo-insumo/{id}")
    public ResponseEntity<List<ArticuloManufacturadoDetalle>> listarDetalleManufacturadoPorArticuloInsumo(@PathVariable Long id) throws Exception {
        List<ArticuloManufacturadoDetalle> articuloInsumos = articuloManufacturadoDetalleService.listarDetalleManufacturadoPorArticuloInsumo(id);
        return ResponseEntity.of(Optional.ofNullable(articuloInsumos));
    }
}
