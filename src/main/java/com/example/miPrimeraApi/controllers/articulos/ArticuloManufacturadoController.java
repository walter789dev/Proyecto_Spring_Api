package com.example.miPrimeraApi.controllers.articulos;

import com.example.miPrimeraApi.controllers.BaseController;
import com.example.miPrimeraApi.entities.Imagen;
import com.example.miPrimeraApi.entities.articulos.ArticuloInsumo;
import com.example.miPrimeraApi.entities.articulos.ArticuloManufacturado;
import com.example.miPrimeraApi.services.articulos.ArticuloManufacturadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("articulos-manufacturado")
public class ArticuloManufacturadoController extends BaseController<ArticuloManufacturado, Long> {

    @Autowired
    private ArticuloManufacturadoService articuloManufacturadoService;

    public ArticuloManufacturadoController(ArticuloManufacturadoService articuloManufacturadoService){
        super(articuloManufacturadoService);
    }

    @GetMapping("/unidad-medida/{id}")
    public ResponseEntity<List<ArticuloManufacturado>> listarArticulosManufacturadosPorUnidadMedida(@PathVariable Long id) throws Exception {
        List<ArticuloManufacturado> articuloInsumos = articuloManufacturadoService.listarArticulosManufacturadosPorUnidadMedida(id);
        return ResponseEntity.of(Optional.ofNullable(articuloInsumos));
    }

    @GetMapping("/categoria/{id}")
    public ResponseEntity<List<ArticuloManufacturado>> listarArticulosManufacturadoPorCategoria(@PathVariable Long id) throws Exception {
        List<ArticuloManufacturado> articuloInsumos = articuloManufacturadoService.listarArticulosManufacturadosPorCategoria(id);
        return ResponseEntity.of(Optional.ofNullable(articuloInsumos));
    }

    @GetMapping("/{id}/imagenes")
    public ResponseEntity<Set<Imagen>> listarImagenesPorArticulosManufacturado(@PathVariable Long id) throws Exception {
        Set<Imagen> imagenes = articuloManufacturadoService.listarImagenesPorArticulosManufacturado(id);
        return ResponseEntity.of(Optional.ofNullable(imagenes));
    }
}
