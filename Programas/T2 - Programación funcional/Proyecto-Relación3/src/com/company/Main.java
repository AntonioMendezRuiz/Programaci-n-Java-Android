package com.company;

public class Main
{
    //Función que determina si un año es bisiesto

    public static boolean bisiesto (int a)
    {
        boolean b;

        if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0) )
        {
            b = true;
        }
        else
        {
            b = false;
        }

        return b;
    }
    //Escribe una función “diasMes”, a la que le pasamos un mes (en formato numérico
    //1=Enero, 2=Febrero, etc.) y nos dice el número de días que tiene ese mes.

    public static int diasMes (int a)
    {
        if ((a == 1)||(a == 3)||(a == 5)||(a == 7)||(a == 8)||(a == 10)||(a == 12))
        {
            return 31;
        }
        else
        {
            if (a == 2)
            {
                return 28;
            }
            else
            {
                return 30;
            }
        }
    }

    //Debido a que en los años bisiestos el mes de Febrero tiene 29 días en lugar de 28,
    //necesitaremos también dar el año para conseguir el resultado correcto. Escribe la
    //función “diasMes2” a la que le pasas un mes y un año (ambos enteros) y te dice
    //cuántos días tiene ese mes, teniendo en cuenta si el año es bisiesto o no (NOTA:
    //Podéis usar la función “Bisiesto” que hicimos con anterioridad).

    public static int diasMes2 (int a, int b)
    {
        if(a != 2)
        {
            return diasMes(a);
        }
        else
        {
            if (bisiesto(b))
            {
                return 29;
            }
            else
            {
                return diasMes(a);
            }
        }
    }

    //Escribe una función “diasTranscurridos” a la que le pasamos tres enteros, el día, el mes
    //y el año, y nos dice cuántos días han pasado desde el inicio del año hasta ese día. Así,
    //el 1 de enero será el día 1 y el 31 de diciembre será el 365 ó 366 dependiendo de si el
    //año es bisiesto o no.

    public static int diasTranscurridos (int dia, int mes, int anno)
    {
        int i, cont = 0, dias1;

        for (i = 1; i < mes; i++)
        {
            cont = cont + diasMes2(i, anno);
        }
        dias1 = cont + dia;

        return dias1;
    }

    //Escribe una función “diasTranscurridos1980” a la que le pasamos un día, mes y año y
    //nos diga cuántos días han transcurrido desde el 01/01/1980 hasta ese día.

    public static int diasTranscurridos1980 (int dia, int mes, int anno)
    {

        int j, i, sumadias = 0, sumatotal, sumadiasanno = 0;

        for (i = 1980; i < anno; i++)
        {
            sumadiasanno = 0;
            for(j = 1; j <= 12; j++)
            {
                sumadiasanno = sumadiasanno + diasMes2(j, i);
            }
            sumadias = sumadias + sumadiasanno;

           // sumadias = sumadias + 365; y si es bisiesto ponesmo un "if"
        }

        sumatotal = sumadias + diasTranscurridos(dia, mes, anno);

        return sumatotal;
    }

    //Escribe una función “diasEntreFechas” a la que le pasamos 6 enteros. Un día, mes y
    //año y otro día, mes y año, y nos dice cuántos días han pasado entre ambas fechas

    public static int diasEntreFechas (int dia1, int mes1, int anno1, int dia2, int mes2, int anno2)
    {
        int x;

       x = diasTranscurridos1980(dia2, mes2, anno2) - diasTranscurridos1980(dia1, mes1, anno1);

        x = Math.abs(x);

        return x;
    }

    // Teniendo en cuenta que el 01/01/1980 era martes, haz una función “diaSemanaFecha”
    //que nos devuelva qué día de la semana corresponde a la fecha (día, mes y año) que le
    //pasamos en 3 parámetros. Nos devolverá un entero que corresponderá al día de la
    //semana (1=lunes, 2=martes, etc.).

    public static int diaSemanaFecha(int dia, int mes, int año)
    {

        if (diasTranscurridos1980(dia, mes, año) % 7 == 0)
        {
            return 2-1;
        }
       else if (diasTranscurridos1980(dia, mes, año) % 7 == 6)
        {
            return 7;
        }
        else if (diasTranscurridos1980(dia, mes, año) % 7 == 5)
        {
            return 7-1;
        }
        else if (diasTranscurridos1980(dia, mes, año) % 7 == 4)
        {
            return 6-1;
        }
        else if (diasTranscurridos1980(dia, mes, año) % 7 == 3)
        {
            return 5-1;
        }
        else if (diasTranscurridos1980(dia, mes, año) % 7 == 2)
        {
            return 4-1;
        }
        else
        {
            return 3-1;
        }
    }

    //Escribe una función “horaASegundos” a la que le pasas 3 parámetros enteros (hora,
    //minutos y segundos) y te devuelve el total de segundos.

    public static int horaASegundos (int hora, int minutos, int segundos)
    {
        int sumhoras, summinutos, total;

        sumhoras = hora * 3600;
        summinutos = minutos * 60;

        total = sumhoras + summinutos + segundos;

        return total;
    }

    //Escribe una función “escribeHoraBonita” a la que le pasas tres parámetros (hora,
    //minutos y segundos) y te escribe por pantalla la hora en formato “HH:MM:SS”.

    public static void escribeHoraBonita (int hora, int minuto, int segundo)
    {
        System.out.println(hora + " : " + minuto + " : " + segundo);
    }

    //Escribe una función “escribeSegundosBonito” a la que le pasas un parámetro que
    //corresponde al número de segundos y te escribe por pantalla la hora en formato
    //“HH:MM:SS”.

    public static void escribeSegundosBonito (int segundos)
    {
        int horas, minutos, restsegundos;

        horas = segundos / 3600;
        minutos = segundos/60;
        if (minutos == 60)
        {
            minutos = 0;
        }
        else
        {
            if (minutos >= 60)
            {
                minutos = minutos % 60;
                horas++;
            }
        }
        restsegundos = segundos % 60;
        escribeHoraBonita(horas, minutos, restsegundos);
    }

    //Escribe una función “segundosTranscurridos” a la que le pasas 2 horas (en total, 6
    //parámetros: hora, minutos y segundos para cada una de las dos horas) y te dice
    //cuántos segundos han transcurrido entre una y otra.

    public static int segundosTranscurridos (int hora1,int minuto1, int segundo1, int hora2, int minuto2, int segundo2)
    {
        int x;

        x =horaASegundos(hora1,minuto1,segundo1)- horaASegundos(hora2,minuto2,segundo2);

        if (x < 0)
        {
            x = -x;
        }
        return x;
    }

    //Escribe una función “segundosTranscurridos1980” a la que le pasas 6 parámetros: día,
    //mes, año, hora, minutos y segundos y te dice cuántos segundos han transcurrido
    //desde el 1 de enero de 1980.

    public static int segundosTranscurridos1980 (int dia, int mes, int anno, int hora, int minuto, int segundo)
    {
        int  x , rest, total;

        x = diasTranscurridos1980(dia,mes,anno) * 86400;

        rest = 86400 - segundosTranscurridos(0,0,0, hora, minuto, segundo);

        total = x + rest;

        return total;

    }
    public static void main(String[] args)
    {
        System.out.println(segundosTranscurridos1980(2,6,1987,6,34,29));

    }
}