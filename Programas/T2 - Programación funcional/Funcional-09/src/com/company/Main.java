package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe una función que nos calcule el “mcm” de dos números

    public static int mcm (int a, int b)
    {
        int i;
        for(i = Math.max(a,b); i <= a; i++)
        {
            if (i % a == 0 && i % b == 0)
            {
                i = a * b;
            }
        }
        return i;
    }

    public static void main(String[] args)
    {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos números para hacerles el mínimo común múltiplo");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(mcm(a, b));

    }
}
