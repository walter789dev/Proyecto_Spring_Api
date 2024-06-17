package com.example.miPrimeraApi.entities.articulos;

import com.example.miPrimeraApi.entities.Base;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "unidades_medidas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UnidadMedida extends Base {

    private String denominacion;

}
