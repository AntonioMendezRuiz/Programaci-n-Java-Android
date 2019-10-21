package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe una función “notaEnTexto” a la que le pasamos la nota de un alumno como un
    //double y nos devolverá la calificación en formato texto (“aprobado”, “suficiente”, etc.)

    public static String notaEnTexto (int a)
    {
        String nota = "suspenso", nota1 = "Suficiente", nota2 = "Notable", nota3 = "Sobresaliente", nonota = "Nota no válida";

        if ((a < 0)||(a > 10))
        {
                return nonota;
        }
        else
        {
            if (a < 5)
            {
                return nota;
            }
            else
            {
                if (a < 7)
                {
                    return nota1;
                }
                else
                {
                    if (a < 9)
                    {
                        return nota2;
                    }
                    else
                    {
                        return nota3;
                    }
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int nota;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escrible una nota");
        nota = sc.nextInt();

        System.out.println(notaEnTexto(nota));
    }
}
