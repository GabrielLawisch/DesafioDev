import java.util.Scanner;
/*
Crie um programa que leia 6 números decimais e os armazene em um vetor. Exiba o menor valor digitado e em qual posição ele está armazenado.
*/

class vetor3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float menorNumero;
        float numeros[];
        numeros = new float[6];

        for(int n = 0; n < 6; n++){
            System.out.print("Informe número " + (n+1) + ": ");
            numeros[n] = entrada.nextFloat();
          }

        menorNumero = numeros[0];
          for(int n = 1; n < 6; n++){
            if(menorNumero > numeros[n]){
                menorNumero = numeros[n];
            }
        }
            System.out.print("O menor número é: " + menorNumero);

          entrada.close();

    }
  }