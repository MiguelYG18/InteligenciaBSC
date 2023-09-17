/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccesLayer;
import Connection.UConnection;
import DataTransferObject.Cuenta;
import DataTransferObject.CuentaAño;
import DataTransferObject.Año;
import DataTransferObject.Estado;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author MIGUEL
 */
public class CuentaAñoDAO {
    public ArrayList<CuentaAño> buscarCuentad(String estado) throws Exception{
     
        ArrayList<CuentaAño>cuentaAños=new ArrayList<>();
        CuentaAño cuentaAño=null;
        Año año=null;
        Cuenta cuentas=null;
        Estado estados=null;
        Connection con=null;
        CallableStatement cstm = null;  
        ResultSet rs=null;
        
        try {            
            con=UConnection.getConnection();
            String sql="";            
            sql="call sp_cuenta_listar_I(?)";
            cstm=con.prepareCall(sql);
            cstm.setString(1, estado);
            
            rs=cstm.executeQuery(); //se puede usar .execute() para todas las operaciones         
            
            while(rs.next()){
                cuentaAño = new CuentaAño();           
                año = new Año();
                cuentas=new Cuenta();
                estados=new Estado();
                
                estados.setNombre_estado(rs.getString("nombre_estado"));
                cuentas.setNombre_cuenta(rs.getString("nombre_cuenta"));
                cuentaAño.setMonto21(rs.getDouble("Año 2021"));
                
                cuentaAño.setAño(año);
                cuentaAño.setCuenta(cuentas);
                cuentaAño.setEstado(estados);
                        
                cuentaAños.add(cuentaAño);
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
        return cuentaAños;     
     }
    public ArrayList<CuentaAño> buscarCuentad22(String estado) throws Exception{
     
        ArrayList<CuentaAño>cuentaAños=new ArrayList<>();
        CuentaAño cuentaAño=null;
        Año año=null;
        Cuenta cuentas=null;
        Estado estados=null;
        Connection con=null;
        CallableStatement cstm = null;  
        ResultSet rs=null;
        
        try {            
            con=UConnection.getConnection();
            String sql="";            
            sql="call sp_cuenta_listar_II(?)";
            cstm=con.prepareCall(sql);
            cstm.setString(1, estado);
            
            rs=cstm.executeQuery(); //se puede usar .execute() para todas las operaciones         
            
            while(rs.next()){
                cuentaAño = new CuentaAño();           
                año = new Año();
                cuentas=new Cuenta();
                estados=new Estado();
                
                estados.setNombre_estado(rs.getString("nombre_estado"));
                cuentas.setNombre_cuenta(rs.getString("nombre_cuenta"));
                cuentaAño.setMonto21(rs.getDouble("Año 2022"));
                
                cuentaAño.setAño(año);
                cuentaAño.setCuenta(cuentas);
                cuentaAño.setEstado(estados);
                        
                cuentaAños.add(cuentaAño);
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
        return cuentaAños;     
     }        
}
