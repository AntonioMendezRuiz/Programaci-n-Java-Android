package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe una función “leeNatural” que nos lea un número natural desde el teclado. La
    //función nos pondrá un texto en el que se nos indica que introduzcamos un número y
    //después nos leerá el número del teclado. Si el número introducido es 0 o negativo, nos
    //volverá a pedir otro número.

    public static int leeNatural ()
    {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        n = sc.nextInt();

        while (n <= 0)
        {
            System.out.println("El número introducido no es correcto. Vuelve a introducirlo.");
            n = sc.nextInt();
        }
        return n;
    }
    public static void main(String[] args)
    {
        leeNatural();
    }
}
