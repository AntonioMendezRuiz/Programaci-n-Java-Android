package com.company;

import java.sql.*;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class CineDB
{
    private Connection conn;

    public CineDB (String s)
    {
        String base = "jdbc:sqlite:" + s;
        try
        {
            conn = DriverManager.getConnection(base);
            System.out.println("Connection to SQLite has been established.");
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public int insertaPelicula(String titulo, int anno, boolean tieneOscar, double valoracion)
    {
        int id = 0;
        String sql = "INSERT INTO peliculas (titulo, anno, tieneOscar, valoracion) VALUES(?,?,?,?)";
        try (Connection conn = this.conn)
        {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, titulo);
            pstmt.setInt(2, anno);
            pstmt.setBoolean(3, tieneOscar);
            pstmt.setDouble(4, valoracion);
            pstmt.executeUpdate();

            sql = "SELECT last_insert_rowid()";
            ResultSet rs = pstmt.executeQuery(sql);
            id = rs.getInt("id");
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }

        return id;
    }

    public int insertaActor(String nombre, LocalDate fechaNacimiento)
    {
        int id = 0;
        String sql = "INSERT INTO actores(nombre, fechaNacimiento) VALUES(?,?)";
        try (Connection conn = this.conn)
        {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nombre);
            pstmt.setDate(2, Date.valueOf(fechaNacimiento));
            pstmt.executeUpdate();

            sql = "SELECT last_insert_rowid()";
            ResultSet rs = pstmt.executeQuery(sql);
            id = rs.getInt("id");
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }

        return id;
    }

    public void asociaActorPelicula(int idActor, int idPelicula, boolean principal)
    {
        String sql = "INSERT INTO ActorPelicula (idActor, idPelicula, principal) VALUES(?,?,?)";
        try (Connection conn = this.conn)
        {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, idActor);
            pstmt.setInt(2, idPelicula);
            pstmt.setBoolean(3, principal);
            pstmt.executeUpdate();
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    //En esta funcion se busca al actor y se muestra su informacion
    public int buscaActor(String nombre)
    {
        String sql = "SELECT * FROM actores WHERE nombre LIKE '" + nombre + "'";
        ResultSet rs;
        Statement st;
        int id = 0;
        try (Connection conn = this.conn)
        {
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while(rs.next())
            {
                System.out.println("ID: " + rs.getInt(1));
                System.out.println("Nombre: " + rs.getString(2));
                System.out.println("Fecha Nacimineto: " + rs.getDate(3));
            }
            id = rs.getInt("id");
            rs.close();
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return id;
    }
    //En esta funcion se busca que la pelicula y se muestra su informacion ya de paso
    public int buscaPelicula(String nombre)
    {
        String sql = "SELECT * FROM peliculas WHERE nombre LIKE '" + nombre + "'";
        ResultSet rs;
        Statement st;
        int id = 0;
        try (Connection conn = this.conn)
        {
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while(rs.next())
            {
                System.out.println("ID: " + rs.getInt(1));
                System.out.println("Título: " + rs.getString(2));
                System.out.println("Año: " + rs.getInt(3));
                System.out.println("Tiene Oscar: " + rs.getBoolean(4));
                System.out.println("Valoración: " + rs.getDouble(5));
            }
            id = rs.getInt("id");
            rs.close();
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return id;
    }

    public List<Pelicula> listadoPeliculas(){
        List<Pelicula> listadoPeliculas = new LinkedList<>();
        try {
            String sql = "SELECT * FROM peliculas;";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Pelicula pelicula = new Pelicula();
                pelicula.id = rs.getInt("id");
                pelicula.titulo = rs.getString("titulo");
                pelicula.anno = rs.getInt("anno");
                pelicula.tieneOscar = rs.getBoolean("tieneOscar");
                pelicula.valoracion = rs.getDouble("valoracion");
                listadoPeliculas.add(pelicula);
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return listadoPeliculas;
    }

    public List<Actor> listadoActores()
    {
        List<Actor> listadoActores = new LinkedList<>();
        try
        {
            String sql = "SELECT * FROM actores;";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next())
            {
                Actor actor = new Actor();
                actor.id = rs.getInt("id");
                actor.nombre = rs.getString("nombre");
                actor.fechaNacimiento = rs.getDate("fechaNacimiento").toLocalDate();
                listadoActores.add(actor);
            }
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return listadoActores;
    }
    List<Pelicula> listadoPeliculasPorActores(int idActor){
        List<Pelicula> listadoPeliculas = new LinkedList<>();
        try {
            String sql = "SELECT peliculas.* FROM peliculas, actores, actoresPeliculas  WHERE actoresPeliculas.idActor = actores.id AND actoresPeliculas.idPelicula = peliculas.id AND actores.id = ?;";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1,idActor);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Pelicula pelicula = new Pelicula();
                pelicula.id = rs.getInt("id");
                pelicula.titulo = rs.getString("titulo");
                pelicula.anno = rs.getInt("anno");
                pelicula.tieneOscar = rs.getBoolean("tieneOscar");
                pelicula.valoracion = rs.getDouble("valoracion");
                listadoPeliculas.add(pelicula);
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return listadoPeliculas;
    }

    List<ActorPelicula> listadoActoresPorPelicula(int idPelicula){
        List<ActorPelicula> listadoActores = new LinkedList<>();
        try {
            String sql = "SELECT actores.*,principal FROM peliculas, actores, actoresPeliculas  WHERE actoresPeliculas.idActor = actores.id AND actoresPeliculas.idPelicula = peliculas.id AND peliculas.id = ?;";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1,idPelicula);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ActorPelicula actor = new ActorPelicula();
                actor.id = rs.getInt("id");
                actor.nombre = rs.getString("nombre");
                actor.fechaNacimiento = rs.getDate("fechaNacimiento").toLocalDate();
                actor.principal = rs.getBoolean("principal");
                listadoActores.add(actor);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return listadoActores;
    }
    public Pelicula datosPelicula(int idPelicula){
        Pelicula pelicula = new Pelicula();
        try {
            String sql = "SELECT * FROM peliculas WHERE id = ?;";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1,idPelicula);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                pelicula.id = rs.getInt("id");
                pelicula.titulo = rs.getString("titulo");
                pelicula.anno = rs.getInt("anno");
                pelicula.tieneOscar = rs.getBoolean("tieneOscar");
                pelicula.valoracion = rs.getDouble("valoracion");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return pelicula;
    }
}



