package com.company;

import java.util.Scanner;

public class Main
{

    // Escribe un programa que te pida dos números con la condición de que el segundo sea
    //mayor que el primero, en caso contrario te pregunta de nuevo el número hasta que sea
    //correcto. Si los números son correctos, escribe todos los números comprendidos entre
    //el primer y el segundo número (ambos inclusive).

    public static void main(String[] args)
    {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe dos números con la condición de que el segundo sea mayor que el primero y te digo los número que hay entre ellos");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        while (num2 < num1)
        {
            System.out.println("El segundo número es igual o menor que el primero. Prueba de nuevo");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        }

        while (num1 <= num2)
        {
            System.out.print(num1);
            System.out.print(" ");
            num1++;
        }
	}
}
