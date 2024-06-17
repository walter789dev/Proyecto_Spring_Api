# Proyecto Spring Boot + JPA - API

## Metodos:

### UnidadMedida:
- _GET ALL_: "/unidades-medida"
- _GET BY ID_: "/unidades-medida/{id}"
- _POST_: "unidades-medida" -> body: UnidadMedida
- _PUT_: "unidades-medida" -> body: UnidadMedida
- _DELETE_: "/unidades-medida/{id}"

### ArticuloInsumo:
- _GET ALL_: "/articulos-insumo"
- _GET BY ID_: "/articulos-insumo/{id}"
- _POST_: "articulos-insumo" -> body: ArticuloInsumo
- _PUT_: "articulos-insumo" -> body: ArticuloInsumo
- _DELETE_: "/articulos-insumo/{id}"

#### Metodos personalizados:
- _GET ALL BY ID UNIDAD-MEDIDA_: "/articulos-insumo/detalle-promocion/{id}"
- _GET ALL BY ID CATEGORIA_: "/articulos-insumo/categoria/{id}"
- _GET ALL IMAGEN BY ARTICULO-INSUMO_: "/articulos-insumo/{id}/imagenes"

### ArticuloManufacturado:
- _GET ALL_: "/articulos-manufacturado"
- _GET BY ID_: "/articulos-manufacturado/{id}"
- _POST_: "articulos-manufacturado" -> body: ArticuloManufacturado
- _PUT_: "articulos-manufacturado" -> body: ArticuloManufacturado
- _DELETE_: "/articulos-manufacturado/{id}"

#### Metodos personalizados:
- _GET ALL BY ID UNIDAD-MEDIDA_: "/articulos-manufacturado/detalle-promocion/{id}"
- _GET ALL BY ID CATEGORIA_: "/articulos-manufacturado/categoria/{id}"
- _GET ALL IMAGEN BY ARTICULO-INSUMO_: "/articulos-manufacturado/{id}/imagenes"

### ArticuloManufacturadoDetalle:
- _GET ALL_: "/manufacturados-detalle"
- _GET BY ID_: "/manufacturados-detalle/{id}"
- _POST_: "manufacturados-detalle" -> body: ArticuloManufacturadoDetalle
- _PUT_: "manufacturados-detalle" -> body: ArticuloManufacturadoDetalle
- _DELETE_: "/manufacturados-detalle/{id}"

#### Metodos personalizados:
- _GET ALL BY ID ARTICULO-MANUFACTURADO_: "/manufacturados-detalle/articulo-manufacturado/{id}"
- _GET ALL BY ID ARTICULO-INSUMO_: "/manufacturados-detalle/articulo-insumo/{id}"

### Pedido:
- _GET ALL_: "/pedidos"
- _GET BY ID_: "/pedidos/{id}"
- _POST_: "pedidos" -> body: Pedido
- _PUT_: "pedidos" -> body: Pedido
- _DELETE_: "/pedidos/{id}"

#### Metodos personalizados:
- _GET ALL BY ID EMPLEADO_: "/pedidos/empleado/{id}"
- _GET ALL BY ID CLIENTE_: "/pedidos/cliente/{id}"
- _GET ALL BY ID DOMICILIO_: "/pedidos/domicilio/{id}"
- _GET ALL BY ID SUCURSAL_: "/pedidos/sucursal/{id}"

### DetallePedido:
- _GET ALL_: "/detalles-pedido"
- _GET BY ID_: "/detalles-pedido/{id}"
- _POST_: "/detalles-pedido" -> body: DetallePedido
- _PUT_: "/detalles-pedido" -> body: DetallePedido
- _DELETE_: "/detalles-pedido/{id}"

#### Metodos personalizados:
- _GET ALL BY ID PEDIDO: "/pedidos/pedido/{id}"
- _GET ALL BY ID ARTICULO: "/pedidos/articulo/{id}"


  
