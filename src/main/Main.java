package main;

import clases.Persona;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.nombre = "Chrys";
        persona1.apellido = "Morales";
        persona1.desplegarInformacion();

        Persona persona2 = new Persona();
        persona2.nombre = "Jose";
        persona2.apellido = "Perez";
        persona2.desplegarInformacion();

    }
}
