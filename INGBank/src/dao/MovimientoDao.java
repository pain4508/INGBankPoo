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
import logica.MovimientoLogica;
import logica.TipoCuentaLogica;

/**
 *
 * @author griselda
 */
public class MovimientoDao {
    
        private final Connection cnc;
    public MovimientoDao() throws SQLException {
        this.cnc = conexion.conectarI();
    }  
    
 public List<MovimientoLogica>getComboMov() throws SQLException{
     
      String sql = "Select * from Movimiento ";
      
      List<MovimientoLogica> miComboMov;
      
      try(PreparedStatement st =  cnc.prepareStatement(sql);
       ResultSet rs = st.executeQuery()){
       
          miComboMov = new ArrayList<>();
          while(rs.next()){
              MovimientoLogica c2 = new  MovimientoLogica();
              c2.setIdMovimiento(rs.getInt("IdMovimiento"));
              c2.setMovimiento(rs.getString("Movimiento"));
              miComboMov.add(c2);
              
          }
      }      
  return miComboMov;
  }
}
