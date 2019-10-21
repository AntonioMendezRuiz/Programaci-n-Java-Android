package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe un programa que te pide dos números. Si el primero es menor que el segundo,
    //escribe todos los números comprendidos entre ambos en orden ascendente. Si el
    //primero es mayor que el segundo, escribe todos los números comprendidos entre
    //ambos en orden descendente.

    public static void main(String[] args)
    {
	    int i, j, q;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el primer número");
        j = sc.nextInt();
        System.out.println("Dime el segundo número");
        q = sc. nextInt();

        if (j < q)
        {
            for(i = j; i <=q; i++)
            {
                System.out.println(i);
            }
        }
        else
        {
            for (i = j; i >= q; i = i - 1)
            {
                System.out.println(i);
            }
        }

    }
}
