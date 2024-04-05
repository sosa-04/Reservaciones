package hn.unah.lenguajes1900.reservaciones.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.reservaciones.entities.Cliente;
import hn.unah.lenguajes1900.reservaciones.repositories.ClienteRepository;
import hn.unah.lenguajes1900.reservaciones.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> obtenerTodo() {
        return (List<Cliente>) this.clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> obtenerPorId(long id) {
        return this.clienteRepository.findById(id);
    }
    
}
