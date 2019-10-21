package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe una función “factorial” que nos calcule el factorial de un número entero

    public static int factorial (int a)
    {
        int i = 1 , fact = 1;

        while (i <= a)
        {
            fact = fact * i;
            i++;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número para sacar su factorial");
        num = sc.nextInt();

        System.out.println("El resultado es " + factorial(num));
    }
}
