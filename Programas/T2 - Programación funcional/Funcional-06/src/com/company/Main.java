package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe una función “max” que nos devuelva el mayor de los dos números que le
    //pasemos por parámetro

    public static int max (int a, int b)
    {
        if (a < b)
        {
            return b;
        }
        else
        {
            return a;
        }
    }
    public static void main(String[] args)
    {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos número para saber cual es el mayor");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        max(num1,num2);

        if (max(num1, num2) == num2)
        {
            System.out.println("El número mayor es " + num2);
        }
        else
        {
            System.out.println("El número mayor es " + num1);
        }
    }
}
