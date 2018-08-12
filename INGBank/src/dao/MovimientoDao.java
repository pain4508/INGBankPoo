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
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
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

    public void insertarMovimiento(MovimientoLogica m1) throws SQLException {
        //Preparar la consulta 
        String sql = "Insert into Movimiento(IdTipoMovimiento,IdCuentaT,IdCuentaR,Monto) "
                + "Values(?,?,?,?) ";
        try (PreparedStatement st = (PreparedStatement) cnc.prepareStatement(sql)) {

            st.setInt(1, m1.getIdTipoMovimiento());
            st.setInt(2, m1.getIdCuentaT());
            if (m1.getIdCuentaR() == 0) {
                st.setObject(3, null);
            } else {
                st.setInt(3, m1.getIdCuentaR());
            }
            st.setDouble(4, m1.getMonto());
            st.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public int autoIncrementar() throws SQLException {
        int MovimientoId = 0;

        String sql = "Select max(LAST_INSERT_ID(idmovimiento)) + 1 as IdMovimiento "
                + "From Movimiento ";

        Statement st = cnc.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.first();
        MovimientoId = rs.getInt("IdMovimiento");
        if (MovimientoId == 0) {
            MovimientoId = 1;
        }
        return MovimientoId;
    }

    public List<MovimientoLogica> getLista() throws SQLException {

        String sql = "Select * from Movimiento";

        List<MovimientoLogica> miLista;

        try (PreparedStatement st = cnc.prepareStatement(sql);
                ResultSet rs = st.executeQuery()) {

            miLista = new ArrayList<>();
            while (rs.next()) {
                MovimientoLogica m1 = new MovimientoLogica();
                m1.setIdMovimiento(rs.getInt("IdMovimiento"));
                m1.setIdTipoMovimiento(rs.getInt("IdTipoMovimiento"));
                m1.setFecha_Movimiento(rs.getString("Fecha_Movimiento"));
                m1.setIdCuentaT(rs.getInt("IdCuentaT"));
                m1.setIdCuentaR(rs.getInt("IdCuentaR"));
                m1.setMonto(rs.getDouble("Monto"));
                miLista.add(m1);

            }
        }
        return miLista;
    }
}
