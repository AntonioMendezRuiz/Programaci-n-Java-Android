package com.company;

import java.util.Scanner;

public class Main
{
    // Escribe un programa que le pide al usuario la nota de un alumno (un número real). El
    //programa escribirá “Suspenso” si la nota está entre 0 y 5; “Suficiente” si la nota está
    //entre 5 y 6; “Bien” si la nota está entre 6 y 7; “Notable” si la nota está entre 7 y 9 y
    //“Sobresaliente” si está entre 9 y 10. Si la nota no es válida, el programa nos vuelve a
    //pedir un valor hasta que introduzcamos una correcta.

    public static void main(String[] args)
    {
	    double nota;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una nota");
        nota = sc.nextDouble();

        while ((nota < 0) || (nota > 10))
        {
            System.out.println("La nota no es correcta, introducela de nuevo.");
            nota = sc.nextDouble();
        }

        if (nota < 5)
        {
            System.out.println("Suspenso");
        }
        else
        {
            if (nota <= 6)
            {
                System.out.println("Suficiente");
            }
            else
            {
                if (nota <= 9)
                {
                    System.out.println("Notable");
                }
                else
                {
                    System.out.println("Sobresaliente");
                }
            }
        }
    }
}
