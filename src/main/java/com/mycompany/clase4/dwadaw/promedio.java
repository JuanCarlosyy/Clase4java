
package com.mycompany.clase4.dwadaw;

import java.text.DecimalFormat;
import java.util.Scanner;

public class promedio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        int i, maximo = 0, minimo = 101;
        float promedio = 0;
        String nommaximo = "", nomminimo = "";
        String nombre[] = new String[3];
        double notas[] = new double[3];
        for (i=0;i<3;i++){
            System.out.println("Digite los nombres del alumno");
            nombre[i]=entrada.next();
            System.out.println("Ingrese las notas");
            notas[i]=entrada.nextDouble();
            promedio=((float)(promedio+notas[i]/3));
            if(notas [i]> maximo) {
                maximo=(int)notas[i];
                nommaximo=nombre[i];
            
        }
            if (notas[i]< minimo){
                minimo= (int) notas[i];
                nomminimo=nombre [i];
            }
            
        }

        for (i=0;i<3;i++){
            System.out.println(i+1+ ")" +nombre[i]+"="+notas[i]);
        }
   
        System.out.println(" El promedio de las notas es: "+df.format(promedio));
        System.out.println(nommaximo+ " Tiene la nota mayor con : "+maximo);
        System.out.println(nomminimo+ " Tiene la nota menor con : "+minimo);}

     
    }
    

