package com.example.ParcialLaboratorio2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
@Entity
@Table(name = "imagen_cliente")

public class Imagen_Cliente extends Base implements Serializable {
    private String denominacion;

    public Imagen_Cliente() {
    }

    public Imagen_Cliente(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
}
