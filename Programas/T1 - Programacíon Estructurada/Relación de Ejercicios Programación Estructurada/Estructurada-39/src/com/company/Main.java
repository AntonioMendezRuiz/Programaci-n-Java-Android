package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe un programa que calcule el mínimo común múltiplo de 2 números.

    public static void main(String[] args)
    {
        long i, a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos números para hacerles el mínimo común múltiplo");
        a = sc.nextInt();
        b = sc.nextInt();

        for(i = Math.max(a,b); i<=a; i++)
        {
            if (i % a == 0 && i % b == 0)
            {
                System.out.println(i);
                i = a * b;
            }
        }


        System.out.println("El mínimo común múltiplo es " + i);

    }
}
