package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        int edad;
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que edad tienes?");
        edad = sc.nextInt();

        if ((edad >= 0) && (edad <= 120))
        {
            if ((edad > 0) && (edad < 18))
            {
                System.out.println("Eres menor de edad");
            }
            else
            {
                if ((edad >= 18) && (edad < 30))
                {
                    System.out.println("Eres joven");
                }
                else
                {
                    if ((edad >= 30) && (edad < 60))
                    {
                        System.out.println("Eres adulto");
                    }
                    else
                    {
                        System.out.println("Eres viejo");
                    }
                }
            }
        }
        else
        {
            System.out.println("La edad debe estar entre 0 y 120");
        }
    }
}



