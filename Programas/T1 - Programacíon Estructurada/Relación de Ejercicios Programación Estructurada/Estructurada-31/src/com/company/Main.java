package com.company;

import java.util.Scanner;

public class Main
{
    //El usuario de este programa será un profesor, que introducirá las notas de sus 30
    //alumnos de una en una. El algoritmo debe decirle cuántos suspensos y cuántos
    //aprobados hay.

    public static void main(String[] args)
    {
        int i, notas, aprobado = 0, suspenso = 0;
        Scanner sc = new Scanner(System.in);


        for(i = 0; i < 10; i++)
        {
            System.out.println("Introduce una nota");
            notas = sc.nextInt();

            if (notas >= 5)
            {
                aprobado = aprobado + 1;
            }
            else
            {
                suspenso = suspenso + 1;
            }

        }
        System.out.println("El número de aprobados es " + aprobado + " y el de suspensos " + suspenso);
    }
}
