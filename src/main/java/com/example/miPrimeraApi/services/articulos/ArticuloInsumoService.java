package com.example.miPrimeraApi.services.articulos;

import com.example.miPrimeraApi.entities.Imagen;
import com.example.miPrimeraApi.entities.articulos.ArticuloInsumo;
import com.example.miPrimeraApi.repositories.articulos.ArticuloInsumoRepository;
import com.example.miPrimeraApi.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
public class ArticuloInsumoService extends BaseService<ArticuloInsumo, Long> {

    @Autowired
    private ArticuloInsumoRepository articuloInsumoRepository;

    public ArticuloInsumoService(ArticuloInsumoRepository articuloInsumoRepository) {
        super(articuloInsumoRepository);
    }

    @Transactional
    public List<ArticuloInsumo> listarArticulosInsumoPorUnidadMedida(Long id) throws Exception {
        try {
            return articuloInsumoRepository.findAllByUnidadMedidaId(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<ArticuloInsumo> listarArticulosInsumoPorCategoria(Long id) throws Exception {
        try {
            return articuloInsumoRepository.findAllByCategoriaId(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public Set<Imagen> listarImagenesPorArticulosInsumo(Long id) throws Exception {
        try {
            ArticuloInsumo articuloInsumo = articuloInsumoRepository.findById(id).orElse(null);
            if (articuloInsumo != null) return articuloInsumo.getImagenesArticulos();
            return null;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
