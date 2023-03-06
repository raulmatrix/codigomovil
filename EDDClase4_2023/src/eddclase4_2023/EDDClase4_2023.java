
package eddclase4_2023;

public class EDDClase4_2023 {

    
    public static void main(String[] args) {
       saludar();
       System.out.println("El factorial de 5 es: "+factorial(5));
        
    }
    
    //funciones
    //esta funcion saluda sin devolucion de datos
    public static void saludar(){
        System.out.println("Hola Mundo");
    }
    
    public static int factorial(int numero){
        int resul=1;
        for(int i=numero;i>1;i--){
            resul=resul*i;
        }
        
        return resul;
    }
    
}
