package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe una función “imprimeSerie” a la que le pases dos enteros y te escriba por la
    //pantalla todos los valores comprendidos entre ambos. Lo hará en orden ascendente si
    //el primero es menor que el segundo y descendente en caso contrario. Usa “for”.

    public static void imprimeSerie (int a, int b)
    {
        int i;

        if (a < b)
        {
            for (i = a; i <=b; i++)
            {
                System.out.print(i + " ");
            }
        }
        else
        {
            for (i = a; i >= b; i--)
            {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args)
    {
	    int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos números para ver la serie");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        imprimeSerie(num1,num2);
    }
}
