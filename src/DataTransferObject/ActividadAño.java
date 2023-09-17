/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataTransferObject;

/**
 *
 * @author MIGUEL
 */
public class ActividadAño {
    private int id_actividad;
    private int id_año;
    private Actividad actividad;
    private Año año;
    private double monto;

    public int getId_actividad() {
        return id_actividad;
    }

    public void setId_actividad(int id_actividad) {
        this.id_actividad = id_actividad;
    }

    public int getId_año() {
        return id_año;
    }

    public void setId_año(int id_año) {
        this.id_año = id_año;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public Año getAño() {
        return año;
    }

    public void setAño(Año año) {
        this.año = año;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
}
