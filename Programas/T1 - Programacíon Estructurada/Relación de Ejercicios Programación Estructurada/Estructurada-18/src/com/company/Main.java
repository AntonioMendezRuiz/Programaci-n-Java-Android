package com.company;

import java.util.Scanner;

public class Main
{
    //Calcular el valor medio de una serie de valores enteros positivos introducidos por
    //teclado. Para terminar de introducir valores, el usuario debe teclear un número
    //negativo.

    public static void main(String[] args)
    {

        int  nota, i = 0, suma = 0, media;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los números para hacer la media(Para acabar pon un número negativo)");
        //nota = sc.nextInt();
        nota = 0;
        while (nota >= 0)
        {

            nota = sc.nextInt();
            if (nota >= 0)
            {
                suma = nota + suma;
            }

            i = i + 1;

        }

        media = (suma / (i - 1));
        System.out.println("La media es " + media);
    }
}
