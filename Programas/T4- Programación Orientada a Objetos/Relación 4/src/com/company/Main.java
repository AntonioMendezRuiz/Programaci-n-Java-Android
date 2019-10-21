package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int numerador = 3, denominador = 2;
        int numerador2 = 6, denominador2 = 4;
        Fraccion a = new Fraccion(numerador, denominador);
        Fraccion b = new Fraccion(numerador2, denominador2);

        if(a.equals(b))
        {
            System.out.println("Si");
        }
        else
        {
            System.out.println("No");
        }

    }
}
