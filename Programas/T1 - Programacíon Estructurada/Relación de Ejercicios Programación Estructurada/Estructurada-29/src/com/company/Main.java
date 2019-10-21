package com.company;

import java.util.Scanner;

public class Main
{
    //Escribir todos los números impares entre dos números A y B introducidos por teclado.
    //Antes habrá que comprobar cuál de los dos números A y B es mayor.
    public static void main(String[] args)
    {
        int i, a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el primer número");
        a = sc.nextInt();
        System.out.println("Dime el segundo número");
        b = sc. nextInt();

        if (a < b)
        {
            for (i = a; i <= b; i++)
            {
                if (i % 2 != 0)
                {
                    System.out.println(i);
                }
            }
        }
        else
        {
            for(i = b; i <= a; i++)
            {
                if (i % 2 != 0)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
