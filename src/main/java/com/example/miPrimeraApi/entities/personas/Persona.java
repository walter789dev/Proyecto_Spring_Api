package com.example.miPrimeraApi.entities.personas;

import com.example.miPrimeraApi.entities.Base;
import com.example.miPrimeraApi.entities.Imagen;
import com.example.miPrimeraApi.entities.enums.Rol;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public abstract class Persona extends Base implements Serializable {

    protected String nombre;
    protected String apellido;
    protected Integer edad;
    protected String telefono;
    @Column(name = "fecha_nacimiento")
    protected LocalDate fechaNacimiento;
    protected String email;

    @OneToOne
    @JoinColumn(name = "id_imagen")
    protected Imagen imagenPersona;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    protected Usuario usuario;

    @Enumerated(EnumType.STRING)
    protected Rol rol;

}
