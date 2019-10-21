package com.company;

import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ClienteBonoloto implements Runnable
{
    //Atributo

    int [] boleto;

    //Constructor

    public ClienteBonoloto(int[] numeros)
    {
        List<Integer> boleto = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int numero;

        if(numeros.length == 6)
        {
            for (int i = 0; i < 6; i++)
            {
                numero = sc.nextInt();
                if(numeros[i] < 1 || numeros[i] > 49)
                {
                    System.out.println("Los números no son válidos.");
                }
                else
                {
                    boleto.add(numero);
                }
            }
        }
        else {
            System.out.println("El boleto no es válido.");
        }
    }
    //Métodos
    public int conectaCliente(String ip)
    {
        int[] numeros = null;
        int i = 0, aciertos;
        try
        {
            Socket soc = new Socket(ip, 9009);

            Scanner sc = new Scanner(soc.getInputStream());

                System.out.println(sc.nextLine());
                String s = sc.nextLine();



            soc.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return aciertos;
    }


    @Override
    public void run()
    {
       conectaCliente("127.0.0.1");
    }
}
