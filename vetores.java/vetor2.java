import java.util.Scanner;
/*
Monte um programa que leia 8 números inteiros positivos e os armazene em um vetor. Mostre todos os números pares armazenados no vetor.
*/

class vetor2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numeros[];
        numeros = new int[8];

        for(int n = 0; n < 8; n++){
            System.out.print("Informe número " + (n+1) + ": ");
            numeros[n] = entrada.nextInt();
          }

        for(int n = 0; n < 8; n++){
            if((numeros[n] % 2) == 0) {
                System.out.print(numeros[n] + " ");
          }
        }

          entrada.close();

    }
  }