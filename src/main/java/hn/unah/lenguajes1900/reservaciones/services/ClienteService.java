package hn.unah.lenguajes1900.reservaciones.services;


import java.util.List;
import java.util.Optional;

import hn.unah.lenguajes1900.reservaciones.entities.Cliente;

public interface ClienteService {
    
    public Cliente crearCliente(Cliente cliente);

    public List<Cliente> obtenerTodo();

    public Optional<Cliente> obtenerPorId(long id);
}
