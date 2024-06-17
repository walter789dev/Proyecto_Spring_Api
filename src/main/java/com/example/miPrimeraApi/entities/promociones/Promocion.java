package com.example.miPrimeraApi.entities.promociones;

import com.example.miPrimeraApi.entities.Base;
import com.example.miPrimeraApi.entities.Imagen;
import com.example.miPrimeraApi.entities.enums.TipoPromocion;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "promociones")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Promocion extends Base {

    private String denominacion;
    @Column(name = "fecha_desde")
    private LocalDate fechaDesde;
    @Column(name = "fecha_hasta")
    private LocalDate fechaHasta;
    @Column(name = "hora_desde")
    private LocalTime horaDesde;
    @Column(name = "hora_hasta")
    private LocalTime horaHasta;
    private String descripcion;
    @Column(name = "precio_promocion")
    private Double precioPromocion;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_promocion")
    private TipoPromocion tipoPromocion;

    @OneToMany
    @Builder.Default
    private Set<Imagen> imagenesPromocion = new HashSet<Imagen>();
}
