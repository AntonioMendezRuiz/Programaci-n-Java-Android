package com.company;

import java.util.Scanner;

public class Main
{
    //Calcular en el mismo bucle el valor máximo, el valor mínimo y la media aritmética de
    //una serie de 10 números introducidos por teclado.

    public static void main(String[] args)
    {
		int num, max, min, i = 2;
		double suma, media;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número 1: ");
        num = sc.nextInt();
        max = num;
        min = num;
        suma = num;

        while (i <= 5)
        {
            System.out.println("Introduce el número " + i + ": ");
            num = sc.nextInt();
            suma = suma + num;

            if (num > max)
            {
                max = num;
            }
            if (num < min)
            {
                min = num;
            }
            i++;
        }

        media = suma/i;

        System.out.println("El número maximo es "+ max + " el mínimo es "+ min + " y la media es " + media);
    }
}
