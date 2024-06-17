package com.example.miPrimeraApi.entities.ubicaciones;

import com.example.miPrimeraApi.entities.Base;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "provincias")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Provincia extends Base {

    private String nombre;
    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Pais pais;
}
