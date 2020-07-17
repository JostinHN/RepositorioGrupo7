package ProyectoGrupo7;

// Hecho por: Axsel Maldonado (Subclase Doctor)
//            Carlos Cruz (Subclase Deportista)
//            Jostin Tróchez (Clase Persona)
// Programación Orientada a Objetos
// Ejercicio Grupal #1 - Grupo 007
// 17 de julio de 2020

// Importación de clases
import Helpers.Doctor;
import Helpers.Deportista;

public class ClasePrincipal {

    public static void main(String[] args) {
        //Instancia de clase Doctor y Deportista
        Doctor doctor = new Doctor ();
        Deportista deportista = new Deportista ();
        
        // Impresión de datos dados por las subclases
        System.out.println("PROYECTO GRUPAL\n");
           
        System.out.println(doctor.ObtenerDatosProfesion());
        doctor.imprimir ();
        
        System.out.println(deportista.ObtenerDatosProfesion());
        deportista.imprimir ();       
    }  
}