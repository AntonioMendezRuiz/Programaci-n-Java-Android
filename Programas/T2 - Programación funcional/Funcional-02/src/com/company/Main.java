package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe una función que nos diga si un año es bisiesto o no. La función se llamará
    //“bisiesto” y nos devolverá “verdadero” si es bisiesto y “falso” si no lo es

    public static void bisiesto(int a)
    {
        if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0)))
        {
            System.out.println("El año es bisiesto");
        }
        else
        {
            System.out.println("El año no es bisiesto");
        }
    }
    public static void main(String[] args)
    {
        int anno;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un año y te digo si es bisiesto");
        anno = sc.nextInt();

        bisiesto(anno);
    }
}
