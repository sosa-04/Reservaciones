package hn.unah.lenguajes1900.reservaciones.repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes1900.reservaciones.entities.Reserva;

public interface ReservaRepository extends CrudRepository<Reserva, Long>{
    
}
