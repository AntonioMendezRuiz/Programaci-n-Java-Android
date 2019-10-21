package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	    int hora, min, seg;
        Scanner sc = new Scanner(System.in);

            System.out.println("Dime la hora ");
            hora = sc.nextInt();
            if ((hora < 0) || (hora > 24))
            {
                System.out.println("La hora introducida no es correcta");
                return;
            }
            System.out.println("Dime los minutos");
            min = sc.nextInt();
            if((min < 0) || (min > 60))
            {
                System.out.println("Los minutos introducidos no son correctos");
                return;
            }

            System.out.println("Dime los segundos");
            seg = sc.nextInt();
            if((seg < 0) || (seg > 60))
            {
                System.out.println("Los segundos introducidos no son correctos");
                return;
            }

        System.out.println("La hora bonita es: " + hora + ":" + min + ":" + seg );
    }
}
