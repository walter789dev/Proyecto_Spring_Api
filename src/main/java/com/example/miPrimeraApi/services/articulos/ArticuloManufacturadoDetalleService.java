package com.example.miPrimeraApi.services.articulos;

import com.example.miPrimeraApi.entities.articulos.ArticuloManufacturadoDetalle;
import com.example.miPrimeraApi.repositories.articulos.ArticuloManufacturadoDetalleRepository;
import com.example.miPrimeraApi.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ArticuloManufacturadoDetalleService extends BaseService<ArticuloManufacturadoDetalle, Long> {

    @Autowired
    private ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository;

    public ArticuloManufacturadoDetalleService(ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository){
        super(articuloManufacturadoDetalleRepository);
    }

    @Transactional
    public List<ArticuloManufacturadoDetalle> listarDetalleManufacturadoPorArticuloManufacturado(Long id) throws Exception {
        try {
            return articuloManufacturadoDetalleRepository.findAllByArticuloManufacturadoId(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<ArticuloManufacturadoDetalle> listarDetalleManufacturadoPorArticuloInsumo(Long id) throws Exception {
        try {
            return articuloManufacturadoDetalleRepository.findAllByArticuloInsumoId(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
