package com.company;

import java.util.Scanner;

public class Main {

    //. Dados tres números enteros, A, B, C, determinar cuál es el mayor, cuál el menor y cuál
    //el mediano.

    public static void main(String[] args)
    {
        int A, B, C;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 3 números");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        if ((A >= B) && (A >= C) && (B >= C))
        {
            System.out.println("El número " + A + " es el mayor, el "+ B +" el mediano y "+ C + " el menor");
        }
        else if ((A >= B) && (A >= C) && (C >= B))
        {
            System.out.println("El número " + A + " es el mayor, el "+ C +" el mediano y "+ B + " el menor");
        }
        else if ((B >= A) && (B >= C) && (A >= C))
        {
            System.out.println("El número " + B + " es el mayor, el "+ A +" el mediano y "+ C + " el menor");
        }
        else if ((B >= A) && (B >= C) && (C >= A))
        {
            System.out.println("El número " + B + " es el mayor, el "+ C +" el mediano y "+ A + " el menor");
        }
        else if ((C >= A) && (C >= B) && (A >= B))
        {
            System.out.println("El número " + C + " es el mayor, el "+ A +" el mediano y "+ B + " el menor");
        }
        else if ((C >= A) && (C >= B) && (B >= A))
        {
            System.out.println("El número " + C + " es el mayor, el "+ B +" el mediano y "+ A + " el menor");
        }
    }
}
