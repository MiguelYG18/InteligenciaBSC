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
    private Cuenta cuenta;
    private double monto;
    private double monto21;
    private double monto22; 
    
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

    public double getMonto21() {
        return monto21;
    }

    public void setMonto21(double monto21) {
        this.monto21 = monto21;
    }

    public double getMonto22() {
        return monto22;
    }

    public void setMonto22(double monto22) {
        this.monto22 = monto22;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    
}
