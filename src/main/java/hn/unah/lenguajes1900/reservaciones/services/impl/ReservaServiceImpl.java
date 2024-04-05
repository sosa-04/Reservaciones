package hn.unah.lenguajes1900.reservaciones.services.impl;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.reservaciones.entities.Reserva;
import hn.unah.lenguajes1900.reservaciones.entities.Vehiculo;
import hn.unah.lenguajes1900.reservaciones.repositories.ClienteRepository;
import hn.unah.lenguajes1900.reservaciones.repositories.ReservaRepository;
import hn.unah.lenguajes1900.reservaciones.repositories.VehiculoRepository;
import hn.unah.lenguajes1900.reservaciones.services.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private VehiculoRepository  vehiculoRepository;



    
    @Override
    public String hacerReservacion(long idCliente, long idVehiculo, int dias) {

        Reserva reserva = new Reserva();

        if(this.clienteRepository.findById(idCliente).isPresent()){
            if (this.vehiculoRepository.findById(idVehiculo).isPresent()) {
                Vehiculo vehiculo = this.vehiculoRepository.findById(idVehiculo).get();

                if(vehiculo.getDisponible()==1){
                    reserva.setIdCliente(idCliente);
                    reserva.setIdVehiculo(idVehiculo);
                    reserva.setFecha(Date.valueOf(LocalDate.now()));
                    reserva.setDias(dias);
                    reserva.setTotal((dias*24)*(vehiculo.getTipoVehiculo().getPrecioXhora()));

                    this.reservaRepository.save(reserva);

                    vehiculo.setDisponible((byte) 0);

                    this.vehiculoRepository.save(vehiculo);

                    return "Reservacion agregada con exito";
                }else{
                    return "El vehiculo ya se encuentra rentado";
                }
                
            }else{
                return "El vehiculo enviado no existe";
            }
        }
        return "El cliente enviado no existe";
    }


}
