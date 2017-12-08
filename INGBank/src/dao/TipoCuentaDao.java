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
import logica.TipoCuentaLogica;

/**
 *
 * @author griselda
 */
public class TipoCuentaDao {
       private final Connection cnc;
    public TipoCuentaDao() throws SQLException {
        this.cnc = conexion.conectarI();
        
}
  public List<TipoCuentaLogica>getComboTipoC() throws SQLException{
     
      String sql = "Select * from TipoCuenta ";
      
      List<TipoCuentaLogica>miComboTipoCuenta;
      
      try(PreparedStatement st =  cnc.prepareStatement(sql);
       ResultSet rs = st.executeQuery()){
       
          miComboTipoCuenta = new ArrayList<>();
          while(rs.next()){
              TipoCuentaLogica c2 = new  TipoCuentaLogica();
              c2.setIdTipoCuenta(rs.getInt("IdTipoCuenta"));
              c2.setTipoCuenta(rs.getString("TipoCuenta"));
              miComboTipoCuenta.add(c2);
              
          }
      }      
  return miComboTipoCuenta;
  }
  public List<ClienteLogica>getComboCliente() throws SQLException{
     
      String sql = "Select * from Cliente ";
      
      List<ClienteLogica> miComboCliente;
      
      try(PreparedStatement st =  cnc.prepareStatement(sql);
       ResultSet rs = st.executeQuery()){
       
          miComboCliente = new ArrayList<>();
          while(rs.next()){
              ClienteLogica c2 = new  ClienteLogica();
              c2.setIdCliente(rs.getInt("IdCliente"));
              c2.setNombres(rs.getString("Nombres"));
              miComboCliente.add(c2);
              
          }
      }      
  return miComboCliente;
  }
}