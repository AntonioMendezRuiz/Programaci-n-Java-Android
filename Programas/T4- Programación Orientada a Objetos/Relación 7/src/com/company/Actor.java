package com.company;

import java.time.LocalDate;

public class Actor
{
    public int id;
    public String nombre;
    public LocalDate fechaNacimiento;

    public String toString()
    {
        String s = "Ficha Actor";
        s = s + "ID: " + this.id;
        s = s + "Título: " + this.nombre;
        s = s + "Año: " + this.fechaNacimiento;

        return s;
    }
}