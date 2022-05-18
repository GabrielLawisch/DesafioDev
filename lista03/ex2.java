package lista01;

import java.util.Scanner;
/*
Criar um algoritmo para verificar se um número lido é maior ou igual a 50.
*/


class ex2 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    //Programe a partir daqui
    
    float numero;

    System.out.print("Qual número deve ser verificado? ");
    numero = entrada.nextFloat();

    if(numero >= 50){
      System.out.print("O número digitado é maior ou igual a 50");
    }
    else{
      System.out.print("O número digitado não é maior ou igual a 50");
    }

    //Programe até aqui.
    entrada.close();
  }
}