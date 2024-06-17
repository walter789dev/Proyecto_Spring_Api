package com.example.miPrimeraApi.entities.ubicaciones;

import com.example.miPrimeraApi.entities.Base;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "empresas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Empresa extends Base {

    private String nombre;
    @Column(name = "razon_social")
    private String razonSocial;
    private Integer cuil;
}

