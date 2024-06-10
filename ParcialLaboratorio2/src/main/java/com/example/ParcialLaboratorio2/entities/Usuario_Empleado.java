package com.example.ParcialLaboratorio2.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "usuario_empleado")
public class Usuario_Empleado extends Base implements Serializable {
    private String auth0Id;
    @Column(name = "nombre_de_usuario")
    private String username;
    @Column(name = "id_empleado")
    private Empleado empleado;

    public Usuario_Empleado() {
    }

    public Usuario_Empleado(String auth0Id, String username, Empleado empleado) {
        this.auth0Id = auth0Id;
        this.username = username;
        this.empleado = empleado;
    }

    public String getAuth0Id() {
        return auth0Id;
    }

    public String getUsername() {
        return username;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setAuth0Id(String auth0Id) {
        this.auth0Id = auth0Id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}

