package hn.unah.lenguajes1900.reservaciones.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "reserva")
@Data
public class Reserva {
    

    @Id
    @Column(name = "idreserva")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReserva;

    @Column(name = "idcliente")
    private long idCliente;

    @Column(name = "idvehiculo")
    private long idVehiculo;

    private Date fecha;

    private int dias;

    private double total;
}
