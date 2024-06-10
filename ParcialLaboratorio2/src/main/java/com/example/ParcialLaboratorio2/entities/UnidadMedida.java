package com.example.ParcialLaboratorio2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "unidad_medida")
public class UnidadMedida extends Base implements Serializable {
    private String denominacion;

    public UnidadMedida() {
    }

    public UnidadMedida(String denominacionl) {
        this.denominacion = denominacionl;
    }

    public String getDenominacionl() {
        return denominacion;
    }

    public void setDenominacionl(String denominacionl) {
        this.denominacion = denominacionl;
    }
}
