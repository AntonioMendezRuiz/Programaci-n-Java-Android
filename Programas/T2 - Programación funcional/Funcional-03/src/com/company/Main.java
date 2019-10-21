package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe una función “tablaMultiplicar” a la que le pases un entero y nos escriba la tabla
    //de multiplicar de ese número.

    public static void tabla (int a)
    {
        int i, resultado;

        for (i = 1; i <=10; i++)
        {
            resultado = a * i;
            System.out.println(a + " X " + i + " = " +resultado);
        }

    }
    public static void main(String[] args)
    {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número para hacer la tabla de multiplicar");
        numero = sc.nextInt();

        tabla(numero);
    }
}
