package com.company;

import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void cliente()
    {
        try
        {
            Socket soc = new Socket("172.30.10.200", 1000);
            Scanner sc = new Scanner(soc.getInputStream());
            String linea = sc.nextLine();

            System.out.println(linea);

            soc.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void cliente2()
    {
        try
        {
            Socket soc = new Socket("172.30.10.200", 1001);
            Scanner sc = new Scanner(soc.getInputStream());

            while (true)
            {
                System.out.println(sc.nextInt());
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        cliente2();
    }
}
