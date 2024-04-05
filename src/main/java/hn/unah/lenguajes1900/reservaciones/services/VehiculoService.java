package hn.unah.lenguajes1900.reservaciones.services;

import java.util.List;
import java.util.Optional;

import hn.unah.lenguajes1900.reservaciones.entities.Vehiculo;

public interface VehiculoService {

    public Vehiculo crearVehiculo(Vehiculo vehiculo);

    public List<Vehiculo> obtenerTodo();

    public Optional<Vehiculo> obtenerPorId(long id);
}
