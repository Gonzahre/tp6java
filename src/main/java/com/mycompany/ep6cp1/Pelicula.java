/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ep6cp1;

/**
 *Las películas poseen información filmográfica
y la cantidad de copias que se dispone de la misma
 * @author Gonzalo
 */
public class Pelicula extends ItemAlquilable{
    private String informacionFilmografica;
    private int cantidadCopias;

    public Pelicula(String informacionFilmografica, int cantidadCopias) {
        this.informacionFilmografica = informacionFilmografica;
        this.cantidadCopias=cantidadCopias;
    }

    public void setCantidadCopias(int cantidadCopias) {
        this.cantidadCopias = cantidadCopias;
    }
    
    public boolean alquilar(){
        if(cantidadCopias>0){
            cantidadCopias--;
            return true;
        }
        return false;
    }
    
    public boolean devolver(){
        cantidadCopias++;
        return true;
    }
    
    
}
