package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        double nota1, nota2, nota3, media;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota del primer trimestre");
        nota1 = sc.nextDouble();
        System.out.println("Nota del segundo trimestre");
        nota2 = sc.nextDouble();
        System.out.println("Nota del tercer trimestre");
        nota3 = sc.nextDouble();

        if (((nota1 >= 0) && (nota1 <= 10)) &&
                ((nota1 >= 0) && (nota1 <= 10)) &&
                ((nota1 >= 0) && (nota1 <= 10)))
        {
            media = (nota1 + nota2 + nota3) / 3;

            if (media >= 5)
            {
                System.out.println("Has aprobado la asignatura con un " + media);
            } else
                System.out.println("Has suspendido la asignatura con un " + media);

        }
    }
}
