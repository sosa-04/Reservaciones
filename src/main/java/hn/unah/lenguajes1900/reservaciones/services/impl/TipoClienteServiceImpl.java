package hn.unah.lenguajes1900.reservaciones.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.reservaciones.entities.tipoCliente;
import hn.unah.lenguajes1900.reservaciones.repositories.TipoClienteRepository;
import hn.unah.lenguajes1900.reservaciones.services.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService {

    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    private tipoCliente tipocliente = new tipoCliente();



    @Override
    public tipoCliente crearCliente(String descripcion) {

        this.tipocliente.setDescripcion(descripcion);

        return this.tipoClienteRepository.save(tipocliente);
    }
    
}
