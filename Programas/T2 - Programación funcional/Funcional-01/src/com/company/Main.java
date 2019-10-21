package com.company;

import java.util.Scanner;

public class Main
{
    // Escribe una función que te diga si un número es par o no. La función se llamará “Par” y
    //nos devolverá un valor booleano que será “verdadero” si el número es par y “falso” si
    //es impar.

    public static boolean Par(int n)
    {
        boolean pares;

        if (n % 2 == 0)
        {
            pares = true;
        }
        else
        {
            pares = false;
        }

        return pares;
    }

    public static void main(String[] args)
    {
        int n;
        boolean numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un número");
        n = sc.nextInt();

        if (numero = Par(n))
        {
            System.out.println("El número es par");
        }
        else
        {
            System.out.println("el numero es impar");
        }
    }
}
