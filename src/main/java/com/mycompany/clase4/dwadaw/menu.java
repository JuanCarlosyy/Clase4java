package com.mycompany.clase4.dwadaw;

import java.util.Date;
import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion, numero, tabla, i;
        Date fecha = new Date();
        String seguir = "s";
        seguir = "s";
        while (seguir.equals("s") || seguir.equals("s")) {
            do {
                System.out.println(fecha.toString() );
                System.out.println("Menu");
                System.out.println("1) Contador del 1 al 50");
                System.out.println("2) Numeros par o impar");
                System.out.println("3) Tablas de multiplicar");
                System.out.println("4) SALIR");
                System.out.println("Ingrese un numero: [1-2-3-4]");
                opcion = entrada.nextInt();
                switch (opcion) {

                    case 1:
                        for (i = 0; i < 51; i++) {
                            System.out.println("Los numero son: " + i);
                        }
                        break;
                    case 2:
                        numero = entrada.nextInt();
                        if (numero % 2 == 0) {
                            System.out.println(+numero + "Es un numero par");

                        } else {
                            System.out.println(+numero + "El numero es impar");
                        }
                        break;
                    case 3:
                        System.out.println("Digite la tabla que desee");
                        tabla = entrada.nextInt();

                        for (i = 0; i <= 10; i++) {
                            System.out.println(+tabla + "X" + i + "=" + tabla * i);
                        }
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Ingrese un numero valido");
                }

            } while (opcion != 4);
            System.out.println("¿Desea continuar? s/n");
            seguir = entrada.next();

        }

    }

}
