package com.example.miPrimeraApi;

import com.example.miPrimeraApi.entities.*;
import com.example.miPrimeraApi.entities.articulos.ArticuloInsumo;
import com.example.miPrimeraApi.entities.articulos.ArticuloManufacturado;
import com.example.miPrimeraApi.entities.articulos.ArticuloManufacturadoDetalle;
import com.example.miPrimeraApi.entities.articulos.UnidadMedida;
import com.example.miPrimeraApi.entities.enums.*;
import com.example.miPrimeraApi.entities.pedidos.Factura;
import com.example.miPrimeraApi.entities.promociones.Promocion;
import com.example.miPrimeraApi.entities.promociones.PromocionDetalle;
import com.example.miPrimeraApi.entities.ubicaciones.Empresa;
import com.example.miPrimeraApi.entities.ubicaciones.Sucursal;
import com.example.miPrimeraApi.entities.pedidos.DetallePedido;
import com.example.miPrimeraApi.entities.pedidos.Pedido;
import com.example.miPrimeraApi.entities.personas.Cliente;
import com.example.miPrimeraApi.entities.personas.Empleado;
import com.example.miPrimeraApi.entities.personas.Usuario;
import com.example.miPrimeraApi.entities.ubicaciones.Domicilio;
import com.example.miPrimeraApi.entities.ubicaciones.Localidad;
import com.example.miPrimeraApi.entities.ubicaciones.Pais;
import com.example.miPrimeraApi.entities.ubicaciones.Provincia;
import com.example.miPrimeraApi.repositories.*;
import com.example.miPrimeraApi.repositories.articulos.ArticuloInsumoRepository;
import com.example.miPrimeraApi.repositories.articulos.ArticuloManufacturadoDetalleRepository;
import com.example.miPrimeraApi.repositories.articulos.ArticuloManufacturadoRepository;
import com.example.miPrimeraApi.repositories.articulos.UnidadMedidaRepository;
import com.example.miPrimeraApi.repositories.pedidos.DetallePedidoRepository;
import com.example.miPrimeraApi.repositories.pedidos.FacturaRepository;
import com.example.miPrimeraApi.repositories.pedidos.PedidoRepository;
import com.example.miPrimeraApi.repositories.personas.ClienteRepository;
import com.example.miPrimeraApi.repositories.personas.EmpleadoRepository;
import com.example.miPrimeraApi.repositories.personas.UsuarioRepository;
import com.example.miPrimeraApi.repositories.promociones.PromocionDetalleRepository;
import com.example.miPrimeraApi.repositories.promociones.PromocionRepository;
import com.example.miPrimeraApi.repositories.ubicaciones.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
public class MiPrimeraApiApplication {

