package com.company;

public class Vehiculo {
    private Integer velocidad;
    private Integer aceleracion;
    private Double anguloDeGiro;
    private String patente;
    private Double peso;
    private Integer ruedas;

    public Vehiculo (Integer velocidad, Integer aceleracion, Double anguloDeGiro, String patente, Double peso, Integer ruedas){
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

    public void setAnguloDeGiro(Double anguloDeGiro) {
        this.anguloDeGiro = anguloDeGiro;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setPeso(Double peso) {
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

    public Double getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public String getPatente() {
        return patente;
    }

    public Double getPeso() {
        return peso;
    }

    public Integer getRuedas() {
        return ruedas;
    }

}
