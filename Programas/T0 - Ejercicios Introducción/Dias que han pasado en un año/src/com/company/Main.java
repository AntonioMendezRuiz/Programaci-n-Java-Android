package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	    int dias, mes, año, numerodias;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un día");
        dias = sc.nextInt();




        if ((dias <= 0) || (dias > 31))
        {
            System.out.println("El día introducido no es correcto");
        }
        else
        {
            System.out.println("Dime un mes");
            mes = sc.nextInt();
            System.out.println("Dime un año");
            año = sc.nextInt();

            switch (mes)
            {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numerodias = 31;
                break;
                case 4: case 6: case 9: case 11:
                numerodias = 30;
                case 2:
                    if((año%4==0 && año%100!=0) || año%400==0)
                    {
                        numerodias = 29;
                    }
                    else
                    {
                        numerodias = 28;
                    }
                    break;
                default:
                    System.out.println("El mes " + mes + " es incorrecto.");
                    break;

                }
            if ((mes <= 0) || (mes > 12))
            {
                System.out.println("El mes no es correcto");
                return;
            }
        }
    }



}


