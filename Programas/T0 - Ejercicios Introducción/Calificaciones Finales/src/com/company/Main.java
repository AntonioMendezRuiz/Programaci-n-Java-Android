package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double nota;
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que nota has sacado?");
        nota = sc.nextDouble();

        if ((nota < 5) && (nota >= 0))
        {
            System.out.println("Tienes un insuficiente ");
        }
        else
        {
            if ((nota >=5) && (nota <7))
            {
                System.out.println("Tienes un suficiente");
            }
            else
            {
                if ((nota >=7) && (nota <9))
                {
                    System.out.println("Tienes un notable");
                }
                else
                {
                    if ((nota >= 9) && (nota <= 10))
                    {
                        System.out.println("Tienes un sobresaliente");
                    }
                    else
                        System.out.println("La nota debe estar entre 0 y 10");

                }

            }
        }
    }
}
