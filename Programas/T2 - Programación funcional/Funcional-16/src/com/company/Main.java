package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe una función “elevado” a la que le pasas dos números enteros (a y b) y te
    //devuelve el valor de “a” elevado a “b” (sin usar la función Math.pow) (o sea,
    //multiplicando un número muchas veces).
    public static int elevado (int a, int b)
    {
        int i, potencia = 1;

        for (i = 1; i <= b; i++)
        {
            potencia = potencia * a;
        }
        return potencia;
    }
    public static void main(String[] args)
    {
        int base, exponente;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base");
        base = sc.nextInt();

        System.out.println("Introduce el exponente");
        exponente = sc.nextInt();

        while (exponente < 0)
        {
            System.out.println("No aceptamos exponentes negativos. Pon uno positivo ó 0");
            exponente = sc.nextInt();
        }
        if(exponente == 0)
        {
        System.out.println("El resultado es 1");
        }
        else
        {
            System.out.println("El resltuado es " + elevado(base, exponente));
        }

    }
}
