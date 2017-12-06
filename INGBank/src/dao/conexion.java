/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author griselda
 */
public class conexion {
    static Statement Sentencia;
    static ResultSet Resultado; 
    public static Connection conectarI() throws SQLException{
    try {
        Class.forName("com.mysql.jdbc.Driver");
<<<<<<< HEAD
        return DriverManager.getConnection("jdbc:mysql://localhost/ingbank","root","9654654602");
=======
        return DriverManager.getConnection("jdbc:mysql://localhost/ingbank","root","Ez58K12FizZ21");
>>>>>>> ea9f06b7a6a1dfc4397db94f37839493db471b37
      
    } catch (ClassNotFoundException e) {
        throw new SQLException(e.getMessage());
    }
} 
}
