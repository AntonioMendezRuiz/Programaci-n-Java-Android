package com.company;

import java.util.Scanner;

public class Main
{
    //Calcular el factorial de un número entero N. Recuerda que el factorial de un número es
    //el producto de ese número por todos los enteros menores que él. Por ejemplo, el
    //factorial de 5 (simbolizado 5!) se calcula como: 5! = 5 x 4 x 3 x 2 x 1.

    public static void main(String[] args)
    {
        long num, i = 1, fact;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el número para hacer el factorial: ");
        num = sc.nextInt();
        fact = 1;

        while (i <= num)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("El factorial es "+ fact);
    }
}
