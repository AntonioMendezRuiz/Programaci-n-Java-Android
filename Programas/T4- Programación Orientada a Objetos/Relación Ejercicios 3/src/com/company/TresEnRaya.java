package com.company;

import java.util.Random;

public class TresEnRaya
{
    //Atributos
    private int tablero[] = new int[9];

    //Constructor

    public TresEnRaya ()
    {
        int i;
        for (i = 0 ; i <tablero.length; i ++)
        {
            tablero[i] = 0;
        }
    }

    //Métodos

    public void mueveJugador1 (int pos)
    {
           tablero[pos] = 1;
    }

    public void mueveJugador2(int pos)
    {
            tablero[pos] = 2;
    }

    public boolean movimientoValido(int pos)
    {
        boolean valido = true;
        if (tablero[pos] != 0)
        {
            valido = false;
        }

        return valido;
    }

    public void mueveOrdenador1()
    {
        Random r = new Random(System.currentTimeMillis());

        int pos = r.nextInt(9);
        if (tablero[pos] == 0)
        {
            tablero[pos] = 1;
        }else
        {
            while (tablero[pos] != 0)
            {
                if (tablero[pos] == 0)
                {
                    tablero[pos] = 1;
                }
                pos = r.nextInt(9);
            }
        }
    }

    public void mueveOrdenador2()
    {
        Random r = new Random(System.currentTimeMillis());

        int pos = r.nextInt(9);
        if (tablero[pos] == 0)
        {
            tablero[pos] = 2;
        }else
        {
            while (tablero[pos] != 0)
            {
                if (tablero[pos] == 0)
                {
                    tablero[pos] = 2;
                }
                pos = r.nextInt(9);
            }
        }
    }

    public void iniciar()
    {
        int i;

        for (i = 0; i <tablero.length; i++)
        {
            tablero[i] = 0;
        }
    }

    public boolean quedanMovimientos()
    {
        int i;
        boolean vacio = false;

        for (i = 0; i < 9 ; i++)
        {
            if (tablero[i] == 0)
            {
                vacio = true;
            }
        }
        return vacio;
    }

    public boolean ganaJugador1()
    {
        boolean gana = false;

        if((tablero[0] == 1 && tablero[1] == 1 && tablero[2] == 1)
                || (tablero[0] == 1 && tablero[3] == 1 && tablero[6] == 1) || (tablero[0] == 1 && tablero[4] == 1 && tablero[8] == 1))
        {
            gana = true;
        }
        if((tablero[0] == 1 && tablero[1] == 1 && tablero[2] == 1)
                || (tablero[1] == 1 && tablero[4] == 1 && tablero[7] == 1))
        {
            gana = true;
        }
        if((tablero[0] == 1 && tablero[1] == 1 && tablero[2] == 1)
                || (tablero[2] == 1 && tablero[5] == 1 && tablero[8] == 1) || (tablero[2] == 1 && tablero[4] == 1 && tablero[6] == 1))
        {
            gana = true;
        }
        if(tablero[3] == 1 && tablero[4] == 1 && tablero[5] == 1)
        {
            gana = true;
        }
        if(tablero[6] == 1 && tablero[7] == 1 && tablero[8] == 1)
        {
            gana = true;
        }

        return gana;
    }

    public boolean ganaJugador2()
    {
        boolean gana = false;

        if((tablero[0] == 2 && tablero[1] == 2 && tablero[2] == 2)
                || (tablero[0] == 2 && tablero[3] == 2 && tablero[6] == 2) || (tablero[0] == 2 && tablero[4] == 2 && tablero[8] == 2))
        {
            gana = true;
        }
        if((tablero[0] == 2 && tablero[1] == 2 && tablero[2] == 2)
                || (tablero[1] == 2 && tablero[4] == 2 && tablero[7] == 2))
        {
            gana = true;
        }
        if((tablero[0] == 2 && tablero[1] == 2 && tablero[2] == 2)
                || (tablero[2] == 2 && tablero[5] == 2 && tablero[8] == 2) || (tablero[2] == 2 && tablero[4] == 2 && tablero[6] == 2))
        {
            gana = true;
        }
        if(tablero[3] == 2 && tablero[4] == 2 && tablero[5] == 2)
        {
            gana = true;
        }
        if(tablero[6] == 2 && tablero[7] == 2 && tablero[8] == 2)
        {
            gana = true;
        }

        return gana;
    }

    public void dibujaTablero()
    {
        int i;

        for (i = 0; i < 9; i ++)
        {
            System.out.print("| " + tablero[i] + " |");
            if (i == 2 || i == 5)
            {
                System.out.println();
            }
        }
    }
}
