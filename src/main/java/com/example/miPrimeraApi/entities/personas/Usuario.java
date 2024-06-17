package com.example.miPrimeraApi.entities.personas;

import com.example.miPrimeraApi.entities.Base;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario extends Base {
    @Column(name = "auth0_id")
    private String auth0Id;
    @Column(name = "nombre_usuario")
    private String username;
}
