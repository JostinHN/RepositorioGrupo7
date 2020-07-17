/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareagrupal;

/**
 *
 * @author Carlos Cruz
 */
public class Deportista extends Persona {
    
  
    public Deportista(){
    EstablecerNombre("Carlos Cruz");
    EstablecerEdad(21);
    EstablecerIdentificacion(50410);
    EstablecerlugarTrabajo("Fútbol Club Barcelona");
        
    }

    @Override
    public String ObtenerDatosProfesion()
    {
        return "\nDeportista";
    }
         
   }   
   

