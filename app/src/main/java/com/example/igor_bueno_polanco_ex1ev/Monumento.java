package com.example.igor_bueno_polanco_ex1ev;

public class Monumento {

    private String titulo;
    private String descripcion;
    private String imagen;

    private int puntuacion;

    public Monumento(String titulo, String descripcion, String imagen, int puntuacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.puntuacion = puntuacion;
    }

    public Monumento() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}