	@Autowired
	private ArticuloInsumoRepository articuloInsumoRepository;
	@Autowired
	private ArticuloManufacturadoRepository articuloManufacturadoRepository;
	@Autowired
	private ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository;
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private DomicilioRepository domicilioRepository;
	@Autowired
	private EmpresaRepository empresaRepository;
	@Autowired
	private EmpleadoRepository empleadoRepository;
	@Autowired
	private FacturaRepository facturaRepository;
	@Autowired
	private ImagenRepository imagenRepository;
	@Autowired
	private LocalidadRepository localidadRepository;
	@Autowired
	private PaisRepository paisRepository;
	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired
	private DetallePedidoRepository detallePedidoRepository;
	@Autowired
	private ProvinciaRepository provinciaRepository;
	@Autowired
	private PromocionRepository promocionRepository;
	@Autowired
	private PromocionDetalleRepository promocionDetalleRepository;
	@Autowired
	private SucursalRepository sucursalRepository;
	@Autowired
	private UnidadMedidaRepository unidadMedidaRepository;
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Bean
	@Transactional
	CommandLineRunner init( ArticuloInsumoRepository articuloInsumoRepository,
							ArticuloManufacturadoRepository articuloManufacturadoRepository,
							ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository,
							CategoriaRepository categoriaRepository,
							ClienteRepository clienteRepository,
							DomicilioRepository domicilioRepository,
							EmpleadoRepository empleadoRepository,
							EmpresaRepository empresaRepository,
							FacturaRepository facturaRepository,
							ImagenRepository imagenRepository,
							LocalidadRepository localidadRepository,
							PaisRepository paisRepository,
							PedidoRepository pedidoRepository,
							DetallePedidoRepository detallePedidoRepository,
							ProvinciaRepository provinciaRepository,
							PromocionRepository promocionRepository,
							PromocionDetalleRepository promocionDetalleRepository,
							SucursalRepository sucursalRepository,
							UnidadMedidaRepository unidadMedidaRepository,
							UsuarioRepository usuarioRepository){
		return arg ->{
			// ---------- Países - Provincias - Localidades:
			Pais pais1 = Pais.builder().nombre("Argentina").build();
			paisRepository.save(pais1);

			Provincia prov1 = Provincia.builder()
					.nombre("Mendoza").pais(pais1)
					.build();
			provinciaRepository.save(prov1);

			Localidad loc1 = Localidad.builder()
					.nombre("Guaymallen").provincia(prov1)
					.build();
			localidadRepository.save(loc1);

			Localidad loc2 = Localidad.builder()
					.nombre("Godoy Cruz").provincia(prov1)
					.build();
			localidadRepository.save(loc2);

			// --------------- Categorías:
			Categoria c1 = Categoria.builder().denominacion("Categoria 1").build();
			categoriaRepository.save(c1);

			Categoria c2 = Categoria.builder()
					.denominacion("Categoria 2").categoriaPadre(c1)
					.build();
			categoriaRepository.save(c2);

			// --------------- Artículos:
			UnidadMedida un1 = UnidadMedida.builder().denominacion("kg").build();
			unidadMedidaRepository.save(un1);

			ArticuloInsumo artIn1 = ArticuloInsumo.builder()
					.denominacion("Articulo 1")
					.precioCompra(500.99).precioVenta(700.99)
					.stockActual(10).stockMaximo(20)
					.elaborado(true).unidadMedida(un1)
					.categoria(c1)
					.build();
			articuloInsumoRepository.save(artIn1);

			ArticuloManufacturado artMan1 = ArticuloManufacturado.builder()
					.denominacion("Articulo 2").descripcion("Articulo 2")
					.preparacion("Preparacion").tiempoEstimadoMinutos(60)
					.precioVenta(350.99).unidadMedida(un1)
					.categoria(c2)
					.build();
			articuloManufacturadoRepository.save(artMan1);

			ArticuloManufacturadoDetalle artD1 = ArticuloManufacturadoDetalle.builder()
					.cantidad(4).articuloInsumo(artIn1)
					.articuloManufacturado(artMan1)
					.build();
			articuloManufacturadoDetalleRepository.save(artD1);

			// ---------------- Promociones:
			Imagen img3 = Imagen.builder().denominacion("Imagen 3").build();
			imagenRepository.save(img3);

			Promocion p1 = Promocion.builder()
					.denominacion("Promo 1").descripcion("Promocion 1")
					.fechaDesde(LocalDate.of(2024, 6, 1))
					.fechaHasta(LocalDate.of(2024, 6, 10))
					.horaDesde(LocalTime.of(13,0)).horaHasta(LocalTime.of(20, 30))
					.precioPromocion(3500.99).tipoPromocion(TipoPromocion.HAPPYHOUR)
					.build();
			p1.getImagenesPromocion().add(img3);
			promocionRepository.save(p1);

			PromocionDetalle pd1 = PromocionDetalle.builder()
					.cantidad(3).articulo(artMan1).promocion(p1)
					.build();
			promocionDetalleRepository.save(pd1);

			// ---------------- Empresa - Sucursal:
			Empresa empr1 = Empresa.builder()
					.nombre("Empresa 1").cuil(12334555).razonSocial("Empresa S.A")
					.build();
			empresaRepository.save(empr1);

			Domicilio domSucursal = Domicilio.builder()
					.calle("Calle San Pedro").numero(1234)
					.cp(1234).localidad(loc1)
					.build();
			domicilioRepository.save(domSucursal);

			Sucursal suc1 = Sucursal.builder()
					.nombre("Sucursal 1").domicilio(domSucursal)
					.horarioApertura(LocalTime.of(8,30))
					.horarioCierre(LocalTime.of(20,30))
					.empresa(empr1).casaMatriz(Boolean.FALSE)
					.build();
			suc1.getCategorias().add(c1);
			suc1.getPromociones().add(p1);
			sucursalRepository.save(suc1);

			// ---------------- Empleados:
			// Empleado 1:
			Imagen img1 = Imagen.builder().denominacion("Imagen 1").build();
			imagenRepository.save(img1);

			Usuario us1 = Usuario.builder()
					.auth0Id("pass").username("user")
					.build();
			usuarioRepository.save(us1);

			Empleado em1 = Empleado.builder()
					.nombre("Cinthia").apellido("Rigoni").edad(28)
					.telefono("123456").email("prueba@gmail.com")
					.fechaNacimiento(LocalDate.of(1992, 5, 27))
					.usuario(us1).imagenPersona(img1).rol(Rol.CAJERO)
					.sucursal(suc1)
					.build();
			empleadoRepository.save(em1);

			// ------------------ Clientes:
			// Cliente 1:
			Imagen img2 = Imagen.builder().denominacion("Imagen 2").build();
			imagenRepository.save(img2);

			Usuario us2 = Usuario.builder()
					.auth0Id("pass2").username("user2")
					.build();
			usuarioRepository.save(us2);

			Domicilio dom2 = Domicilio.builder()
					.calle("Calle Esteban Quito").numero(5678)
					.cp(5678).localidad(loc2)
					.build();
			domicilioRepository.save(dom2);

			Cliente cli1 = Cliente.builder()
					.nombre("Juan").apellido("Fernandez").edad(30)
					.telefono("3453534").email("correo@gmail.com")
					.fechaNacimiento(LocalDate.of(1996, 1, 31))
					.usuario(us2).imagenPersona(img2).rol(Rol.CLIENTE)
					.build();
			cli1.getDomicilios().add(dom2);
			clienteRepository.save(cli1);

			// ------------------ Pedidos:
			Factura f1 = Factura.builder()
					.fechaFacturacion(LocalDate.of(2023,5,23))
					.mpPagoId(20).mpPreferenciaId("12")
					.mpOrdenComercialId(35).mpTipoPago("Pago")
					.formaPago(FormaPago.EFECTIVO)
					.totalVenta(2000.99)
					.build();
			facturaRepository.save(f1);

			Pedido ped1 = Pedido.builder()
					.fechaPedido(LocalDate.of(2023,5,23))
					.sucursal(suc1).empleado(em1).domicilio(dom2)
					.cliente(cli1).formaPago(FormaPago.EFECTIVO).factura(f1)
					.tipoEnvio(TipoEnvio.DELIVERY)
					.estado(Estado.PENDIENTE)
					.horaEstimadaFinalizacion(LocalTime.of(12,55))
					.total(250.5).totalCosto(170.0)
					.build();
			pedidoRepository.save(ped1);

			DetallePedido detPed1 = DetallePedido.builder()
					.pedido(ped1).cantidad(5).subTotal(450.5)
					.articulo(artIn1)
					.build();
			detallePedidoRepository.save(detPed1);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(MiPrimeraApiApplication.class, args);
		System.out.println("Servidor iniciado.");
	}
}
