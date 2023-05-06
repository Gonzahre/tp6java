/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ep6cp1;

/**Para evitar convertirse en un nuevo Blockbuster, un videoclub de barrio ha decidido
diversificarse e incorporar a su cartera de negocios el alquiler de autos. Para modernizarse,
abandonará los registros en papel e implementará un sistema unificado de alquiler. El sistema
debe permitir alquilar un determinado ítem a un cliente hasta una fecha determinada y llevar
control de los ítems alquilados a cada cliente. Las películas poseen información filmográfica
y la cantidad de copias que se dispone de la misma. De los vehículos, se registra marca, kms
y patente. Los vehículos pueden ser eléctricos, nafteros o diesel. Una película puede ser
alquilada si hay copias aún disponibles, mientras que los vehículos sólo pueden ser alquilados
a un cliente por vez.
Se debe proveer además la funcionalidad necesaria para permitir conocer quiénes son los
clientes que poseen alquileres vencidos.

 *
 * @author Gonzalo
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String nombre="", apellido="";
        int id=0;
        String letra="";
        Scanner leer=new Scanner(System.in);
        Pelicula primer=new Pelicula("Star Wars", 2);
        Auto toyota=new Auto("Corolla", 5689, "AA 068 WA", "Nafta");
        Sistema system=new Sistema();
        system.add(toyota);
        system.add(primer);
        
        
       
    
        while(!letra.equals("s")){
                
              System.out.println("Precione 1 para consultar o 0 para alquilar");
              System.out.println("Ingrese el nombre del Cliente");
               nombre=leer.nextLine();
              System.out.println("Ingrese el Apellido del Cliente");
              apellido=leer.nextLine();
               System.out.println("Ingrese el id del Cliente");
               id=leer.nextInt();
               Cliente p1=new Cliente(nombre, apellido, id);
               system.addCliente(p1);
               System.out.println("Que desea alquilar? 1.Toyota. 2.Star Wars");
               id=leer.nextInt();
               if(id==1){
                   System.out.println(system.Alquilar(toyota));
               }
               else if(id==2){
                   System.out.println(system.Alquilar(primer));
               }
              System.out.println("Ingrese s para salir, cualquier otra letra para seguir");
              letra=leer.nextLine();
           
        }
      
    }
}
