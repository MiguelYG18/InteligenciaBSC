/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataTransferObject;

/**
 *
 * @author MIGUEL
 */
public class CuentaAño {
    private int id_cuenta;
    private int id_año;
    private Cuenta cuenta;
    private Año año;
    private Estado estado;
    private double monto;
    private double monto21;
    private double monto22;
    private String total;
    private double totalActivo;
    private double totalPasivo;


    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public int getId_año() {
        return id_año;
    }

    public void setId_año(int id_año) {
        this.id_año = id_año;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public double getTotalActivo() {
        return totalActivo;
    }

    public void setTotalActivo(double totalActivo21) {
        this.totalActivo = totalActivo21;
    }

    public double getTotalPasivo() {
        return totalPasivo;
    }

    public void setTotalPasivo(double totalPasivo21) {
        this.totalPasivo = totalPasivo21;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }



    
    
    
    
}
