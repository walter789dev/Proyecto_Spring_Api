# Proyecto Spring Boot + JPA - API

## Metodos:
- [Empresa](#Empresa)
- [Sucursal](#Sucursal)
- [Categoria](#Categoria)
- [Empleado](#Empleado)
- [Cliente](#Cliente)
- [Usuario](#Usuario)
- [Imagen](#Imagen)
- [Domicilio](#Domicilio)
- [Localidad](#Localidad)
- [Provincia](#Provincia)
- [Pais](#Pais)
- [UnidadMedida](#UnidadMedida)
- [ArticuloInsumo](#ArticuloInsumo)
- [ArticuloManufacturado](#ArticuloManufacturado)
- [ArticuloManufacturadoDetalle](#ArticuloManufacturadoDetalle)
- [Promocion](#Promocion)
- [PromocionDetalle](#PromocionDetalle)
- [Pedido](#Pedido)
- [DetallePedido](#DetallePedido)

### Empresa:
- _GET ALL_: "/empresas"
- _GET BY ID_: "/empresas/{id}"
- _POST_: "empresas" -> body: Empresa
- _PUT_: "empresas" -> body: Empresa
- _DELETE_: "/empresas/{id}"

### Sucursal:
- _GET ALL_: "/sucursales"
- _GET BY ID_: "/sucursales/{id}"
- _POST_: "sucursales" -> body: Sucursal
- _PUT_: "sucursales" -> body: Sucursal
- _DELETE_: "/sucursales/{id}"

#### Metodos personalizados:
- _GET ALL BY ID EMPRESA_: "/sucursales/empresa/{id}"
- _GET ALL CATEGORIA BY SUCURSAL_: "/sucursales/{id}/categorias"
- _GET ALL PROMOCION BY SUCURSAL_: "/sucursales/{id}/promociones"

### Categoria:
- _GET ALL_: "/categorias"
- _GET BY ID_: "/categorias/{id}"
- _POST_: "categorias" -> body: Categoria
- _PUT_: "categorias" -> body: Categoria
- _DELETE_: "/categorias/{id}"

#### Metodos personalizados:
- _GET ALL BY ID CATEGORIA: "/categorias/categoria-padre/{id}"
- _PUT CATEGORIA BY CATEGORIA: "/categorias/{id}/subcategorias"

### Empleado:
- _GET ALL_: "/empleados"
- _GET BY ID_: "/empleados/{id}"
- _POST_: "empleados" -> body: Empleado
- _PUT_: "empleados" -> body: Empleado
- _DELETE_: "/empleados/{id}"

#### Metodos personalizados:
- _GET ALL BY ID SUCURSAL_: "/empleados/sucursal/{id}"

### Cliente:
- _GET ALL_: "/clientes"
- _GET BY ID_: "/clientes/{id}"
- _POST_: "clientes" -> body: Cliente
- _PUT_: "clientes" -> body: Cliente
- _DELETE_: "/clientes/{id}"

#### Metodos personalizados:
- _GET ALL DOMICILIO BY CLIENTE_: "/clientes/{id}/domicilios"

### Usuario:
- _GET ALL_: "/usuarios"
- _GET BY ID_: "/usuarios/{id}"
- _POST_: "usuarios" -> body: Usuario
- _PUT_: "usuarios" -> body: Usuario
- _DELETE_: "/usuarios/{id}"

### Imagen:
- _GET ALL_: "/imagenes"
- _GET BY ID_: "/imagenes/{id}"
- _POST_: "imagenes" -> body: Imagen
- _PUT_: "imagenes" -> body: Imagen
- _DELETE_: "/imagenes/{id}"

### Domicilio:
- _GET ALL_: "/domicilios"
- _GET BY ID_: "/domicilios/{id}"
- _POST_: "domicilios" -> body: Domicilio
- _PUT_: "domicilios" -> body: Domicilio
- _DELETE_: "/domicilios/{id}"

#### Metodos personalizados:
- _GET ALL BY ID LOCALIDAD_: "/domicilios/localidad/{id}"

### Localidad:
- _GET ALL_: "/localidades"
- _GET BY ID_: "/localidades/{id}"
- _POST_: "localidades" -> body: Localidad
- _PUT_: "localidades" -> body: Localidad
- _DELETE_: "/localidades/{id}"

#### Metodos personalizados:
- _GET ALL BY ID PROVINCIA_: "/localidades/provincia/{id}"

### Provincia:
- _GET ALL_: "/provincias"
- _GET BY ID_: "/provincias/{id}"
- _POST_: "provincias" -> body: Provincia
- _PUT_: "provincias" -> body: Provincia
- _DELETE_: "/provincias/{id}"

#### Metodos personalizados:
- _GET ALL BY ID PAIS_: "/provincias/pais/{id}"

### Pais:
- _GET ALL_: "/paises"
- _GET BY ID_: "/paises/{id}"
- _POST_: "paises" -> body: Pais
- _PUT_: "paises" -> body: Pais
- _DELETE_: "/paises/{id}"

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
- _GET ALL BY ID UNIDAD-MEDIDA_: "/articulos-insumo/unidad-medida/{id}"
- _GET ALL BY ID CATEGORIA_: "/articulos-insumo/categoria/{id}"
- _GET ALL IMAGEN BY ARTICULO-INSUMO_: "/articulos-insumo/{id}/imagenes"

### ArticuloManufacturado:
- _GET ALL_: "/articulos-manufacturado"
- _GET BY ID_: "/articulos-manufacturado/{id}"
- _POST_: "articulos-manufacturado" -> body: ArticuloManufacturado
- _PUT_: "articulos-manufacturado" -> body: ArticuloManufacturado
- _DELETE_: "/articulos-manufacturado/{id}"

#### Metodos personalizados:
- _GET ALL BY ID UNIDAD-MEDIDA_: "/articulos-manufacturado/unidad-medida/{id}"
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

### Promocion:
- _GET ALL_: "/promociones"
- _GET BY ID_: "/promociones/{id}"
- _POST_: "promociones" -> body: Promocion
- _PUT_: "promociones" -> body: Promocion
- _DELETE_: "/promociones/{id}"

#### Metodos personalizados:
- _GET ALL IMAGEN BY PROMOCION_: "/articulos-manufacturado/{id}/imagenes"

### PromocionDetalle:
- _GET ALL_: "/detalles-promocion"
- _GET BY ID_: "/detalles-promocion/{id}"
- _POST_: "detalles-promocion" -> body: PromocionDetalle
- _PUT_: "detalles-promocion" -> body: PromocionDetalle
- _DELETE_: "/detalles-promocion/{id}"

#### Metodos personalizados:
- _GET ALL BY ID PROMOCION_: "/detalles-promocion/promocion/{id}"
- _GET ALL BY ID ARTICULO_: "/detalles-promocion/articulo/{id}"

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


  
