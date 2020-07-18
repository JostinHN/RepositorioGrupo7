package Helpers;

public class Deportista extends Persona{
 
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