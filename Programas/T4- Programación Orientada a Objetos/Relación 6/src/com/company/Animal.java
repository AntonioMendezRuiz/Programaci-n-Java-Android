package com.company;

import java.time.LocalDate;

public abstract class Animal
    {
        //Atributos

        protected String nombre, comentarios = "";
        protected double peso;
        protected LocalDate fechaNacimiento;

        //Métodos

        public double getPeso()
        {
            return peso;
        }

        public void setPeso(double peso)
        {
            this.peso = peso;
        }

        public LocalDate getFechaNacimiento()
        {
            return fechaNacimiento;
        }

        public String getComentarios()
        {
            return comentarios;
        }

        public void setComentarios(String comentarios)
        {
            this.comentarios = comentarios;
        }

        public String getNombre()
        {
            return nombre;
        }

        public abstract String toString();
    }
