package hn.unah.lenguajes1900.reservaciones.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.reservaciones.entities.Cliente;
import hn.unah.lenguajes1900.reservaciones.services.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/cliente/crear")
    public Cliente crearCliente(@RequestBody Cliente cliente){
        return this.clienteServiceImpl.crearCliente(cliente);
    }

    @GetMapping("/cliente/obtener/todo")
    public List<Cliente> obtenerClientes(){
        return this.clienteServiceImpl.obtenerTodo();
    }


    @GetMapping("/cliente/obtener/porid")
    public Optional<Cliente> clienteObtenerPorId(@RequestParam long id){
        return this.clienteServiceImpl.obtenerPorId(id);
    }
}
