/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author harum
 */

public class Cuenta {
    private String noDeCuenta;
    private double saldo_actual;
    private String moneda;

    public Cuenta(String noDeCuenta, double saldo_actual, String moneda) {
        this.noDeCuenta = noDeCuenta;
        this.saldo_actual = saldo_actual;
        this.moneda = moneda;
    }

    public String getNoDeCuenta() {
        return noDeCuenta;
    }

    public void setNoDeCuenta(String noDeCuenta) {
        this.noDeCuenta = noDeCuenta;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(double saldo_actual) {
        this.saldo_actual = saldo_actual;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
}