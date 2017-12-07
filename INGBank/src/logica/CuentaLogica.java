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

    public double getSaldoDepositado() {
        return saldoDepositado;
    }

    public void setSaldoDepositado(double saldoDepositado) {
        this.saldoDepositado = saldoDepositado;
    }
    
    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = this.saldo + this.saldoDepositado;
    }
    

    public int getIdCuenta() {
        return IdCuenta;
    }

    public void setIdCuenta(int IdCuenta) {
        this.IdCuenta = IdCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
 
    
}
