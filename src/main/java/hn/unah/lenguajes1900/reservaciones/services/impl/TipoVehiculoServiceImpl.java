package hn.unah.lenguajes1900.reservaciones.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.reservaciones.entities.tipoVehiculo;
import hn.unah.lenguajes1900.reservaciones.repositories.TipoVehiculoRepository;
import hn.unah.lenguajes1900.reservaciones.services.tipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl implements tipoVehiculoService{

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public tipoVehiculo crearTipoVehiculo(tipoVehiculo tipoVehiculo) {
      return this.tipoVehiculoRepository.save(tipoVehiculo);
    }
    
}
