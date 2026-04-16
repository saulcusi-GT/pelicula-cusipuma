package com.example.parcial_pelicula;

public class Pelicula {

    private String titulo;
    private String director;
    private int duracion;
    private String genero;
    private String clasificacion;

    public Pelicula() {}

    public Pelicula(String titulo, String director, int duracion, String genero, String clasificacion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        this.clasificacion = clasificacion;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    public int getDuracion() { return duracion; }
    public void setDuracion(int duracion) { this.duracion = duracion; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getClasificacion() { return clasificacion; }
    public void setClasificacion(String clasificacion) { this.clasificacion = clasificacion; }
}