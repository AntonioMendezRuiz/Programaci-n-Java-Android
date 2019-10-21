package com.company;

import java.security.InvalidParameterException;

public class Fraccion
{
    //Atributos

    private int numerador;
    private int denominador;

    //Constructores

    public Fraccion(int numerador, int denominador)
    {
        if(denominador == 0)
        {
            throw new InvalidParameterException("El denominador debe ser un número distinto a 0");
        }
        else
        {
            this.numerador = numerador;
            this.denominador = denominador;
        }
    }

    public Fraccion(int numerador)
    {
        this.numerador = numerador / 1;
    }

    public Fraccion(double a)
    {
        int den = 1, i;

        String cad = a + "";
        String decimal = cad.substring(cad.indexOf(".") + 1);

        for(i = 0; i < decimal.length();i++)
        {
            a = a *10;
            den = den *10;
        }
    }

    //Propiedades

    public int getNumerador()
    {
        return numerador;
    }

    public int getDenominador()
    {
        return denominador;
    }

    public void setNumerador(int numerador)
    {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador)
    {
        this.denominador = denominador;
        if (denominador == 0)
        {
            throw new InvalidParameterException("El denominador debe ser un número distinto a 0");
        }
    }

    //Métodos privados

    private int mcm (int denominador1, int denominador2)
        {

            int multiplo;

            if (denominador1>denominador2)
            {
                multiplo = denominador1;
            }
            else
            {
                multiplo = denominador2;
            }
            while (multiplo%denominador1!=0 || multiplo%denominador2!=0)
            {
                multiplo++;
            }
            return multiplo;
        }

    private int MCD(int A,int B)
    {
        int Dividendo;
        int Divisor;
        int Resto;

            if(A > B)
            {
                Dividendo = A;
                Divisor = B;
            }
            else
            {
                Dividendo = B;
                Divisor = A;
            }
            Resto = Dividendo  %  Divisor;
            do
            {
                Dividendo = Divisor;
                Divisor = Resto;
                Resto = Dividendo  %  Divisor;
            }
            while (Resto!= 0);

        return Divisor;
    }

    //Métodos

    public void simplificar()
    {
        numerador = numerador/MCD(numerador,denominador);
        denominador = denominador/MCD(numerador,denominador);
    }

    public String toString()
    {
        String fraccion = this.numerador + "/" + this.denominador;

        return fraccion;
    }

    //Métodos (Operadores)

    public Fraccion negate()
    {
        Fraccion a = new Fraccion(numerador, denominador);
        numerador = numerador*-1;
        return a;
    }

    public Fraccion add(Fraccion b)
    {
        Fraccion a = new Fraccion(numerador, denominador);
        int num = mcm(a.getDenominador(), b.getDenominador());
        int sumanumerador;

        numerador = this.numerador * (denominador / num);
        sumanumerador = a.getNumerador() + b.getNumerador();

        a.setDenominador(num);
        a.setNumerador(sumanumerador);

        return a;
    }

    public Fraccion substrac(Fraccion b)
    {
        Fraccion a = new Fraccion(numerador, denominador);
        int num = mcm(a.getDenominador(), b.getDenominador());
        int restanumerador;

        numerador = this.numerador * (denominador / num);
        restanumerador = a.getNumerador() - b.getNumerador();

        a.setDenominador(num);
        a.setNumerador(restanumerador);

        return a;
    }

    public Fraccion multiply(Fraccion b)
    {
        Fraccion a = new Fraccion(numerador, denominador);
        int num, den;
        num = this.numerador * b.numerador;
        den = this.denominador * b.denominador;

        a.setNumerador(num);
        a.setDenominador(den);

        return a;
    }
    public Fraccion divide (Fraccion b)
    {
        Fraccion a = new Fraccion(numerador, denominador);
        int num, den;
        num = this.denominador * b.numerador;
        den = this.numerador * b.denominador;

        a.setNumerador(num);
        a.setDenominador(den);

        return a;
    }

    public boolean equals (Fraccion b)
    {
        boolean correcto;

        if (this.numerador / this.denominador == b.numerador / b.denominador)
        {
            correcto = true;
        }
        else
        {
            correcto = false;
        }

        return correcto;
    }

    public int compareTo (Fraccion b)
    {
        int res;

        if (this.numerador / this.denominador == b.numerador / b.denominador)
        {
            res = 0;
        }
        else if (this.numerador / this.denominador < b.numerador / b.denominador)
        {
            res = -1;
        }
        else
        {
            res = 1;
        }

        return res;
    }
}
