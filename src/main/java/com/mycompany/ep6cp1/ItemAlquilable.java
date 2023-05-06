/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ep6cp1;

import java.time.LocalDate;

/**
 *
 * @author Gonzalo
 */
public abstract class ItemAlquilable {
    private LocalDate Alquiler;
    private LocalDate Devolucion;
    private Cliente x;
    
    
    public boolean vencido(){
        return LocalDate.now().isAfter(Devolucion);
    }
    
   public abstract boolean alquilar();
   public abstract boolean devolver();
}
