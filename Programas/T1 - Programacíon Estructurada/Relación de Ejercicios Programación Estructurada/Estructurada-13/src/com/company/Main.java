package com.company;

import java.util.Scanner;

public class Main {

    //Escribe un programa que te escribe la tabla de multiplicar del número que le introduzcas
    //por teclado.

    public static void main(String[] args)
    {
	    int numero, cont = 1, resultado;
        Scanner sc = new Scanner(System.in);

        System.out.println("¿De qué número quieres la tabla de multiplicar?");
        numero = sc.nextInt();

        if (numero < 0)
        {
            System.out.println("No se puede hacer la tabla de un numero negativo");
        }
        else
        {
            while (cont <= 10)
            {
                resultado = numero * cont;

                System.out.print(resultado);
                System.out.print(" ");

                cont++;
            }
        }
    }
}
