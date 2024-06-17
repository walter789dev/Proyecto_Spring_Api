package com.example.miPrimeraApi.entities.pedidos;

import com.example.miPrimeraApi.entities.Base;
import com.example.miPrimeraApi.entities.enums.FormaPago;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "facturas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Factura extends Base {
    @Column(name = "fecha_facturacion")
    private LocalDate fechaFacturacion;
    @Column(name = "mp_pago_id")
    private Integer mpPagoId;
    @Column(name = "mp_orden_comercial_id")
    private Integer mpOrdenComercialId;
    @Column(name = "mp_preferencia_id")
    private String mpPreferenciaId;
    @Column(name = "mp_tipo_pago")
    private String mpTipoPago;

    @Enumerated(EnumType.STRING)
    @Column(name = "forma_pago")
    private FormaPago formaPago;

    @Column(name = "total_venta")
    private Double totalVenta;
}
