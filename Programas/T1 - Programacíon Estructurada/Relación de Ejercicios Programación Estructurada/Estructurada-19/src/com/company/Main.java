package com.company;

import java.util.Scanner;

public class Main
{
    //El usuario de este programa será un profesor, que introducirá las notas de sus 30
    //alumnos de una en una. El algoritmo debe decirle cuántos suspensos y cuántos
    //aprobados hay.

    public static void main(String[] args)
    {
        int nota, susp = 0, apro = 0, i = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los 10 notas de los alumnos.");


        while(i < 10)
        {
            nota = sc.nextInt();

            while ((nota < 0) || (nota >= 10))
            {
                System.out.println("La nota no es válida, introducela de nuevo");
                nota = sc.nextInt();
            }

            if (nota < 5)
            {
                    susp++;
            }
            else
                {
                    apro++;
                }

            i++;
        }
        System.out.println("El número de aprobados es " + apro + " y de suspensos "+ susp);
    }
}
