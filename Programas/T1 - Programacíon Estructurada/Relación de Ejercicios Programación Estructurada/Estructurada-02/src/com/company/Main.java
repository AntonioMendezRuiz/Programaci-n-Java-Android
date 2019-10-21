package com.company;

import java.util.Scanner;

public class Main {

    //Determinar si un año es bisiesto o no (los años bisiestos son múltiplos de 4; utilícese el
    //operador módulo).

    public static void main(String[] args)
    {
        int anno;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un año");
        anno = sc.nextInt();

        if ((anno % 4 == 0) || (anno % 400 == 0) && (anno % 100 != 0))
        {
            System.out.println("El año es bisiesto");
        }
        else
        {
            System.out.println("El año no es bisiesto");
        }
    }
}
