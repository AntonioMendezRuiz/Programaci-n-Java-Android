package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe una función “leeNúmero” a la que le pasas dos parámetros (a y b) y nos lee del
    //teclado un número comprendido entre a y b (ambos incluidos). Si el número no es
    //correcto, te vuelve a pedir que lo introduzcas.

    public static int leeNumero (int a, int b)
    {
        int m;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número que esté entre los números que has escrito.");
        m = sc.nextInt();

        while ((m > Math.max(a, b) || m < Math.min(a,b)))
        {
            System.out.println("El número no es correcto. Introducelo de nuevo");
            m = sc.nextInt();
        }
        System.out.println("Muy bien");
        return m;
    }
    public static void main(String[] args)
    {
        int x, y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos números");
        x = sc.nextInt();
        y = sc.nextInt();

        leeNumero(x, y);

    }
}
