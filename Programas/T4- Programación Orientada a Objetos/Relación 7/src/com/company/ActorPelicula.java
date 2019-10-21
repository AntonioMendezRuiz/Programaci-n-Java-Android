package com.company;

import java.time.LocalDate;

public class ActorPelicula
{
    public int id;
    public String nombre;
    public LocalDate fechaNacimiento;
    public boolean principal;

    public String toString()
    {
        String s = "Ficha Actor/Película";
        s = s + "ID: " + this.id;
        s = s + "Título: " + this.nombre;
        s = s + "Año: " + this.fechaNacimiento;
        s = s + "Tiene Oscar:" + this.principal;
        return s;
    }
}
