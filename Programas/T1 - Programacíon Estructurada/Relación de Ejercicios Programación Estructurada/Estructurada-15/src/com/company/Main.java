package com.company;

import java.util.Scanner;

public class Main
{
    //. Escribe un programa que te pide dos números. Si el primero es menor que el segundo,
    //escribe todos los números comprendidos entre ambos en orden ascendente. Si el
    //primero es mayor que el segundo, escribe todos los números comprendidos entre
    //ambos en orden descendente

    public static void main(String[] args)
    {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una pareja de números");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 < num2)
        {
            while (num1 <= num2)
            {
                System.out.println(num1);
                num1++;
            }
        }
        else
        {
            while (num1 >= num2)
            {
                System.out.println(num1);
                num1= num1 - 1;
            }
        }
    }
}
