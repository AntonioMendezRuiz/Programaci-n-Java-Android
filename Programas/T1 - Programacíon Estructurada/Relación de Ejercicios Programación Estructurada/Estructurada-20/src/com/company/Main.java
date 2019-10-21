package com.company;

import java.util.Scanner;

public class Main
{
    //Calcular el valor máximo de una serie de 10 números introducidos por teclado.

    public static void main(String[] args)
    {
        int num, i = 1, max;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 5 número y te diré el valor máximo");
        max = sc.nextInt();

        while (i < 5)
        {
            num = sc.nextInt();
            if (num > max)
            {
                max = num;
            }
            i++;
        }
        System.out.println("El valor máximo es " + max);
	}
}
