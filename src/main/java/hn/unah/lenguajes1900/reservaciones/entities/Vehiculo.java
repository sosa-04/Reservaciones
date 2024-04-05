package hn.unah.lenguajes1900.reservaciones.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "vehiculo")
@Data
public class Vehiculo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idvehiculo")
    private long idVehiculo;

    private String marca;

    private String anio;

    private byte disponible;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idtipovehiculo", referencedColumnName = "idtipovehiculo")
    private tipoVehiculo tipoVehiculo;

}
