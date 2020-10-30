package com.company;

import java.util.Objects;

public class Tema {
    private int id;
    private String descripcion;

    public Tema() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tema tema = (Tema) o;
        return id == tema.id &&
                Objects.equals(descripcion, tema.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descripcion);
    }

    @Override
    public String toString() {
        return "Tema{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    public Tema(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
