package com.company;

import java.util.List;

public class Carrera {

    private Double distancia;
    private Double premioEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;
    private List<Vehiculo>listaDeVehiculos;

    public Carrera (Double distancia, Double premioEnDolares,String nombre, Integer cantidadDeVehiculosPermitidos, List<Vehiculo>listaDeVehiculos){
        this.distancia=distancia;
        this.premioEnDolares=premioEnDolares;
        this.nombre=nombre;
        this.cantidadDeVehiculosPermitidos=cantidadDeVehiculosPermitidos;
        this.listaDeVehiculos=listaDeVehiculos;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public void setPremioEnDolares(Double premioEnDolares) {
        this.premioEnDolares = premioEnDolares;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidadDeVehiculosPermitidos(Integer cantidadDeVehiculosPermitidos) {
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
    }

    public void setListaDeVehiculos(List<Vehiculo> listaDeVehiculos) {
        this.listaDeVehiculos = listaDeVehiculos;
    }

    public Double getDistancia() {
        return distancia;
    }

    public Double getPremioEnDolares() {
        return premioEnDolares;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCantidadDeVehiculosPermitidos() {
        return cantidadDeVehiculosPermitidos;
    }

    public List<Vehiculo> getListaDeVehiculos() {
        return listaDeVehiculos;
    }

    public void darDeAltaAuto(Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente){
        Vehiculo unAuto = new Autos(velocidad,aceleracion,anguloDeGiro,patente);
        if (cantidadDeVehiculosPermitidos>listaDeVehiculos.size()){
            listaDeVehiculos.add(unAuto);
        }
    }

    public void darDeAltaMoto(Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente){
        Motos unaMoto = new Motos(velocidad,aceleracion,anguloDeGiro,patente);
        if (cantidadDeVehiculosPermitidos>listaDeVehiculos.size()){
            listaDeVehiculos.add(unaMoto);
        }
    }

    public void eliminarVehiculo(Vehiculo vehiculo){
        listaDeVehiculos.remove(vehiculo);
    }

    public void eliminarVehiculoConPatente(String unaPatente){
        Vehiculo unVehiculo = null;
        for (Vehiculo vehiculo:listaDeVehiculos){
            if (unaPatente.equals(vehiculo.patente)){
                unVehiculo = vehiculo;
            }
        }
        listaDeVehiculos.remove(unVehiculo);
        System.out.println("Se elimino el vehiculo con patente numero: "+ unVehiculo.patente + " de la carrera.");
    }

    public void ganadorDeLaCarrera(){
        Vehiculo vehiculoGanador = null;
        Integer ganador = 0;
        for (Vehiculo vehiculo:listaDeVehiculos) {
            if (vehiculo.ecuacion() > ganador){
                ganador = vehiculo.ecuacion();
                vehiculoGanador=vehiculo;
            }
        }
    }

    public void socorrerAuto (String patente){
    }

    public void socorrerMoto (String patente){
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "listaDeVehiculos=" + listaDeVehiculos +
                '}';
    }
}
