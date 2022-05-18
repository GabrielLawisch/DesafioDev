import java.util.Scanner;
/*
Criar um algoritmo para ler dois números e verificar se eles são iguais.
*/


class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    //Programe a partir daqui

    float n1, n2;
    
    System.out.print("Qual o primeiro número? ");
    n1 = entrada.nextFloat();
    System.out.print("Qual o segundo número? ");
    n2 = entrada.nextFloat();

    if(n1 == n2){
      System.out.print("Os números são iguais");
    }
    else{
      System.out.print("Os números são diferentes");
    }


    //Programe até aqui.
    entrada.close();
  }
}