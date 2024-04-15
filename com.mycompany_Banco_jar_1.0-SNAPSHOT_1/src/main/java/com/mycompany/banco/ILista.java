package com.mycompany.banco;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harum
 */
public interface ILista<T> {
    public int tamanio();
    public boolean EsVacia();
    public T Obtener(int i);
    public void Agregar(T x);
    public void Eliminar (int i);


}

