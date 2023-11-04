/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BussinesLayer;
import DataAccesLayer.CuentaAñoDAO;
import DataTransferObject.CuentaAño;
import java.util.ArrayList;
/**
 *
 * @author MIGUEL
 */
public class CuentaAñoBO {
    public ArrayList<CuentaAño> buscarCuenta() throws Exception{  
        
        try {
            CuentaAñoDAO cuentaAño = new CuentaAñoDAO();
            return cuentaAño.buscarCuentad();
        } catch (Exception e) {
            throw e;
        }        
    }     
    public ArrayList<CuentaAño> buscarCuenta22() throws Exception{  
        
        try {
            CuentaAñoDAO cuentaAño = new CuentaAñoDAO();
            return cuentaAño.buscarCuentad22();
        } catch (Exception e) {
            throw e;
        }        
    }
    public ArrayList<CuentaAño> buscarCuentaTodo() throws Exception{  
        
        try {
            CuentaAñoDAO cuentaAño = new CuentaAñoDAO();
            return cuentaAño.buscarCuentadTodo();
        } catch (Exception e) {
            throw e;
        }        
    }
    public ArrayList<CuentaAño> buscarTotalActivoPasivo21() throws Exception{  
        
        try {
            CuentaAñoDAO cuentaAño = new CuentaAñoDAO();
            return cuentaAño.buscarTotalActivoPasivo21();
        } catch (Exception e) {
            throw e;
        }        
    }
    public ArrayList<CuentaAño> buscarTotalActivoPasivo22() throws Exception{  
        
        try {
            CuentaAñoDAO cuentaAño = new CuentaAñoDAO();
            return cuentaAño.buscarTotalActivoPasivo22();
        } catch (Exception e) {
            throw e;
        }        
    }
    public ArrayList<CuentaAño> RazonLiquidez() throws Exception{  
        
        try {
            CuentaAñoDAO cuentaAño = new CuentaAñoDAO();
            return cuentaAño.RazonLiquidez();
        } catch (Exception e) {
            throw e;
        }        
    }
    public ArrayList<CuentaAño> RazonRentabilidad() throws Exception{  
        
        try {
            CuentaAñoDAO cuentaAño = new CuentaAñoDAO();
            return cuentaAño.RazonRentabilidad();
        } catch (Exception e) {
            throw e;
        }        
    }
    public ArrayList<CuentaAño> IngresoActividades() throws Exception{  
        
        try {
            CuentaAñoDAO cuentaAño = new CuentaAñoDAO();
            return cuentaAño.IngresoActividades();
        } catch (Exception e) {
            throw e;
        }        
    }     
}
