package eddclase2_2023;

//import java.util.Random;
import java.util.Random;
public class EDDClase2_2023 {

    public static void main(String[] args) {
        
        int dado1 = 6;
        int dado2 = 6;
        int dado3 = 6;
        
        if(dado1==6&&dado2==6&&dado3==6){
            System.out.println("Excelente");
        }else if((dado1==6)&&(dado2==6)||(dado1==6)&&(dado3==6)||(dado2==6)&&(dado3==6)){
            System.out.println("Muy Bien");
        }else if(dado1==6||dado2==6||dado3==6){
            System.out.println("Regular");
        }else{
            System.out.println("Pesimo");
        }
        
        


/*
    int[] dados = new int[3];
    Random rand = new Random();

    // Lanzamiento de los tres dados
    for (int i = 0; i < 3; i++) {
      dados[i] = rand.nextInt(6) + 1;
      System.out.println("Dado " + (i+1) + ": " + dados[i]);
    }

    // Verificación del puntaje obtenido
    if (dados[0] == 6 && dados[1] == 6 && dados[2] == 6) {
      System.out.println("Excelente");
    } else if ((dados[0] == 6 && dados[1] == 6) || (dados[0] == 6 && dados[2] == 6) || (dados[1] == 6 && dados[2] == 6)) {
      System.out.println("Muy bien");
    } else if (dados[0] == 6 || dados[1] == 6 || dados[2] == 6) {
      System.out.println("Regular");
    } else {
      System.out.println("Pésimo");
    }
*/

//optimizacion de codigo




  }


        
}
    

