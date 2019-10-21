package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe un programa que calcule el máximo común divisor de 2 números.

    public static void main(String[] args)
    {
        int a, b, i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe dos números");
        a = sc.nextInt();
        b = sc.nextInt();

        for (i = a; i >= 1; i--)
        {
            if (a % i == 0 && b % i == 0)
            {
                System.out.println(i);
                i = 0;
            }
        }
    }
}

