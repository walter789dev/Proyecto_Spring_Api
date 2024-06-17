package com.example.miPrimeraApi.services.promociones;

import com.example.miPrimeraApi.entities.promociones.PromocionDetalle;
import com.example.miPrimeraApi.repositories.promociones.PromocionDetalleRepository;
import com.example.miPrimeraApi.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
public class PromocionDetalleService extends BaseService<PromocionDetalle, Long> {

    @Autowired
    private PromocionDetalleRepository promocionDetalleRepository;

    public PromocionDetalleService(PromocionDetalleRepository promocionDetalleRepository){
        super(promocionDetalleRepository);
    }

    @Transactional
    public List<PromocionDetalle> listarDetallesPedidoPorPromocion(Long id) throws Exception {
        try {
            return promocionDetalleRepository.findAllByPromocionId(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<PromocionDetalle> listarDetallesPedidoPorArticulo(Long id) throws Exception {
        try {
            return promocionDetalleRepository.findAllByArticuloId(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
