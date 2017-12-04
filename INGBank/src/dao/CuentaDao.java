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
import java.util.ArrayList;
import java.util.List;
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
    
    public void modificarCuenta(CuentaLogica c1) throws SQLException{
       //Preparar la consulta 
       String sql="Update  cuenta "
                +"Set Saldo = ? "
                +"Where IdCuenta = ? ";
       
       try (PreparedStatement st =(PreparedStatement) cnc.prepareStatement(sql)){
            st.setDouble(1, c1.getSaldo());
            st.setInt(12, c1.getIdCuenta());
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
              CuentaLogica c1 = new CuentaLogica();
              c1.setIdCuenta(rs.getInt("IdCuenta"));
              c1.setSaldo(rs.getDouble("Saldo"));
                  
              miLista.add(c1);
              
          }
      }      
  return miLista;
  }
    
}
