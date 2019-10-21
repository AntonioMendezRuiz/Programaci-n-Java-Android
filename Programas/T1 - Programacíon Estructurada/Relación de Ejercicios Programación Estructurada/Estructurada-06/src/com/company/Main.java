package com.company;

import java.util.Scanner;

public class Main {
    //Determinar el número de cifras de un número entero. El algoritmo debe funcionar para
    //números de hasta 5 cifras, considerando los negativos. Por ejemplo, si se introduce el
    //número 5342, la respuesta del programa debe ser 4. Si se introduce -250, la respuesta
    //debe ser 3

    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        num = sc.nextInt();

        if ((num > 99999) || (num < -99999))
        {
            System.out.println("El número debe ser menor de 5 cifras");
        }
        else
        {
            if ((num <= 10) && (num >= -10))
            {
                System.out.println("El numero tiene 1 cifras");
            }
            else
            {
                if ((num <= 100) && (num >= -100))
                {
                    System.out.println("El numero tiene 2 cifras");
                }
                else
                {
                    if ((num <= 1000) && (num >= -1000))
                    {
                        System.out.println("El numero tiene 3 cifras");
                    }
                    else
                    {
                        if ((num <= 10000) && (num >= -10000))
                        {
                            System.out.println("El numero tiene 4 cifras");
                        }
                        else
                        {
                            if ((num < 100000) && (num > -100000))
                            {
                                System.out.println("El numero tiene 5 cifras");
                            }
                        }
                    }
                }
            }

        }


    }
}
