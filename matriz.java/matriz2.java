import java.util.*;
/*
Ler a diagonal principal de uma matriz de 4x4 e preencher as células acima da diagonal principal com 1 e as abaixo com 2.
  */

  class matriz2 {
    public static void main(String[] args) {
        Random gerador = new Random();

        int matriz [][];
        matriz = new int [4][4];

        for(int l = 0; l < 4; l++){
            for(int c = 0; c < 4; c++){
                matriz[l][c] = 0;
    }
}
        for(int l = 0; l < 4; l++){
            for(int c = 0; c < 4; c++){
                if(l == c){
                    matriz[l][c] = gerador.nextInt(101);
                }
            }
        }
        
        for(int l = 0; l < 4; l++){
            for(int c = 0; c < 4; c++){
                if(l < c){
                    matriz[l][c] = 1;
                }
                if(l > c){
                    matriz[l][c] = 2;
                }
            }
        }
        for(int l = 0; l < 4; l++){
            for(int c = 0; c < 4; c++){
                System.out.print(matriz[l][c] + "\t");
            }
            System.out.println();
        }     
    }
  }