package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        // SWITCH = una sentencia condicional múltiple
        int opcion;
        Scanner sc = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("-----");
        System.out.println();
        System.out.println("1 - Saludo");
        System.out.println("2 - Insulto");
        System.out.println("3 - Hundir en la miseria");
        System.out.println("4 - Despedida");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Elija una opcion");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
                System.out.println("Hola");
                break;

            case 2:
                System.out.println("Mongolin");
                break;

            case 3:
                System.out.println("Te reviento payaso");
                break;

            case 4:
                System.out.println("Nos vemo pRhEeMoH");
                break;

            default:
                System.out.println("Opcion no valida");
        }
    }
}
