import java.util.*;
/*
Ler a diagonal principal de uma matriz de 4x4. Preencher os outros valores com 0.
Imprimir a matriz inteira na tela.
*/
class matriz1 {
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
                System.out.print(matriz[l][c] + "\t");
            }
            System.out.println();
        }     
    }
  }