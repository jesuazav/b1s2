package com.example;

public class jugadorFutbol {
    String nombre;
    String posicion;
    int edad;
    int golesAnotados;

    // metodo para anotar un gol
    void anotarGol() {
        golesAnotados++;
        System.out.println(nombre + " ha anotado un gol. Total goles: " + golesAnotados);
    }

    // metodo para establecer el nombre del jugador
    void presentarse() {
        System.out.println(
                "Hola, soy " + nombre + ", tengo " + edad + " años, juego de " + posicion + " y he anotado " + golesAnotados + " goles.");
    }

    public void cambiarPosicion( String nuevaPosicion) {
         System.out.println(nombre + " ahora juega de " + nuevaPosicion);
    }
}
