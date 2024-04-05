package hn.unah.lenguajes1900.reservaciones.repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes1900.reservaciones.entities.tipoCliente;

public interface TipoClienteRepository extends CrudRepository<tipoCliente, Long> {
    
}
