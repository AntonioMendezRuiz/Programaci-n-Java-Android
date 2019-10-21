package com.company;

import java.util.Scanner;

public class Main
{
    //Calcular el valor máximo de una serie de 10 números introducidos por teclado.

    public static void main(String[] args)
    {
	    int i, max, num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        num = sc.nextInt();
        max = num;

        for (i = 1; i < 10; i++)
        {
            System.out.println("Introduce otro número");
            num = sc.nextInt();

            if (num > max)
            {
                max = num;
            }
        }
        System.out.println("El número con el valor mas alto es " + max);
    }
}
