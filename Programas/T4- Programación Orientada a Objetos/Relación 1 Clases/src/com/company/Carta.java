package com.company;

import java.security.InvalidParameterException;

public class Carta
{
    //Atributos

    private int numero;
    private int palo;


    //Constructores

    public Carta (int numero, int palo)
    {
        this.numero = numero;
        this.palo = palo;
    }

    public Carta (int id)
    {
        if ((id >= 1) && (id <= 40))
        {
            if (id <= 10)
            {
                numero = id;
                palo = 0;
            }
            else if (id <= 20)
            {   numero = id - 10;
                palo = 1;
            }
            else if (id <= 30)
            {
                numero = id - 20;
                palo = 2;
            }
            else
            {
                numero = id - 30;
                palo = 3;
            }
        }
        else
        {
            throw new InvalidParameterException("El valor no es correcto");
        }

    }

    //Propiedades

    public int getNumero(){return numero;}
    public int getPalo(){return palo;}

    //metodos

    public String nombreNumero ()
    {
        if (numero == 1)
            return "As";
        else if (numero == 2)
            return "Dos";
        else if (numero == 3)
            return "Tres";
        else if (numero == 4)
            return "Cuatro";
        else if (numero == 5)
            return "Cinco";
        else if (numero == 6)
            return "Seis";
        else if (numero == 7)
            return "Siete";
        else if (numero == 8)
            return "Sota";
        else if (numero == 9)
            return "Caballo";
        else
            return "Rey";
    }

    public String nombrePalo ()
    {
        if (palo == 0)
            return "Oros";
        else if (palo == 1)
            return "Copas";
        else if (palo == 2)
            return "Espadas";
        else if (palo == 3)
            return "Bastos";
        else
            return "";
    }

    public String nombreCarta ()
    {
        return (nombreNumero() + " " + nombrePalo());
    }

    public int valorTute (int numCarta)
    {
        int valor;

        if (numCarta == 1)
        {
            valor = 11;
        }
        else if (numCarta == 3)
        {
            valor = 10;
        }
        else if (numCarta == 8)
        {
            valor = 2;
        }
        else if (numCarta == 9)
        {
            valor = 3;
        }
        else if (numCarta == 10)
        {
            valor = 4;
        }
        else
        {
            valor = 0;
        }

        return valor;
    }

    public int valorMus (int numCarta)
    {
        int valor;

        if ((numCarta == 1) || (numCarta == 2))
        {
            valor = 1;
        }
        else if ((numCarta == 3) || (numCarta == 8) || (numCarta == 9) || (numCarta == 10))
        {
            valor = 10;
        }
        else
        {
            valor = numCarta;
        }

        return valor;
    }

    public double valor7ymedia (int numCarta)
    {
        double valor;

        if ((numCarta == 8) || (numCarta == 9) || (numCarta == 10))
        {
            valor = 0.5;
        }
        else
        {
            valor = numCarta;
        }

        return valor;
    }


}
