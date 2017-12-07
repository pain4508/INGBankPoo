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
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
              String sql="UPDATE cuenta "
                +"Set Saldo = ? "
                +"Where IdCuenta = ? ";
              
       try (PreparedStatement st =(PreparedStatement) cnc.prepareStatement(sql)){
            st.setDouble(1, c1.getSaldoActual());
            st.setInt(2, c1.getIdCuenta());
            st.execute();
       } 
   }
    
    public void obtenerSaldo(CuentaLogica c1) throws SQLException{      
        String query = "SELECT saldo "
                       +"FROM cuenta " 
                       +"Where idcuenta = ? ";
        try(PreparedStatement consulta = cnc.prepareStatement(query)){
            consulta.setInt(1, c1.getIdCuenta());
            ResultSet resultado = consulta.executeQuery();
            resultado.first();
            c1.setSaldo(resultado.getDouble("saldo"));
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
