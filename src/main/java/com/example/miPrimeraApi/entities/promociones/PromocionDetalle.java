package com.example.miPrimeraApi.entities.promociones;

import com.example.miPrimeraApi.entities.Base;
import com.example.miPrimeraApi.entities.articulos.Articulo;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "promociones_detalles")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PromocionDetalle extends Base {
    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "id_promocion")
    private Promocion promocion;

    @ManyToOne
    @JoinColumn(name = "id_articlo")
    private Articulo articulo;
}
