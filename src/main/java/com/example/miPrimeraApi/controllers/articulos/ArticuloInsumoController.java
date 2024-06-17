package com.example.miPrimeraApi.controllers.articulos;

import com.example.miPrimeraApi.controllers.BaseController;
import com.example.miPrimeraApi.entities.Imagen;
import com.example.miPrimeraApi.entities.articulos.ArticuloInsumo;
import com.example.miPrimeraApi.services.articulos.ArticuloInsumoService;
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
@RequestMapping("articulos-insumo")
public class ArticuloInsumoController extends BaseController<ArticuloInsumo, Long> {

    @Autowired
    private ArticuloInsumoService articuloInsumoService;

    public ArticuloInsumoController(ArticuloInsumoService articuloInsumoService){
        super(articuloInsumoService);
    }

    @GetMapping("/detalle-promocion/{id}")
    public ResponseEntity<List<ArticuloInsumo>> listarArticulosInsumoPorUnidadMedida(@PathVariable Long id) throws Exception {
        List<ArticuloInsumo> articuloInsumos = articuloInsumoService.listarArticulosInsumoPorUnidadMedida(id);
        return ResponseEntity.of(Optional.ofNullable(articuloInsumos));
    }

    @GetMapping("/categoria/{id}")
    public ResponseEntity<List<ArticuloInsumo>> listarArticulosInsumoPorCategoria(@PathVariable Long id) throws Exception {
        List<ArticuloInsumo> articuloInsumos = articuloInsumoService.listarArticulosInsumoPorCategoria(id);
        return ResponseEntity.of(Optional.ofNullable(articuloInsumos));
    }

    @GetMapping("/{id}/imagenes")
    public ResponseEntity<Set<Imagen>> listarImagenesPorArticulosInsumo(@PathVariable Long id) throws Exception {
        Set<Imagen> imagenes = articuloInsumoService.listarImagenesPorArticulosInsumo(id);
        return ResponseEntity.of(Optional.ofNullable(imagenes));
    }


}
