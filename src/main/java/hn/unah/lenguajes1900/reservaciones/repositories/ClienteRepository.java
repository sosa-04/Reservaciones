package hn.unah.lenguajes1900.reservaciones.repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes1900.reservaciones.entities.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    
}
