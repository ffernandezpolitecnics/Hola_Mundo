package com.company;

import java.util.List;
import java.util.Objects;

public class Pelicula {
    private String titulo;
    private String director;
    private int anyoEstreno;
    private List<String> temas;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int anyoEstreno, List<String> temas) {
        this.titulo = titulo;
        this.director = director;
        this.anyoEstreno = anyoEstreno;
        this.temas = temas;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", anyoEstreno=" + anyoEstreno +
                ", temas=" + temas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return Objects.equals(titulo, pelicula.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnyoEstreno() {
        return anyoEstreno;
    }

    public void setAnyoEstreno(int anyoEstreno) {
        this.anyoEstreno = anyoEstreno;
    }

    public List<String> getTemas() {
        return temas;
    }

    public void setTemas(List<String> temas) {
        this.temas = temas;
    }
}
