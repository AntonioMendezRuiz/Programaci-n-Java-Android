package com.company;

public class Alumno
{
    //Atributos

    private String nombre;
    private int edad;
    private double calificacion;

    //Contructor
    public void alumno ()
    {
        setNombre(nombre);
        setEdad(edad);
        setCalificacion(calificacion);
    }
    //Propiedades

    //Nombre

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        if (nombre.equals(""))
        {
            nombre = "";
        }
        else
        {
            this.nombre = nombre;
        }
    }

    //Edad

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        if(edad < 17 || edad > 100)
        {
            edad = edad;
        }
        else
        {
            this.edad = edad;
        }
    }

    //Calificación

    public double getCalificacion()
    {
        return calificacion;
    }

    public void setCalificacion(double calificacion)
    {
        if(calificacion < 0 || calificacion > 10)
        {
            calificacion = calificacion;
        }
        else
        {
            this.calificacion = calificacion;
        }
    }

    public String toString( String nombre, int edad, double calificacion)
    {
        return nombre + Integer.toString(edad) + Double.toString(calificacion);
    }

}
