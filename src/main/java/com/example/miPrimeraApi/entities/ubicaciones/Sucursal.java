package com.example.miPrimeraApi.entities.ubicaciones;

import com.example.miPrimeraApi.entities.Base;
import com.example.miPrimeraApi.entities.Categoria;
import com.example.miPrimeraApi.entities.promociones.Promocion;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "sucursales")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Sucursal extends Base {

    private String nombre;
    @Column(name = "horario_apertura")
    private LocalTime horarioApertura;
    @Column(name = "horario_cierre")
    private LocalTime horarioCierre;
    @Column(name = "casa_matriz")
    private Boolean casaMatriz;

    @OneToOne
    @JoinColumn(name = "id_domicilio")
    private Domicilio domicilio;

    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;

    @ManyToMany
    @JoinTable(name = "sucursal_promocion",
            joinColumns = @JoinColumn(name = "id_sucursal"),
            inverseJoinColumns = @JoinColumn(name = "id_promocion"))
    @Builder.Default
    private Set<Promocion> promociones = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "sucursal_categoria",
            joinColumns = @JoinColumn(name = "id_sucursal"),
            inverseJoinColumns = @JoinColumn(name = "id_categoria"))
    @Builder.Default
    private Set<Categoria> categorias = new HashSet<>();
}
