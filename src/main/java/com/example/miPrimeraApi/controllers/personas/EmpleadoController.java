package com.example.miPrimeraApi.controllers.personas;

import com.example.miPrimeraApi.controllers.BaseController;
import com.example.miPrimeraApi.entities.personas.Empleado;
import com.example.miPrimeraApi.services.personas.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController extends BaseController<Empleado, Long> {

    @Autowired
    private EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService) {
        super(empleadoService);
    }

    @GetMapping("/sucursal/{id}")
    public ResponseEntity<List<Empleado>> listarEmpleadosPorSucursal(@PathVariable Long id) throws Exception{
        List<Empleado> empleados = empleadoService.listarEmpleadosPorSucursal(id);
        return ResponseEntity.of(Optional.ofNullable(empleados));
    }
}
