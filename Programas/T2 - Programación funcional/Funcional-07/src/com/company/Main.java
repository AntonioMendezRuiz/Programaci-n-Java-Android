package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe una función “min” que nos devuelva el menor de los dos números que le
    //pasemos por parámetro.


    public static int min (int a, int b)
    {
        if (a < b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }

    public static void main(String[] args)
    {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos número para saber cual es el menor");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        min(num1, num2);

        if (min(num1, num2) == num2)
        {
            System.out.println("El número menor es " + num2);
        } else
        {
            System.out.println("El número menor es " + num1);
        }
    }
}
