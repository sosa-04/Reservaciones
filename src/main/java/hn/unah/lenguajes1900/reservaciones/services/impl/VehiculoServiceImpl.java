package hn.unah.lenguajes1900.reservaciones.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.reservaciones.entities.Vehiculo;
import hn.unah.lenguajes1900.reservaciones.repositories.VehiculoRepository;
import hn.unah.lenguajes1900.reservaciones.services.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService{

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public Vehiculo crearVehiculo(Vehiculo vehiculo) {
        return this.vehiculoRepository.save(vehiculo);
    }

    @Override
    public List<Vehiculo> obtenerTodo() {
        return (List<Vehiculo>) this.vehiculoRepository.findAll();
    }

    @Override
    public Optional<Vehiculo> obtenerPorId(long id) {
        return this.vehiculoRepository.findById(id);
    }
    
}
