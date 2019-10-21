package com.company;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ServidorBonoloto
{
    //Atributo

    private static Random r;

    //Métodos

    public static void lanzaServidor()
    {
        try
        {
            ServerSocket server = new ServerSocket(9009);
            List<Integer> numeros = new LinkedList<>();

            while(true)
            {
                for(int i = 0; i < 6; i++)
                {
                    numeros.add(r.nextInt());
                }
                Socket soc = server.accept();
                PrintWriter pw = new PrintWriter(soc.getOutputStream(), true);

                pw.println(numeros);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
