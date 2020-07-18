/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

/**
 *
 * @author user
 */
public class Doctor extends Persona {
   
    public Doctor (){
    EstablecerNombre("Axsel Maldonado");
    EstablecerEdad(20);
    EstablecerIdentificacion(60033);
    EstablecerlugarTrabajo("Hospital Nacional");
        
    }

    @Override
    public String ObtenerDatosProfesion() {
        return "Doctor";
    }
   
       
   }
       
       
  
