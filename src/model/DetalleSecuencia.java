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
public class DetalleSecuencia {
    private int id;
    private OrdenRodaje ordenRodaje;
    private int numSecuencia;
    private int paginas;
    private String decorado;
    private String ext_int; // parece exterior o interior
    private String d_n; // d o n
    private Ubigeo ubigeo;
    private List<Empleado> empleados;

    public DetalleSecuencia() {
    }

    public DetalleSecuencia(int id, OrdenRodaje ordenRodaje, int numSecuencia, int paginas, String decorado, String ext_int, String d_n, Ubigeo ubigeo) {
        this.id = id;
        this.ordenRodaje = ordenRodaje;
        this.numSecuencia = numSecuencia;
        this.paginas = paginas;
        this.decorado = decorado;
        this.ext_int = ext_int;
        this.d_n = d_n;
        this.ubigeo = ubigeo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrdenRodaje getOrdenRodaje() {
        return ordenRodaje;
    }

    public void setOrdenRodaje(OrdenRodaje ordenRodaje) {
        this.ordenRodaje = ordenRodaje;
    }

    public int getNumSecuencia() {
        return numSecuencia;
    }

    public void setNumSecuencia(int numSecuencia) {
        this.numSecuencia = numSecuencia;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getDecorado() {
        return decorado;
    }

    public void setDecorado(String decorado) {
        this.decorado = decorado;
    }

    public String getExt_int() {
        return ext_int;
    }

    public void setExt_int(String ext_int) {
        this.ext_int = ext_int;
    }

    public String getD_n() {
        return d_n;
    }

    public void setD_n(String d_n) {
        this.d_n = d_n;
    }

    public Ubigeo getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(Ubigeo ubigeo) {
        this.ubigeo = ubigeo;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    
}
