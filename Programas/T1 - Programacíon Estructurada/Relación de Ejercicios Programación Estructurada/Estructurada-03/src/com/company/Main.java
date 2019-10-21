package com.company;

import java.util.Scanner;

public class Main {
    //Leer un número real y un tipo de moneda, que puede ser "euro" o "peseta". Convertir
    //la cantidad al tipo de moneda indicado, suponiendo que está expresada en la otra. Por
    //ejemplo, si la cantidad es 15 y la moneda es "peseta", se supondrá que se trata de 15 €
    //y que hay que convertirlos a pesetas y, por lo tanto, el resultado debe ser 2495.

    public static void main(String[] args)
    {
        double num, conversion;
        String moneda;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una cantidad de dinero");
        num = sc.nextDouble();


        if (num < 0)
        {
            System.out.println("La cantidad no puede ser negativa");
        }
        else
        {
            System.out.println("¿En que moneda lo quieres?");
            moneda = sc.next();

            if (moneda.equals("pesetas"))
            {
                conversion = num * 166.386;
                System.out.println("Los " + num + " Euros son " + conversion);

            }else
            {
                if (moneda.equals("euros"))
                {
                    conversion = num / 166.386;
                    System.out.println("Las " + num + " Pesetas son " + conversion);
                }
                else
                {
                    System.out.println("La moneda no es correcta");
                }
            }
        }


    }
}
