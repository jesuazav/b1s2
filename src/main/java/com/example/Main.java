package com.example;

public class Main {
    public static void main(String[] args) {
        Estadio estadio = new Estadio();
        estadio.nombre = "Estadio Metropolitano";
        estadio.ciudad = "Barranquilla";
        estadio.capacidad = 46000;
        estadio.mostrarInformacion();
        System.out.println("---------------------");

        Estadio estadio2=new Estadio();
        estadio2.nombre = "Estadio El Campín";
        estadio2.ciudad = "Bogotá";
        estadio2.capacidad = 36000;
        estadio2.mostrarInformacion();

       
        jugadorFutbol jugador1 = new jugadorFutbol();
        jugador1.edad = 25;
        jugador1.nombre = "Luis diaz";
        jugador1.posicion = "Delantero";
        jugador1.golesAnotados = 2;

       
        jugadorFutbol jugador2 = new jugadorFutbol();
        jugador2.edad = 28;
        jugador2.nombre = "Juan cuadrado";
        jugador2.posicion = "Mediocampista";
        jugador2.golesAnotados = 3;

       
        jugadorFutbol jugador3= new jugadorFutbol();
        jugador3.edad = 30;
        jugador3.nombre = "David Ospina";
        jugador3.posicion = "Portero";
        // Presentar jugadores
        System.out.println("---------------------");
        jugador1.presentarse();
        jugador1.anotarGol();
        jugador1.cambiarPosicion("Extremo derecho");
         System.out.println("---------------------");
        jugador2.presentarse();
        jugador2.anotarGol();
        jugador2.cambiarPosicion("Extremo izquierdo");
        System.out.println("---------------------");
        jugador3.presentarse();
    }
}

