package hn.unah.lenguajes1900.reservaciones.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "tipocliente")
public class tipoCliente {
    

    @Id
    @Column(name = "idtipocliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTipoCliente; 

    private String descripcion;

    @JsonIgnore
    @OneToMany(mappedBy = "tipoCliente")
    private List<Cliente> clientes;
}
