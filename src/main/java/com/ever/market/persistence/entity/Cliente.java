package com.ever.market.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name = "Clientes")
public class Cliente {

    @Id
    @Column(name = "id", length = 20)
    private String id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "celular")
    private Double celular;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;



    // Getters and setters
}
