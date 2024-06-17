package com.example.miPrimeraApi.entities.personas;

import com.example.miPrimeraApi.entities.ubicaciones.Sucursal;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "empleados")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Empleado extends Persona {

    @ManyToOne
    @JoinColumn(name = "id_sucursal")
    private Sucursal sucursal;

}
