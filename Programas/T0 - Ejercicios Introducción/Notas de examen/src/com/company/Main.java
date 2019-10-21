package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double nota;

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que nota has sacado?");

        nota = sc.nextDouble();

        if ((nota < 0 ) || (nota > 10))
        {
            System.out.println("Nota no válida");
        }
        else
        {
            if (nota < 5)
            {
                System.out.println("Has suspendido el Examen");
            }
            else
                System.out.println("Has aprobado el Examen");
        }
    }
}
