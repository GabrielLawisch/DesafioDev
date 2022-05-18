package lista01;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Programe a partir daqui
    
        float numero;
    
        System.out.print("Qual número deve ser verificado? ");
        numero = entrada.nextFloat();
    
        if(numero < 30){
          System.out.print("O número digitado é menor que 30");
        }
        else{
          System.out.print("O número digitado é maior que 30");
        }
        
        
        
    
        //Programe até aqui.
        entrada.close();
      }
    }
    
