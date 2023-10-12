package main;

import Operations.Aritmetica;
import clases.Persona;

public class Main {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.numero1 = 3;
        aritmetica1.numero2 = 2;
        aritmetica1.suma2Numeros();

        Aritmetica aritmetica2 = new Aritmetica();
        int resultadoSuma;
        aritmetica2.numero1 = 6;
        aritmetica2.numero2 = 4;
        resultadoSuma = aritmetica2.suma2NumeroRetorno();
        System.out.println("resultadoSuma = " + resultadoSuma);

        Aritmetica aritmetica3 = new Aritmetica();
        int resultadoSumaArgs;
        resultadoSumaArgs = aritmetica3.suma2NumArgsRetorno(15,6);
        System.out.println("resultadoSumaArgs = " + resultadoSumaArgs);

        Aritmetica aritmetica4 = new Aritmetica(87,13);
        aritmetica4.suma2Numeros();

        /* 1 */
        /*Persona persona1 = new Persona();
        persona1.nombre = "Chrys";
        persona1.apellido = "Morales";
        persona1.desplegarInformacion();

        Persona persona2 = new Persona();
        persona2.nombre = "Jose";
        persona2.apellido = "Perez";
        persona2.desplegarInformacion();*/

    }
}
