package hn.unah.lenguajes1900.reservaciones.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.reservaciones.entities.tipoCliente;
import hn.unah.lenguajes1900.reservaciones.services.impl.TipoClienteServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;




@RestController
@RequestMapping("/api")
public class TipoClienteController {
    
    @Autowired
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping("/TipoCliente/crear")
    public tipoCliente crearTipoCliente(@RequestParam String descripcion){

        return this.tipoClienteServiceImpl.crearCliente(descripcion);
    }
}
