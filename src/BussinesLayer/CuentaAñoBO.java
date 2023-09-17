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
    public ArrayList<CuentaAño> buscarCuenta(String estado) throws Exception{  
        
        try {
            CuentaAñoDAO cuentaAño = new CuentaAñoDAO();
            return cuentaAño.buscarCuentad(estado);
        } catch (Exception e) {
            throw e;
        }        
    }     
    public ArrayList<CuentaAño> buscarCuenta22(String estado) throws Exception{  
        
        try {
            CuentaAñoDAO cuentaAño = new CuentaAñoDAO();
            return cuentaAño.buscarCuentad22(estado);
        } catch (Exception e) {
            throw e;
        }        
    }     
}
