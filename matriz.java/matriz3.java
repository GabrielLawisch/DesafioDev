/*
Faça um programa que gere através de laços de repetição a seguinte matriz: 

1 2 3 4 3 2 1
2 3 4 5 4 3 2
3 4 5 6 5 4 3
3 4 5 6 5 4 3
2 3 4 5 4 3 2
1 2 3 4 3 2 1

*/

class matriz3 {
    public static void main(String[] args) {
        int matriz [][], contador = 1, valorFixo = -1;
        matriz = new int [6][7];

        for(int l = 0; l < 6; l++){
            for(int c = 0; c < 7; c++){
                matriz[l][c] = 0;
        }
    }

        for(int l = 0; l < 3; l++){
            for(int c = 0; c < 4; c++){
                matriz[l][c] = c + contador;
                }
            contador++;
            }

        contador = 1;

        for(int l = 0; l < 3; l++){
            for(int c = 4; c < 7; c++){
                matriz[l][c] = c - contador;
                contador = contador + 2;
                }
            contador = valorFixo + 1;
            valorFixo = valorFixo - 1;
            }

        contador = 3;
        valorFixo = 3;
        
        for(int l = 3; l < 6; l++){
            for(int c = 0; c < 4; c++){
                matriz[l][c] = contador;
                contador = contador + 1;
                }
            contador = valorFixo - 1;
            valorFixo = valorFixo - 1;
            }

        contador = 1;
        valorFixo = 1;

        for(int l = 3; l < 6; l++){
            for(int c = 4; c < 7; c++){
                matriz[l][c] = c + contador;
                contador = contador - 2;
                }
            contador = valorFixo - 1;
            valorFixo = valorFixo - 1;
            }


            for(int l = 0; l < 6; l++){
                for(int c = 0; c < 7; c++){
                    System.out.print(matriz[l][c] + "\t");
                }
                System.out.println();
            }     

    }
  }