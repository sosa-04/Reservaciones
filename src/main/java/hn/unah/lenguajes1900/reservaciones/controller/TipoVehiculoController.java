package hn.unah.lenguajes1900.reservaciones.controller;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.reservaciones.entities.tipoVehiculo;
import hn.unah.lenguajes1900.reservaciones.services.impl.TipoVehiculoServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api")
public class TipoVehiculoController {

    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;


    @PostMapping("/TipoVehiculo/crear")
    public tipoVehiculo crearTipoVehiculo(@RequestBody tipoVehiculo tipoVehiculo){
        return this.tipoVehiculoServiceImpl.crearTipoVehiculo(tipoVehiculo);
    }
    
}
