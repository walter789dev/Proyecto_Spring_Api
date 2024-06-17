package com.example.miPrimeraApi.services.promociones;

import com.example.miPrimeraApi.entities.Imagen;
import com.example.miPrimeraApi.entities.promociones.Promocion;
import com.example.miPrimeraApi.entities.promociones.PromocionDetalle;
import com.example.miPrimeraApi.repositories.promociones.PromocionRepository;
import com.example.miPrimeraApi.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
public class PromocionService extends BaseService<Promocion, Long> {

    @Autowired
    private PromocionRepository promocionRepository;

    public PromocionService(PromocionRepository promocionRepository){
        super(promocionRepository);
    }

    @Transactional
    public Set<Imagen> listarImagenesPorPromocion(Long id) throws Exception {
        try {
            Promocion promocion = promocionRepository.findById(id).orElse(null);
            if (promocion != null) return promocion.getImagenesPromocion();
            return null;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
