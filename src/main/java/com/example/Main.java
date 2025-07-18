package com.example;

public class Main {
    public static void main(String[] args) {
        Estadio estadio = new Estadio();
        estadio.nombre = "Estadio Metropolitano";
        estadio.ciudad = "Barranquilla";
        estadio.capacidad = 46000;
        estadio.mostrarInformacion();

        Estadio estadio2=new Estadio();
        estadio2.nombre = "Estadio El Campín";
        estadio2.ciudad = "Bogotá";
        estadio2.capacidad = 36000;
        estadio2.mostrarInformacion();
    }
}

