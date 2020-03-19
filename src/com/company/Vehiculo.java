package com.company;

import java.util.Objects;

public class Vehiculo {
    protected Integer velocidad;
    protected Integer aceleracion;
    protected Integer anguloDeGiro;
    protected String patente;
    protected Integer peso;
    protected Integer ruedas;

    public Vehiculo (Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente, Integer peso, Integer ruedas){
        this.aceleracion=aceleracion;
        this.anguloDeGiro=anguloDeGiro;
        this.patente=patente;
        this.peso=peso;
        this.ruedas=ruedas;
        this.velocidad=velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public void setAceleracion(Integer aceleracion) {
        this.aceleracion = aceleracion;
    }

    public void setAnguloDeGiro(Integer anguloDeGiro) {
        this.anguloDeGiro = anguloDeGiro;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public void setRuedas(Integer ruedas) {
        this.ruedas = ruedas;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public Integer getAceleracion() {
        return aceleracion;
    }

    public Integer getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public String getPatente() {
        return patente;
    }

    public Integer getPeso() {
        return peso;
    }

    public Integer getRuedas() {
        return ruedas;
    }

    public Integer ecuacion() {
        return (velocidad *(aceleracion / 2)) / (anguloDeGiro *(peso-ruedas*100));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return patente.equals(vehiculo.patente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patente);
    }
}
