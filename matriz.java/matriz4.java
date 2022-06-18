import java.util.*;
/*
Uma matriz quadrada inteira é chamada de "quadrado mágico" se a soma dos elementos de cada linha, a soma dos elementos de cada coluna e a soma dos elementos das diagonais principal e secundária são todos iguais. Exemplo: As matrizes abaixo representam quadrados mágicos: 
   |  8  0   7  |	|  4  9  2 |
   |  4  5   6  |	|  3  5  7 |
   |  3 10   2  |	|  8  1  6 |
Escreva um programa que verifica se uma matriz de 3 linhas e 3 colunas representa um quadrado mágico.
*/



class matriz4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz [][], valorDigitado, somaLinha1, somaLinha2, somaLinha3, somaColuna1, somaColuna2, somaColuna3, somaDiagonalPrincipal, somaDiagonalSecundaria;
        matriz = new int [3][3];

        for(int l = 0; l < 3; l++){
            for(int c = 0; c < 3; c++){
                matriz[l][c] = 0;
        }
    }
        for(int l = 0; l < 3; l++){
            for(int c = 0; c < 3; c++){
                System.out.print("Qual o valor da posição [" + l + "][" + c + "]? ");
                valorDigitado = entrada.nextInt();
                matriz[l][c] = valorDigitado;
        }
    }
    for(int l = 0; l < 3; l++){
        for(int c = 0; c < 3; c++){
            System.out.print(matriz[l][c] + "\t");
        }
        System.out.println();
    }     

        somaLinha1 = matriz[0][0] + matriz[0][1] + matriz[0][2];
        somaLinha2 = matriz[1][0] + matriz[1][1] + matriz[1][2];
        somaLinha3 = matriz[2][0] + matriz[2][1] + matriz[2][2];
        somaColuna1 = matriz[0][0] + matriz[1][0] + matriz[2][0];
        somaColuna2 = matriz[0][1] + matriz[1][1] + matriz[2][1];
        somaColuna3 = matriz[0][2] + matriz[1][2] + matriz[2][2];
        somaDiagonalPrincipal = matriz[0][0] + matriz[1][1] + matriz[2][2];
        somaDiagonalSecundaria = matriz[0][2] + matriz[1][1] + matriz[2][0];

        if(somaLinha1 == somaLinha2 && somaLinha1 == somaLinha3 && somaLinha1 == somaColuna1 && somaLinha1 == somaColuna2 && somaLinha1 == somaColuna3 && somaLinha1 == somaDiagonalPrincipal && somaLinha1 == somaDiagonalSecundaria){
            System.out.println("A matriz é um quadrado mágico.");
        }else{
            System.out.println("A matriz não é um quadrado mágico.");
        }

      entrada.close();
    }
  }