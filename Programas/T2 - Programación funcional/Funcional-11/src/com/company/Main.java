package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe una función “areaTriangulo” que te calcule el área de un triángulo. Habrá que
    //pasarle como parámetros la base y la altura.
    public static double areaTriangulo (double a, double b)
    {
        double area;

        area = (a * b) / 2;

        return area;
    }
    public static void main(String[] args)
    {
        double base, altura;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base del triángulo");
        base = sc.nextDouble();
        System.out.println("Introduce la altura del triángulo");
        altura = sc.nextDouble();

        System.out.println("El area del triángulo es " + areaTriangulo(base, altura));
    }
}
