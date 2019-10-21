package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe un programa que nos diga si un número es primo o no.

    public static void main(String[] args)
    {
        int num, i, cont = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número para saber si es primo");
        num = sc.nextInt();

        for(i = 1; i <= num; i++)
        {
            if (num % i == 0)
            {
                cont++;
            }
        }
        if (cont == 2)
        {
            System.out.println("El número es primo");
        }
        else
        {
            System.out.println("El número no es primo");
        }
    }
}
