package hn.unah.lenguajes1900.reservaciones.repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes1900.reservaciones.entities.tipoVehiculo;

public interface TipoVehiculoRepository extends CrudRepository<tipoVehiculo, Long> {
    
}
