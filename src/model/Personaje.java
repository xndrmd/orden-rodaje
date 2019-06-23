/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author laboratorioesan
 */
public class Personaje {
    private int id;
    private String nombre;
    private String descripcion;
    private Pelicula pelicula;
    private Actor actor;
    private String tipo;
    private List<DetalleSecuencia> detalleSecuencias;

    public Personaje() {
    }

    public Personaje(int id, String nombre, String descripcion, Pelicula pelicula, Actor actor, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.pelicula = pelicula;
        this.actor = actor;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<DetalleSecuencia> getDetalleSecuencias() {
        return detalleSecuencias;
    }
    
}
