/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ep6cp1;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Gonzalo
 */
public class Sistema {
    ArrayList <Cliente> clientes;
    ArrayList <ItemAlquilable> items;

    public Sistema() {
        clientes=new ArrayList <Cliente>();
        items=new ArrayList <ItemAlquilable>();
    }
    
    public void setFechas(LocalDate x, LocalDate c){
        
    }
    
     public String Alquilar(ItemAlquilable x){
        if(x.alquilar()){
            return "Se alquiló con exito";
        }
        return "No hay Stock";
         }
     
     public void add(ItemAlquilable x){
         items.add(x);
     }
     public void addCliente(Cliente x){
         clientes.add(x);
     }
    
}
