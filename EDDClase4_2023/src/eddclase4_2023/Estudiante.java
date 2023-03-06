
package eddclase4_2023;


public class Estudiante {
    //atributos
    String nombre;
    String apellido;
    String sexo;
    int edad;
    String codEst;
    String carrera;
    
    
    public Estudiante(String nombre, String apellido, String codEst){
        this.nombre = nombre;
        this.apellido = apellido;
        this.codEst = codEst;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    
    
}
