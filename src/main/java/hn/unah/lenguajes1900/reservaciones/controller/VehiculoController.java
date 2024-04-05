package hn.unah.lenguajes1900.reservaciones.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.reservaciones.entities.Vehiculo;
import hn.unah.lenguajes1900.reservaciones.services.impl.VehiculoServiceImpl;

@RestController
@RequestMapping("/api")
public class VehiculoController {

    @Autowired
    private VehiculoServiceImpl vehiculoServiceImpl;

    @PostMapping("/vehiculo/crear")
    public Vehiculo creaVehiculo(@RequestBody Vehiculo vehiculo){
        return this.vehiculoServiceImpl.crearVehiculo(vehiculo);
    }
    
    @GetMapping("/vehiculo/obtener/todo")
    public List<Vehiculo> obtenerVehiculos(){
        return this.vehiculoServiceImpl.obtenerTodo();
    }

    @GetMapping("/vehiculo/obtener/porid/{id}")
    public Optional<Vehiculo> vehiculoObtenerPorId(@PathVariable long id ){
        return this.vehiculoServiceImpl.obtenerPorId(id);
    }
}
