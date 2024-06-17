package com.example.miPrimeraApi.entities.articulos;

import com.example.miPrimeraApi.entities.Base;
import com.example.miPrimeraApi.entities.Categoria;
import com.example.miPrimeraApi.entities.Imagen;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Articulo extends Base {

    protected String denominacion;
    @Column(name = "precio_venta")
    protected Double precioVenta;

    @OneToMany
    @Builder.Default
    protected Set<Imagen> imagenesArticulos = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    protected Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "id_unidad_medida")
    protected UnidadMedida unidadMedida;
}
