/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author harum
 */
public class NodoSE<T> {
    private T dato;

    private NodoSE<T> siguiente;

    // constructores


    public NodoSE(T dato) {
        this.dato = dato;
        this.siguiente=null;
    }


    public NodoSE(T dato,NodoSE<T> pSiguiente) {
        this.dato = dato;
        this.siguiente=pSiguiente;
    }


    //get/set


    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoSE <T> getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(NodoSE<T> pSiguiente){
        siguiente = pSiguiente;
    }
}
