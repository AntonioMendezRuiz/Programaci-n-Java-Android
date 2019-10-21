package com.company;

import java.util.Scanner;

public class Main
{
    //Escribir todos los números impares entre dos números A y B introducidos por teclado.
    //Antes habrá que comprobar cuál de los dos números A y B es mayor.

    public static void main(String[] args)
    {
        int A, B;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos número A y B para ver cuantos impares hay entre ellos");
        A = sc.nextInt();
        B = sc.nextInt();

        if (A < B)
        {
            while (A <= B)
            {
                if (A % 2 != 0)
                {
                    System.out.print(A);
                    System.out.print(" ");
                }
                A++;
            }
        }
        else
        {
            while (B <= A)
            {
                if (B % 2 != 0)
                {
                    System.out.print(B);
                    System.out.print(" ");
                }
                B++;
            }
        }
	}

}
