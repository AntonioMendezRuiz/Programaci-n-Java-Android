package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	    int hora1, hora2, seg;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la hora de inicio");
        hora1 = sc.nextInt();

        if ((hora1 < 0) || (hora1 > 24))
        {
            System.out.println("La hora introducida no es correcta");
            return;
        }

        System.out.println("Dime la hora de finalización");
        hora2 = sc.nextInt();

        if ((hora2 < 0) || (hora2 > 24))
        {
            System.out.println("La hora introducida no es correcta");
            return;
        }

        if (hora1 > hora2)
        {
            System.out.println("La hora introducida no es correcta");
            return;
        }

        seg = (hora2 - hora1) * 3600;



        System.out.println("El número de segundos transcurridos es " + seg + " segundos");
    }
}
