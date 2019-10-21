package com.company;

import java.util.Scanner;

public class Main
{

    //Calcular las dos soluciones de una ecuación de segundo grado, del tipo ax2 + bx + c = 0.
    //Los coeficientes a, b y c deberá introducirlos el usuario a través del teclado.


    public static void main(String[] args)
    {
        int a, b, c;
        double sol1, sol2, sol3, d1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los coeficientes de la ecuación (a/b/c)");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        d1 = (b*b)-(4*a*c);

        if (d1 < 0)
        {
            System.out.println("La ecuacion no tiene solución");
        }
        else
        {
            if (d1 == 0)
            {
                sol3 = ((-b)/(2*a));
                System.out.println("La ecuación solo tiene una solcuión: x = " + sol3);
            }
            else
            {
                sol1 = ((-b)+(Math.sqrt((b*b)-(4*a*c))))/(2*a);
                sol2 = ((-b)-(Math.sqrt((b*b)-(4*a*c))))/(2*a);
                System.out.println("Las solciones son x = "+ sol1 + " y x = "+ sol2);
            }
        }

    }
}
