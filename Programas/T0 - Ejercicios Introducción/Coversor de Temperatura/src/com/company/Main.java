package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int opcion;
        double C, F;
        Scanner sc = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("----");
        System.out.println("1 - Convertir de ºC a ºF");
        System.out.println("2 - Convertir de ºF a ºC");

        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
                System.out.println("Escribe los grados centigrados");
                C = sc.nextDouble();
                F = 1.8 * C + 32;
                F = Math.round(F*100)/100.0;//funcion que sirve para redondear
                System.out.println("Son " + F + " Grados Fahrenheit");
                break;

            case 2:
                System.out.println("Escribe los grados Fahrenheit");
                F = sc.nextDouble();
                C = (F - 32) / 1.8;
                C = Math.round(C*100)/100.0;
                System.out.println("Son " + C + " Grados centigrados");
                break;

                default:
                    System.out.println("Opción no válida");
                    break;
        }
    }
}
