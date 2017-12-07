/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import dao.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author junio
 */
public class CuentaLogica {
    private int IdCuenta;
    private double saldo;
    private double saldoDepositado;
    private double saldoActual;
     public int getIdCuenta() {
        return IdCuenta;
    }

    public void setIdCuenta(int IdCuenta) {
        this.IdCuenta = IdCuenta;
    }
    
    public double getSaldoDepositado() {
        return saldoDepositado;
    }

    public void setSaldoDepositado(double saldoDepositado) {
        this.saldoDepositado = saldoDepositado;
    }
    
       public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
 

    public double setSaldoActual(double saldo,double saldoDepositado) {
        return saldo + saldoDepositado;
    }
    
}
