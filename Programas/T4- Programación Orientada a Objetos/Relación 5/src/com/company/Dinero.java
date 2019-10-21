package com.company;
import com.company.Moneda.tipoMoneda;
import java.util.LinkedList;
import java.util.List;

public class Dinero
{

    //Atributos

    private static List<Moneda> listaMonedas = new LinkedList<>();
    private double cantidad;
    private String tMoneda;

    static
    {
        listaMonedas.add(new Moneda(tipoMoneda.EURO, 2, "€" , 1));
        listaMonedas.add(new Moneda(tipoMoneda.DOLLAR, 2, "$" , 0.88));
        listaMonedas.add(new Moneda(tipoMoneda.YEN, 4, "¥" , 0.0079));
        listaMonedas.add(new Moneda(tipoMoneda.LIBRA, 2, "£" , 1.16));
    }

     public static void actualizaCambio (tipoMoneda t, double cambio)
    {
        int i;

        for(i = 0; i < listaMonedas.size(); i++)
        {
            if (listaMonedas.contains(t))
            {
                listaMonedas.get(i).setCambioEuro();
            }
        }
    }
    public static Moneda buscaMoneda(tipoMoneda t)
    {
        int i;


        for(i = 0; i < listaMonedas.size(); i++)
        {
            if (listaMonedas.contains(t))
            {
                listaMonedas.get(i);
            }
        }
        return listaMonedas.get(i);
    }

    //Constructores

    public Dinero(double cantidad, String tMoneda)
    {
        this.cantidad = cantidad;
        this.tMoneda = tMoneda;
    }

    public Dinero(int cantidad, String tMoneda)
    {
        this.cantidad = cantidad;
        this.tMoneda = tMoneda;
    }

    public double getCantidad()
    {
        return cantidad;
    }
    public String gettMoneda()
    {
        return tMoneda;
    }
    public void setCantidad()
    {
        this.cantidad = cantidad;
    }
    public void settMoneda()
    {
        this.tMoneda = tMoneda;
    }

    //Métodos

    public String toString()
    {
        String monedita = this.cantidad + " " + this.tMoneda;
        return monedita;
    }

    public double valorEn(tipoMoneda t)
    {
        double solucion = 1;

        if(listaMonedas.equals(t))
        {
            listaMonedas.indexOf(t);
            solucion = solucion * listaMonedas.get(listaMonedas.indexOf(t)).getCambioEuro();

        }
        return solucion;
    }
    public Dinero convierteEn (tipoMoneda t)
    {
        Dinero solucion = new Dinero(cantidad, tMoneda);

        if(listaMonedas.equals(t))
        {
            listaMonedas.indexOf(t);
            solucion.cantidad = solucion.cantidad * listaMonedas.get(listaMonedas.indexOf(t)).getCambioEuro();
            solucion.tMoneda = listaMonedas.get(listaMonedas.indexOf(t)).getSimbolo();
        }
        return solucion;
    }

    //Métodos Operadores

    public Dinero add (Dinero d)
    {
        double dinerito = 0;

        Dinero solucion = new Dinero(cantidad, tMoneda);

        dinerito = dinerito + d.getCantidad();

        solucion.cantidad = dinerito;

        return solucion;

    }

    public Dinero substract(Dinero d)
    {

        double dinerito = 0;

        Dinero solucion = new Dinero(cantidad, tMoneda);

        dinerito = dinerito - d.getCantidad();

        solucion.cantidad = dinerito;

        return solucion;
    }

    public Dinero multiply (double a)
    {
        double x;
        Dinero solucion = new Dinero(cantidad, tMoneda);

        x = solucion.getCantidad() * a;

        solucion.cantidad = x;

        return solucion;
    }

    public Dinero divide (double a)
    {

        double x;
        Dinero solucion = new Dinero(cantidad, tMoneda);

        x = solucion.getCantidad() / a;

        solucion.cantidad = x;

        return solucion;
    }

    public Dinero negate ()
    {
        Dinero solucion = new Dinero(cantidad, tMoneda);

        double x;

        x = solucion.getCantidad() * - 1;

        solucion.cantidad = x;

        return solucion;
    }

    public boolean compareTo(Dinero d)
    {
        boolean solucion = false;

        Dinero fin = new Dinero(cantidad, tMoneda);

        if (d.tMoneda.equals(fin.tMoneda))
        {
            if(d.cantidad == fin.cantidad)
            {
                solucion = true;
            }
        }
        return solucion;
    }

}
