/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author laboratorioesan
 */
public class DetalleActores {
    private OrdenRodaje ordenRodaje;
    private Personaje personaje;
    private String ecdt;
    private String makeup;
    private String listo;
    private String menorEdad;
    private String observaciones;

    public DetalleActores() {
    }

    public DetalleActores(OrdenRodaje ordenRodaje, Personaje personaje, String ecdt, String makeup, String listo, String menorEdad, String observaciones) {
        this.ordenRodaje = ordenRodaje;
        this.personaje = personaje;
        this.ecdt = ecdt;
        this.makeup = makeup;
        this.listo = listo;
        this.menorEdad = menorEdad;
        this.observaciones = observaciones;
    }

    public OrdenRodaje getOrdenRodaje() {
        return ordenRodaje;
    }

    public void setOrdenRodaje(OrdenRodaje ordenRodaje) {
        this.ordenRodaje = ordenRodaje;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public String getEcdt() {
        return ecdt;
    }

    public void setEcdt(String ecdt) {
        this.ecdt = ecdt;
    }

    public String getMakeup() {
        return makeup;
    }

    public void setMakeup(String makeup) {
        this.makeup = makeup;
    }

    public String getListo() {
        return listo;
    }

    public void setListo(String listo) {
        this.listo = listo;
    }

    public String getMenorEdad() {
        return menorEdad;
    }

    public void setMenorEdad(String menorEdad) {
        this.menorEdad = menorEdad;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
}
