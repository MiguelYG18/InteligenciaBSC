/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccesLayer;


import Connection.UConnection;
import DataTransferObject.Actividad;
import DataTransferObject.ActividadAño;
import DataTransferObject.Año;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author MIGUEL
 */
public class ActividadAñoDAO {
    public ArrayList<ActividadAño> buscarActividadAño(String a) throws Exception{
     
        ArrayList<ActividadAño>actividadAños=new ArrayList<>();
        ActividadAño actividadAño=null;
        Año año=null;
        Actividad actividades=null;
        
        Connection con=null;
        CallableStatement cstm = null;  
        ResultSet rs=null;
        
        try {            
            con=UConnection.getConnection();
            String sql="";            
            sql="call sp_actividad_buscar_por_anio(?)";
            cstm=con.prepareCall(sql);
            cstm.setString(1, a);
         
            rs=cstm.executeQuery(); //se puede usar .execute() para todas las operaciones         
            
            while(rs.next()){
                actividadAño = new ActividadAño();           
                año = new Año();
                actividades=new Actividad();
                
                actividades.setNombre_actividad(rs.getString("nombre_actividad"));
                año.setAño(rs.getString("año"));
                actividadAño.setMonto(rs.getDouble("monto"));
                
                actividadAño.setAño(año);
                actividadAño.setActividad(actividades);
                
                actividadAños.add(actividadAño);
            }
            
        }catch (Exception e) {         
            throw new Exception("Error crítico: Comunicarse con el administrador del sistema");
        }finally{
            try {
                if(rs!=null)rs.close();
                if(cstm!=null)cstm.close();                
            } catch (Exception e) {
            }        
        }        
        return actividadAños;     
     }
    
}
