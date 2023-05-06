/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ep6cp1;

/**De los vehículos, se registra marca, kms
y patente. Los vehículos pueden ser eléctricos, nafteros o diesel
 *
 * @author Gonzalo
 */
public class Auto extends ItemAlquilable{
    private String marca;
    private int kms;
    private String patente;
    private String tipoCombustible;
    private boolean alquilado;

    public Auto(String marca, int kms, String patente, String tipoCombustible) {
        this.marca = marca;
        this.kms = kms;
        this.patente = patente;
        this.tipoCombustible = tipoCombustible;
        alquilado=false;
    }

    public String getPatente() {
        return patente;
    }
    public boolean alquilar(){
       if(!alquilado){
           alquilado=true;
       } 
       return false;
    }
    public boolean devolver(){
        alquilado=false;
        return true;
    }
    

}
