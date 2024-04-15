/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author harum
 */
public class Cliente {
    protected String nidentidad;
    protected String nombreCompleto;
    protected char sexo;
    protected String edad;

    protected ListaSE<Cuenta> cuentas;

    //constructor
    public Cliente(String nidentidad, String nombreCompleto, char sexo, String edad ){
        this.nidentidad = nidentidad;
        this.nombreCompleto = nombreCompleto;
        this.sexo = sexo;
        this.edad = edad;
        this.cuentas = new ListaSE<Cuenta>();
    }
    public void adicionarCuenta(Cuenta c){
        cuentas.Agregar(c);
    }
    public void eliminarCuenta(int pos){
        cuentas.Eliminar(pos);
    }
    //getters and setters
    public String getNidentidad() {
        return nidentidad;
    }

    public void setNidentidad(String nidentidad) {
        this.nidentidad = nidentidad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public ListaSE<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ListaSE<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
}