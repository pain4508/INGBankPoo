/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import logica.ClienteLogica;
import logica.CuentaLogica;



/**
 *
 * @author junio
 */
public class CuentaDao {
    
     private final Connection cnc;
    public CuentaDao() throws SQLException {
        this.cnc = conexion.conectarI();
        
    }
 public void insertarCuenta(CuentaLogica c1) throws SQLException{
       //Preparar la consulta 
       String sql= "Insert into Cuenta(IdCuenta,IdCliente,IdTipoCuenta,Saldo,Fecha_de_Creacion) "
                +"Values(?,?,?,?,?) ";
       try (PreparedStatement st =(PreparedStatement) cnc.prepareStatement(sql)){
           
            st.setInt(1, c1.getIdCuenta());
            st.setInt(2, c1.getIdCliente());
            st.setInt(3, c1.getIdTipoCuenta());
            st.setDouble(4, c1.getSaldo());
            st.setString(5, c1.getFecha_de_Creacion());
            st.execute();
       } 
   }  
 public void modificarCuenta(CuentaLogica c1) throws SQLException{
       //Preparar la consulta 
       String sql="UPDATE Cuenta SET IdCliente=?, IdTipoCuenta=?, Saldo=?, Fecha_de_Creacion=? "
                    + "WHERE IdCuenta=?";
       
       try (PreparedStatement st =(PreparedStatement) cnc.prepareStatement(sql)){
             
           st.setInt(1, c1.getIdCliente());
           st.setInt(2, c1.getIdTipoCuenta());
           st.setDouble(3, c1.getSaldo());
           st.setString(4, c1.getFecha_de_Creacion());
           st.setInt(5, c1.getIdCuenta());
           st.executeUpdate();
   }catch(SQLException e)
   {
       JOptionPane.showMessageDialog(null, e);
   }
}
 public void eliminarCuenta(CuentaLogica c1) throws SQLException{
       //Preparar la consulta 
       String sql="Delete "
                +"From Cuenta "
                +"Where IdCuenta = ? ";
       
       try (PreparedStatement st = cnc.prepareStatement(sql)){
            st.setInt(1, c1.getIdCuenta());
            st.execute();
       } 
   } 
   public List<CuentaLogica>getLista() throws SQLException{
     
      String sql = "Select * from Cuenta";
      
      List<CuentaLogica>miLista;
      
      try(PreparedStatement st =  cnc.prepareStatement(sql);
       ResultSet rs = st.executeQuery()){
       
          miLista = new ArrayList<>();
          while(rs.next()){
              CuentaLogica c1 = new  CuentaLogica();
              c1.setIdCuenta(rs.getInt("IdCuenta"));
              c1.setIdCliente(rs.getInt("IdCliente"));
              c1.setIdTipoCuenta(rs.getInt("IdTipoCuenta"));
              c1.setSaldo(rs.getDouble("Saldo"));
              c1.setFecha_de_Creacion(rs.getString("Fecha_de_Creacion"));
              miLista.add(c1);
              
          }
      }      
  return miLista;
  }
   
      public int autoIncrementar() throws SQLException{
        int cuentaId = 0;
        
        String sql = "Select max(LAST_INSERT_ID(IdCuenta)) + 1 as IdCuenta "
                 +"From Cuenta ";
        
        Statement st = cnc.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.first();
        cuentaId = rs.getInt("IdCuenta");
        if(cuentaId == 0){
            cuentaId = 1;
        }
        return cuentaId;
    }
      public void retirarSaldo(CuentaLogica c1, double monto) throws SQLException{
        
        String sql="UPDATE Cuenta SET Saldo = Saldo - ? "
                    + "WHERE IdCuenta=?";
       
       try (PreparedStatement st =(PreparedStatement) cnc.prepareStatement(sql)){
             
           st.setDouble(1, monto);
           st.setInt(2, c1.getIdCuenta());
           st.executeUpdate();
           
       }
    }
      public void depositarSaldo(CuentaLogica c1, double monto) throws SQLException{
        
        String sql="UPDATE Cuenta SET Saldo = Saldo + ? "
                    + "WHERE IdCuenta=?";
       
       try (PreparedStatement st =(PreparedStatement) cnc.prepareStatement(sql)){
             
           st.setDouble(1, monto);
           st.setInt(2, c1.getIdCuenta());
           st.executeUpdate();
           
       }
    }
      public double getSaldo(int idcuenta) throws SQLException{
        
        double saldo = 0;
        String sql = "SELECT saldo "
                 +"FROM cuenta "
                 +"WHERE idcuenta = ? ";
        try (PreparedStatement st =(PreparedStatement) cnc.prepareStatement(sql)){
            st.setInt(1, idcuenta);
            ResultSet rs = st.executeQuery();
            rs.first();
            saldo = rs.getDouble("saldo");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        return saldo;
    }
}
