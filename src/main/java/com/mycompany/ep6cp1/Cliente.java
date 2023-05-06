/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ep6cp1;

import java.util.ArrayList;



/**
 *
 * @author Gonzalo
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private int id;
    private ArrayList <ItemAlquilable> item;

    public Cliente(String nombre, String apellido, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        item=new ArrayList <ItemAlquilable>();
    }
    
    
}
