package com.example.miPrimeraApi.services.articulos;

import com.example.miPrimeraApi.entities.Imagen;
import com.example.miPrimeraApi.entities.articulos.ArticuloManufacturado;
import com.example.miPrimeraApi.repositories.articulos.ArticuloManufacturadoRepository;
import com.example.miPrimeraApi.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
public class ArticuloManufacturadoService extends BaseService<ArticuloManufacturado, Long> {

    @Autowired
    private ArticuloManufacturadoRepository articuloManufacturadoRepository;

    public ArticuloManufacturadoService(ArticuloManufacturadoRepository articuloManufacturadoRepository){
        super(articuloManufacturadoRepository);
    }

    @Transactional
    public List<ArticuloManufacturado> listarArticulosManufacturadosPorUnidadMedida(Long id) throws Exception {
        try {
            return articuloManufacturadoRepository.findAllByUnidadMedidaId(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<ArticuloManufacturado> listarArticulosManufacturadosPorCategoria(Long id) throws Exception {
        try {
            return articuloManufacturadoRepository.findAllByCategoriaId(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public Set<Imagen> listarImagenesPorArticulosManufacturado(Long id) throws Exception {
        try {
            ArticuloManufacturado articuloManufacturado = articuloManufacturadoRepository.findById(id).orElse(null);
            if (articuloManufacturado != null) return articuloManufacturado.getImagenesArticulos();
            return null;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
