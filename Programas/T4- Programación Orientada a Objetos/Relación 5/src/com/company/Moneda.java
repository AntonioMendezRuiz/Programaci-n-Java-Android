package com.company;

import java.security.InvalidParameterException;

public class Moneda
{
    public enum tipoMoneda
    {
        EURO, DOLLAR, YEN, LIBRA
    }

    //Atributos

    private tipoMoneda tmoneda;
    private int decimales;
    private String simbolo;
    private double cambioEuro;

    //Construtor

    public Moneda( tipoMoneda tmoneda, int decimales, String simbolo, double cambioEuro)
    {
        this.tmoneda = tmoneda;
        this.decimales = decimales;
        this.simbolo = simbolo;
        this.cambioEuro = cambioEuro;

        if(decimales < 0 || decimales > 5)
        {
            throw new InvalidParameterException("Decimales negativos o demasiados decimales");
        }
        if (simbolo.length() == 0)
        {
            throw new InvalidParameterException("El simbolo no puede estar vacio");
        }
        if (cambioEuro < 0)
        {
            throw new InvalidParameterException("El cambio a Euro no puede ser negativo");
        }
    }

    //propiedades

    public tipoMoneda getTmoneda()
{
    return tmoneda;
}
    public int getDecimales()
    {
        return decimales;
    }
    public String getSimbolo()
    {
        return simbolo;
    }
    public double getCambioEuro()
    {
        return cambioEuro;
    }
    public void setCambioEuro()
    {
        this.cambioEuro = cambioEuro;

        if (cambioEuro < 0)
        {
            throw new InvalidParameterException("El cambio a Euro no puede ser negativo");
        }
    }

}
