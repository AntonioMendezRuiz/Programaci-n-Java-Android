package com.company;

import java.util.Scanner;

public class Main
{
    //Calcular el factorial de un número entero N. Recuerda que el factorial de un número es
    //el producto de ese número por todos los enteros menores que él. Por ejemplo, el
    //factorial de 5 (simbolizado 5!) se calcula como: 5! = 5 x 4 x 3 x 2 x 1.

    public static void main(String[] args)
    {
	    int i, n;
	    long fact = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número para hacer el factorial");
        n = sc.nextInt();

        for (i = 1 ; i <= n; i++)
        {
            fact = fact * i;
        }
        System.out.println("El factorial es " + fact);
    }
}
