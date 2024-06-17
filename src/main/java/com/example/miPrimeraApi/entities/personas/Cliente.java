package com.example.miPrimeraApi.entities.personas;

import com.example.miPrimeraApi.entities.ubicaciones.Domicilio;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;


@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "clientes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Cliente extends Persona {

    @ManyToMany
    @JoinTable(name = "clientes_domicilios",
        joinColumns = @JoinColumn(name = "id_cliente"),
        inverseJoinColumns = @JoinColumn(name = "id_domicilio"))
    @Builder.Default
    private Set<Domicilio> domicilios = new HashSet<>();
}
