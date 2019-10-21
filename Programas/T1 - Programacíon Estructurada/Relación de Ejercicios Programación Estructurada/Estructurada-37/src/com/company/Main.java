package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe un programa que nos presente un menú con 3 opciones. Eligiendo la opción “a”
    //nos escribirá todos los múltiplos de 11 comprendidos entre 1 y 100. Eligiendo la opción
    //“b” lo mismo, pero con los múltiplos de 17. Eligiendo la opción “c” lo mismo, pero con
    //los múltiplos de 23.

    public static void main(String[] args)
    {
        int i;
        String opcion2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Elige una opción:");
        System.out.println("a. Múltiplos de 11 comprendidos entre 1 y 100.");
        System.out.println("b. Múltiplos de 17 comprendidos entre 1 y 100.");
        System.out.println("b. Múltiplos de 23 comprendidos entre 1 y 100.");
        opcion2 = sc.next();

        switch (opcion2)
        {
            case "a":
                for (i = 1; i <= 100; i++)
                {
                    if (i % 11 == 0)
                    {
                        System.out.println(i);
                    }
                }
                break;

            case "b":
                for (i = 1; i <= 100; i++)
                {
                    if (i % 17 == 0)
                    {
                        System.out.println(i);
                    }
                }
                break;

            case "c":
                for (i = 1; i <= 100; i++)
                {
                    if (i % 23 == 0)
                    {
                        System.out.println(i);
                    }
                }
                break;

            default:
                System.out.println("Opcion no valida");
        }
    }
}
