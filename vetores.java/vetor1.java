import java.util.Scanner;
/*
Monte um programa que leia 10 números inteiros positivos e os armazene em um vetor. Exiba o vetor na tela na ordem em que foram digitados.
*/

class vetor1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numeros[];
        numeros = new int[10];

        for(int n = 0; n < 10; n++){
            System.out.print("Informe número " + (n+1) + ": ");
            numeros[n] = entrada.nextInt();
          }

        for(int n = 0; n < 10; n++){
            System.out.print(numeros[n] + " ");
          }

          entrada.close();

    }
  }