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

    public ArrayList<ActividadAño> buscarActividadAño(int cadena) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
