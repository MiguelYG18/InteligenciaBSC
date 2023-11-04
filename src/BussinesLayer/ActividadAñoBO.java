/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BussinesLayer;
import DataAccesLayer.ActividadAñoDAO;
import DataTransferObject.ActividadAño;
import java.util.ArrayList;

/**
 *
 * @author MIGUEL
 */
public class ActividadAñoBO {
    public ArrayList<ActividadAño> buscarActividadAño(String a) throws Exception{  
        
        try {
            ActividadAñoDAO actividadAño = new ActividadAñoDAO();
            return actividadAño.buscarActividadAño(a);
        } catch (Exception e) {
            throw e;
        }        
    }     
    public ArrayList<ActividadAño> buscarActividadTodo() throws Exception{  
        
        try {
            ActividadAñoDAO actividadAño = new ActividadAñoDAO();
            return actividadAño.buscarActvidadTodo();
        } catch (Exception e) {
            throw e;
        }        
    }
    public ArrayList<ActividadAño> buscarActividad21() throws Exception{  
        
        try {
            ActividadAñoDAO actividadAño = new ActividadAñoDAO();
            return actividadAño.buscarActvidad21();
        } catch (Exception e) {
            throw e;
        }        
    }  
    public ArrayList<ActividadAño> buscarActividad22() throws Exception{  
        
        try {
            ActividadAñoDAO actividadAño = new ActividadAñoDAO();
            return actividadAño.buscarActvidad22();
        } catch (Exception e) {
            throw e;
        }        
    }      
    public ArrayList<ActividadAño> RazonActividad() throws Exception{  
        
        try {
            ActividadAñoDAO actividadAño = new ActividadAñoDAO();
            return actividadAño.RazonActividad();
        } catch (Exception e) {
            throw e;
        }        
    }
    public ArrayList<ActividadAño> CuentasporCobrar() throws Exception{  
        
        try {
            ActividadAñoDAO actividadAño = new ActividadAñoDAO();
            return actividadAño.CuentasporCobrar();
        } catch (Exception e) {
            throw e;
        }        
    }     
}
