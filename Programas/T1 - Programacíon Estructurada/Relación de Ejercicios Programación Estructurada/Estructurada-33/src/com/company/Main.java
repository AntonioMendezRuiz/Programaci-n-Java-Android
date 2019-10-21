package com.company;

import java.util.Scanner;

public class Main
{
    //Calcular en el mismo bucle el valor máximo, el valor mínimo y la media aritmética de
    //una serie de 10 números introducidos por teclado.

    public static void main(String[] args)
    {
	    int i, max, min, media, num, suma ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        num = sc.nextInt();

        max = num;
        min = num;
        suma = num;

        for ( i = 1; i < 10; i++)
        {
            System.out.println("Introduce otro número");
            num = sc.nextInt();

            if (num > max)
            {
                max = num;
            }
            if (num < min)
            {
                min = num;
            }
            suma = suma + num;
        }
        media = suma/i;

        System.out.println("El número mas alto es " + max + " el mas bajo es " + min + " y la media es " +media);
    }
}
