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
public class DetalleEquipoTecnico {
    private OrdenRodaje ordenRodaje;
    private Empleado empleado;
    private String citacion;
    private Puesto puesto;

    public DetalleEquipoTecnico() {
    }

    public DetalleEquipoTecnico(OrdenRodaje ordenRodaje, Empleado empleado, String citacion, Puesto puesto) {
        this.ordenRodaje = ordenRodaje;
        this.empleado = empleado;
        this.citacion = citacion;
        this.puesto = puesto;
    }

    public OrdenRodaje getOrdenRodaje() {
        return ordenRodaje;
    }

    public void setOrdenRodaje(OrdenRodaje ordenRodaje) {
        this.ordenRodaje = ordenRodaje;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getCitacion() {
        return citacion;
    }

    public void setCitacion(String citacion) {
        this.citacion = citacion;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }
}
