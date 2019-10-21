package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("¿A que temperatura está el agua?");
        temp = sc.nextDouble();

        if ((temp > 0) && (temp < 100))
        {
            System.out.println("El agua está en estado líquido");
        }
        else
        {
            if (temp <= 0 )
            {
                if(temp <= -273.15)
                System.out.println("Esta temperatura es imposible de alcanzar");
                else
                    System.out.println("El agua esta congelada");
            }
            else
            {
                if (temp > 5000)
                {
                    System.out.println("Supongo que estarás en el Sol, ¿No?");
                }
                else
                    System.out.println("El agua se ha evaporadao");
            }
        }

    }
}
