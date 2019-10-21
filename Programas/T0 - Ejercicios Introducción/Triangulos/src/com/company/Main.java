package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        double angulo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el angulo mas grande del triangulo");
        angulo = sc.nextDouble();

        if (angulo >= 60 && angulo < 180)
        {
            if (angulo == 90)
            {
                System.out.println("Es un triangulo es rectangulo");
            } else
            {
                if (angulo > 90)
                {
                    System.out.println("Es un triangulo obtusangulo");
                } else
                    System.out.println("Es un triagulo acutangulo");
            }
        }
        else
            System.out.println("Eso no es un triangulo");
    }
}
