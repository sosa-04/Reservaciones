package hn.unah.lenguajes1900.reservaciones.repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes1900.reservaciones.entities.Vehiculo;

public interface VehiculoRepository extends CrudRepository<Vehiculo, Long> {
    
}
