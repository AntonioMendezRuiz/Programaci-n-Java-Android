package com.company;

import java.util.Scanner;

public class Main
{
    //Juego del número secreto. El ordenador elegirá un número al azar entre 1 y 100. El
    //usuario irá introduciendo números por teclado, y el ordenador le irá dando pistas: "mi
    //número es mayor" o "mi número es menor", hasta que el usuario acierte. Entonces el
    //ordenador le felicitará y le comunicará el número de intentos que necesitó para acertar
    //el número secreto.

    public static void main(String[] args)
    {
	    int num , aleatorio, cont;
        Scanner sc = new Scanner(System.in);

        aleatorio = (int) (Math.random() * 99) + 1;

        System.out.println("Juego del número secreto");
        num = sc.nextInt();

        cont = 1;

        while (num != aleatorio)
        {
            if (num < aleatorio)
            {
                System.out.println("El número es mayor");
            }
            else
            {
                System.out.println("El número es menor");
            }
            System.out.println("Prueba otra vez. Intento número " + cont);
            num = sc.nextInt();

            cont++;
        }

            System.out.println("¡Has acertado!");

        if (cont < 4)
        {
            System.out.println("Bien hecho");
        }
        else
        {
            if (cont <= 8)
            {
                System.out.println("No esta mal");
            }
            else
            {
                System.out.println("Vaya tela colega.");
            }
        }
    }
}
