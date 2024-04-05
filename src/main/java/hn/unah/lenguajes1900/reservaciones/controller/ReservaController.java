package hn.unah.lenguajes1900.reservaciones.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.reservaciones.services.impl.ReservaServiceImpl;

@RestController
@RequestMapping("/api")
public class ReservaController {
    
    @Autowired
    private ReservaServiceImpl reservaServiceImpl;

    @PostMapping("/reserva/crear")
    public String hacerReserva(@RequestParam long idCliente, @RequestParam long idVehiculo, @RequestParam int dias){
        return this.reservaServiceImpl.hacerReservacion(idCliente, idVehiculo, dias);
    }

}
