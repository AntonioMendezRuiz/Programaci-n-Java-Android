package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe un programa que te pregunte si quieres números pares o impares. Si te dice
    //pares, escribe los números pares del 1 al 10 y si te dice impares, escribe los números
    //impares del 1 al 10.
    public static void main(String[] args)
    {
        int i;
        String num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime si quieres número pares o impares");
        num = sc.next();

        if (num.equals("pares"))
        {
            for(i = 2; i <= 10; i = i + 2)
            {
                System.out.println(i);
            }
        }
        else
        {
            for (i = 0; i < 10; i++)
            {
                if (i % 2 != 0)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
