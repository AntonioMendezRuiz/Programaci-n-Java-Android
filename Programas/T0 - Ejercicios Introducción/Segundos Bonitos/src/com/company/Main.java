package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long seg, hora, min, restseg, restmin;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una cantidad de segundos");
        seg = sc.nextLong();

        if (seg < 0)
        {
            System.out.println("La cantidad de segundos no puede ser negativa");
            return;
        }
        else
        {
            min = seg / 60;
            restseg = seg % 60;
            restmin = min % 60;
            hora = min / 60;
        }

        System.out.println("Esos segundos son " + hora + ":" + restmin + ":" + restseg);
    }
}
