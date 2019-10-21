package com.company;

import java.util.Scanner;

public class Main
{
    // Escribe una función “primo” que nos devuelva “verdadero” si el número que le
    //pasamos por parámetro es primo y “falso” en caso contrario.

    public static boolean primo(int a)
    {
        int i, cont = 0;
        boolean primo;

        for(i = 1; i <= a; i++)
        {
            if (a % i == 0)
            {
                cont++;
            }
        }
        if (cont == 2)
        {
            primo = true;
        }
        else
        {
            primo = false;
        }
        return primo;
    }
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un número para saber si es primo");
        num = sc.nextInt();

        if(primo(num))
        {
        System.out.println("El número es primo");
        }
        else
        {
            System.out.println("El número no es primo");
        }
    }
}
