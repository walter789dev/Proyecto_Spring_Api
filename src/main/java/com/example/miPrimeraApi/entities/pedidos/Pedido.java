package com.example.miPrimeraApi.entities.pedidos;

import com.example.miPrimeraApi.entities.Base;
import com.example.miPrimeraApi.entities.ubicaciones.Sucursal;
import com.example.miPrimeraApi.entities.enums.Estado;
import com.example.miPrimeraApi.entities.enums.FormaPago;
import com.example.miPrimeraApi.entities.enums.TipoEnvio;
import com.example.miPrimeraApi.entities.personas.Cliente;
import com.example.miPrimeraApi.entities.personas.Empleado;
import com.example.miPrimeraApi.entities.ubicaciones.Domicilio;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "pedidos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pedido extends Base {

    @Column(name = "hora_finalizacion")
    private LocalTime horaEstimadaFinalizacion;

    private Double total;

    @Column(name = "costo_total")
    private Double totalCosto;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    @Column(name = "tipo_envio")
    @Enumerated(EnumType.STRING)
    private TipoEnvio tipoEnvio;

    @Column(name = "forma_pago")
    @Enumerated(EnumType.STRING)
    private FormaPago formaPago;

    @Column(name = "fecha_pedido")
    private LocalDate fechaPedido;

    @OneToOne
    @JoinColumn(name = "id_factura")
    private Factura factura;

    @ManyToOne
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "id_sucursal")
    private Sucursal sucursal;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_domicilio")
    private Domicilio domicilio;

}
