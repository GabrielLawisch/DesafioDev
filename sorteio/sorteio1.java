import java.util.*;
/*
Faça um programa que simule um “dado virtual”. O programa pede ao usuário digitar o número de vezes que o dado será jogado e deve imprimir, para cada vez, a mensagem “O valor sorteado foi” seguido do número sorteado.
*/

class sorteio1 {
  public static void main(String[] args) {
    Random numRand = new Random();
    Scanner entrada = new Scanner(System.in);
    int numSorteio, sorteado;
    
    System.out.print("Quantas vezes deseja rolar o dado? ");
    numSorteio = entrada.nextInt();

    while(numSorteio > 0){
    sorteado = numRand.nextInt(6);
    System.out.println("O valor sorteado foi " + (sorteado + 1));
    numSorteio = numSorteio - 1;
    }

    entrada.close();

  }
}