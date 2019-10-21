package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	    String mes;
	    int dias;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el mes (Enero, Febrero, Marzo,...)");
        mes = sc.next();

        switch (mes)
        {
            case "Enero": dias = 31; break;
            case "Febrero": dias = 28; break;
            case "Marzo": dias = 30; break;
            case "Abril": dias = 31; break;
            case "Mayo": dias = 30; break;
            case "Junio": dias = 31; break;
            case "Julio": dias = 30; break;
            case "Agosto": dias = 31; break;
            case "Septiembre":dias = 30; break;
            case "Octubre": dias = 31; break;
            case "Noviembre":dias = 30; break;
            case "Diciembre":dias = 31; break;

            default: dias = 0; break;
        }

        System.out.println( "El mes de " + mes + " tiene " + dias + " dias");
    }
}
