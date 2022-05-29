import java.util.Scanner;
/*
Faça um programa gere a letra da música: “1 elefante incomoda muita gente, 2 elefantes incomodam, incomodam muito mais, 3 elefantes incomodam muita gente, 4 elefantes incomodam, incomodam, incomodam, incomodam muito mais...”, com o número de final de elefantes fornecido pelo usuário. 
*/

public class ex3Lista5 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int elefantes, nElefantes;

    System.out.print("Informe o número de elefantes: ");
    elefantes = entrada.nextInt();

    System.out.print("1 elefante incomoda muita gente, ");

    for(int n = 2; n <= elefantes; n++){
    nElefantes = n;
    if(n % 2 == 1){
      System.out.print(n + " elefantes incomodam muita gente, ");
    }else{
      System.out.print(n);
      while(nElefantes >= 0)
      if(nElefantes == 0){
      System.out.print(" muito mais, ");
      nElefantes = nElefantes - 1;
    }else{
      System.out.print(" incomodam,");
      nElefantes = nElefantes - 1;
    }
   }
 }
    

    entrada.close();
    }
}