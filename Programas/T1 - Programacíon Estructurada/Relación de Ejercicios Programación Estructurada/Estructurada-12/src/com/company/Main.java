package com.company;

import java.util.Scanner;

public class Main {

    //Escribe un programa que te pregunte si quieres números pares o impares. Si te dice
    //pares, escribe los números pares del 1 al 10 y si te dice impares, escribe los números
    //impares del 1 al 10.

    public static void main(String[] args)
    {
	    int i = 1, j = 1, q = 0;
	    String numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Números impares o pares?");
        numero = sc.next();

        if(numero.equals("impares"))
        {
            while (i <= 10)
            {
                System.out.println(j);
                j = j + 2;
                i = i + 2;
            }
        }
        else
        {
            while (i <= 10)
            {
                q = q + 2;
                System.out.println(q);
                i = i + 2;
            }
        }
    }
}
