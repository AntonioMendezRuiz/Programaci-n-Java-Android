package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe una función “signo” a la que le pasemos un número y nos devuelva “1” si es
    //positivo, “0” si es cero y “-1” si es negativo.

    public static int signo (int a)
    {
        if (a == 0)
        {
            return 0;
        }
        else
        {
            if (a > 0)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
    }
    public static void main(String[] args)
    {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número para saber si es positivo, negativo o 0.");
        numero = sc.nextInt();

        signo(numero);

        if (signo(numero) == 1)
        {
            System.out.println("El número es positivo");
        }
        else
        {
            if (signo(numero) == -1)
            {
                System.out.println("El número es negativo");
            }
            else
            {
                System.out.println("El número es 0");
            }
        }

    }
}
