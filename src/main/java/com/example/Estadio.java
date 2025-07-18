package com.example;

public class Estadio {
    public String nombre;
    public String ciudad;
    public int capacidad;

    void mostrarInformacion() {
        System.out.println("Nombre del estadio: " + nombre);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Capacidad: " + capacidad);
    }

}