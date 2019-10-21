package com.company;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Baraja
{

    // Atributos

     private List<Carta> listaCartas;

    // Constructores

    public Baraja ()
    {
        listaCartas = new LinkedList<>();
    }

    public Baraja(int tipoBaraja)
    {
        this();

        int i;

        if(tipoBaraja == 1)
        {
            for (i = 1; i <= 40; i++)
            {
                listaCartas.add(new Carta(i));
            }
        }
        else if (tipoBaraja == 2)
        {
            for (i = 1; i <= 40; i++)
            {
                listaCartas.add(new Carta(i));
            }
            for (i = 1; i <= 40; i++)
            {
                listaCartas.add(new Carta(i));
            }
        }
        else
        {
            throw new InvalidParameterException("Debes elejir entre opción 1 o 2");
        }
    }
    public Baraja (int tipoBaraja, boolean barajar)
    {
        this(tipoBaraja);

        if (barajar)
        {
            this.barajar();
        }
    }

    // Métodos

    public void mostrar ()
    {
        int i;

        for (i = 0 ; i < listaCartas.size(); i++)
        {
            System.out.println(listaCartas.get(i).nombreCarta());
        }
    }

    public void barajar ()
    {
        int i, x, tam = listaCartas.size();

        List<Carta> lista = new ArrayList<>();
        Random aleatorio = new Random();

        for (i = 0; i < tam; i++)
        {
            x = aleatorio.nextInt(listaCartas.size());
            lista.add(listaCartas.get(x));
            listaCartas.remove(x);
        }

        for(i = 0; i < lista.size(); i++)
        {
            listaCartas.add(lista.get(i));
        }
    }

    public void Cortar (int numeroCartas)
    {
        int i, tam = listaCartas.size();
        List<Carta> lista = new ArrayList<>();

        if ((numeroCartas < listaCartas.size()) && (numeroCartas > 0))
        {
            for (i = 0; i < numeroCartas; i++)
            {
                lista.add(listaCartas.get(i));
                listaCartas.remove(i);
            }

            for (i = 0; i < tam; i++)
            {
                listaCartas.add(lista.get(i));
            }
        }
        else
        {
            throw new InvalidParameterException("El número para cortar la baraja no es válido");
        }
    }

    public Carta robar()
    {
        List<Carta> lista = new ArrayList<>();

        lista.add(listaCartas.get(0));
        listaCartas.remove(0);

        if (vacio())
        {
            throw new InvalidParameterException("No hay mas cartas para robar");
        }

        return lista.get(0);
    }

    public void insertaCartaFinal(int idCarta)
    {
        listaCartas.add(new Carta(idCarta));
    }

    public void insertaCartaPrincipio(int idCarta)
    {
        listaCartas.add(0, new Carta(idCarta));
    }

    public void insertaCartaFinal(Carta c)
    {
        listaCartas.add(c);
    }

    public void insertaCartaPrincipio(Carta c)
    {
        listaCartas.add(0, c);
    }

    public int numeroCartas ()
    {
        int res;

        res = listaCartas.size();

        return res;
    }

    public boolean vacio()
    {
        boolean res = true;

        if(listaCartas.size() > 0)
        {
           res = false;
        }
        return res;
    }
}
