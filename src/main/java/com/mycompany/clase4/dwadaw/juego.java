package com.mycompany.clase4.dwadaw;

import java.util.Scanner;

public class juego {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero = Math.random() * 10;
        int num = (int) numero;

        int i = 0;
        System.out.println("Bienvenido al juego ingrese un numero");
        int valor;
        do {
            System.out.println(" Introduzca un valor ");
            valor = entrada.nextInt();
            if (valor > num) {

                System.out.println("No es correcto ,te has pasado");
            }
            if (valor < num) {
                System.out.println("No es correcto, te has quedado corto");
            }

            i++;

        } while (valor != num);
        System.out.println("Excelente correcto el numero es " + num);
        System.out.println("Has necesitado " + i + "intentos");

    }

}
