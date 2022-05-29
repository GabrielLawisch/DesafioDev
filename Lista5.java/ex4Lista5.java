import java.util.Scanner;
/*
Escrever um programa que produza a saída abaixo na tela, para N linhas e usando um caractere lido do teclado (no exemplo, *). Dica: podem ser usados dois comandos de repetição ao mesmo tempo (um dentro do outro).
*
**
***
****
*****
(...)
*/
public class ex4Lista5 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int linhas, contador;
    char caractere;

    System.out.print("Insira o número de linhas: ");
    linhas = entrada.nextInt();
    System.out.print("Insira o caractere que será escrita: ");
    caractere = entrada.next().charAt(0);

    for(int n = 0; n < linhas; n++){
      contador = n;
      while(contador >= 0){
       System.out.print(caractere);
          contador = contador - 1;  
      }
      System.out.println();
    } 

    entrada.close();
  }
}