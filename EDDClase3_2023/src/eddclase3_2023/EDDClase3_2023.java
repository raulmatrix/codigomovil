package eddclase3_2023;

public class EDDClase3_2023 {

    public static void main(String[] args) {
        
        int fila = 5;
        int col = 5;
        
        for(int i=1;i<=fila;i++){
            for(int j=1;j<=col;j++){
                if(j==col){
                System.out.print(i*j+"");
                }else{
                    System.out.print(i*j+"-");
                }
            }
            System.out.println("");
        
        }
    }
    
}
