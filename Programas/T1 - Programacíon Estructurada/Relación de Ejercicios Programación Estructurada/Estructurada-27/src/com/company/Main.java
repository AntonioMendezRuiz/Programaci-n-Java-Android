package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe un programa que te escribe la tabla de multiplicar del número que le introduzcas
    //por teclado.

    public static void main(String[] args)
    {
	    int i, j, tabla;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un el número del que quieres ver su tabla de multiplicar");
        j = sc. nextInt();

        for (i = 0; i <= 10; i++)
        {
            tabla = i*j;
            System.out.println(j + " X " + i + " = " + tabla);
        }
    }
}
