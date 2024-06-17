package com.example.miPrimeraApi.entities.pedidos;

import com.example.miPrimeraApi.entities.Base;
import com.example.miPrimeraApi.entities.articulos.Articulo;
import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "detalles_pedidos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetallePedido extends Base {

    private Integer cantidad;
    @Column(name = "sub_total")
    private Double subTotal;

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "id_articulo")
    private Articulo articulo;
}
