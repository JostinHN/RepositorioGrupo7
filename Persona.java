package Helpers;

public abstract class Persona {
    // Atributos
    private String nombre;
    private int edad;
    private int identificacion;
    private String lugarTrabajo;
    
    public Persona (){
    // Constructor vacío
    }
    
    // Establecer atributos de la clase Persona 
    public void EstablecerNombre (String nombre){
    this.nombre = nombre;
    }
    
    public void EstablecerEdad (int edad){
    this.edad = edad;
    }
    
    public void EstablecerIdentificacion (int identificacion){
    this.identificacion = identificacion;
    }
    
    public void EstablecerlugarTrabajo (String lugarTrabajo){
    this.lugarTrabajo = lugarTrabajo;
    }
    
    // Obtener atributos de la clase Persona
    public String ObtenerNombre (){
    return this.nombre;
    }
    
    public int ObtenerEdad (){
    return this.edad;
    }
    
    public int ObtenerIdentificacion (){
    return this.identificacion;
    }
    
    public String ObtenerlugarTrabajo (){
    return this.lugarTrabajo;
    }
    
    // Impresión de datos ingresados en las subclases
    public void imprimir (){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Identificacion: " + identificacion);   
        System.out.println("Lugar de trabajo: " + lugarTrabajo);
    }
    
    // Dato extra que obtiene la Profesión, para aplicar el polimorfismo
    abstract String ObtenerDatosProfesion ();
}
