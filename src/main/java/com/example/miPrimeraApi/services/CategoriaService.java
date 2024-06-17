package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Categoria;
import com.example.miPrimeraApi.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoriaService extends BaseService<Categoria, Long> {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository){
        super(categoriaRepository);
    }

    @Transactional
    public Categoria agregarSubcategoria(Long idPadre, Categoria subcategoria) throws Exception {
        try{
            Categoria categoriaPadre = categoriaRepository.findById(idPadre).orElse(null);
            if (categoriaPadre != null) {
                subcategoria.setCategoriaPadre(categoriaPadre);
                categoriaRepository.save(subcategoria);

                return subcategoria;
            } else return null;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Categoria> listarPorCategoriaPadre(Long categoriaPadre) throws Exception {
        try {
            return categoriaRepository.findAllByCategoriaPadreId(categoriaPadre);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
