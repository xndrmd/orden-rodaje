/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author laboratorioesan
 */
public class OrdenRodaje {
    private int id;
    private Pelicula pelicula; // no tiene relacion en la bd
    private Empleado productor;
    private Empleado director;
    private Empleado directorProd;
    private Hospital hospital;
    private Ubigeo ubigeo;
    private Date fecRodaje;
    private Date horaInicio;
    private Date horaFin;
    private Date horaDesayuno;
    private Date horaAlmuerzo;
    private Date horaAmanecer;
    private Date horaAtardecer;
    private String prevMeteo; // predicción meteorologica?
    // private Contacto contacto; // no tiene relacion en la bd
    private int estado;

    public OrdenRodaje() {
    }

    public OrdenRodaje(int id, Pelicula pelicula,Empleado productor, Empleado director, Empleado directorProd, Hospital hospital, Ubigeo ubigeo, Date fecRodaje, Date horaInicio, Date horaFin, Date horaDesayuno, Date horaAlmuerzo, Date horaAmanecer, Date horaAtardecer, String prevMeteo, int estado) {
        this.id = id;
        this.pelicula = pelicula;
        this.productor = productor;
        this.director = director;
        this.directorProd = directorProd;
        this.hospital = hospital;
        this.ubigeo = ubigeo;
        this.fecRodaje = fecRodaje;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.horaDesayuno = horaDesayuno;
        this.horaAlmuerzo = horaAlmuerzo;
        this.horaAmanecer = horaAmanecer;
        this.horaAtardecer = horaAtardecer;
        this.prevMeteo = prevMeteo;
        this.estado = estado;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Empleado getProductor() {
        return productor;
    }

    public void setProductor(Empleado productor) {
        this.productor = productor;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    public Empleado getDirectorProd() {
        return directorProd;
    }

    public void setDirectorProd(Empleado directorProd) {
        this.directorProd = directorProd;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Ubigeo getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(Ubigeo ubigeo) {
        this.ubigeo = ubigeo;
    }

    public Date getFecRodaje() {
        return fecRodaje;
    }

    public void setFecRodaje(Date fecRodaje) {
        this.fecRodaje = fecRodaje;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public Date getHoraDesayuno() {
        return horaDesayuno;
    }

    public void setHoraDesayuno(Date horaDesayuno) {
        this.horaDesayuno = horaDesayuno;
    }

    public Date getHoraAlmuerzo() {
        return horaAlmuerzo;
    }

    public void setHoraAlmuerzo(Date horaAlmuerzo) {
        this.horaAlmuerzo = horaAlmuerzo;
    }

    public Date getHoraAmanecer() {
        return horaAmanecer;
    }

    public void setHoraAmanecer(Date horaAmanecer) {
        this.horaAmanecer = horaAmanecer;
    }

    public Date getHoraAtardecer() {
        return horaAtardecer;
    }

    public void setHoraAtardecer(Date horaAtardecer) {
        this.horaAtardecer = horaAtardecer;
    }

    public String getPrevMeteo() {
        return prevMeteo;
    }

    public void setPrevMeteo(String prevMeteo) {
        this.prevMeteo = prevMeteo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
