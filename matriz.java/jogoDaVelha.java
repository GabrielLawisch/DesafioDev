import java.util.*;

/*
Usando uma matriz 3x3 de caracteres crie um jogo da velha. 
O jogo pode ser jogado por um ou dois jogadores.
O jogador número 1 usa o X e o jogador 2 é representado pelo O. 
O programa deve sortear quem inicia o jogo. O jogador deve indicar a linha e a coluna que quer jogar. Se a casa já estiver ocupada o jogador deve selecionar outra casa. Ganha quem 
fizer uma sequência de símbolos iguais em uma linha, coluna ou diagonal.

*/
class jogoDaVelha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random numRand = new Random();
        int numJogadores=0, v1, v2;
        char matrizInteiros[][];
        matrizInteiros = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizInteiros[i][j] = '_';
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizInteiros[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("Você quer jogar com 1 ou 2 jogadores? ");
        numJogadores = entrada.nextInt();
        int quemInicia = numRand.nextInt(2);
        Boolean jogando = true, ganhar = false;

        if(numJogadores == 1) {
            if(quemInicia == 0) {
                System.out.println("Você começa! Use o X para jogar!");
                while(!ganhar){
                    jogando = true;
                    while(jogando){
                        System.out.print("Digite a coluna e a linha na seguinte formatacao ( %c %l ): ");
                        v1 = entrada.nextInt();
                        v2 = entrada.nextInt();
                        
                        if(matrizInteiros[v2][v1] == '_') {
                            matrizInteiros[v2][v1] = 'X';
                            jogando = false;
                        } else {
                            System.out.println("Casa ocupada!");
                            jogando = true;
                        }
                    }   
                    System.out.print("\n");
                    
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(matrizInteiros[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    System.out.print("\n");

                    // Verifica se ganhou

                    if(matrizInteiros[0][0] == 'X' && matrizInteiros[0][1] == 'X' && matrizInteiros[0][2] == 'X') {
                        System.out.println("Você ganhou!");
                        ganhar = true;
                        break;
                    } else if(matrizInteiros[1][0] == 'X' && matrizInteiros[1][1] == 'X' && matrizInteiros[1][2] == 'X') {
                        System.out.println("Você ganhou!");
                        ganhar = true;
                        break;
                    } else if(matrizInteiros[2][0] == 'X' && matrizInteiros[2][1] == 'X' && matrizInteiros[2][2] == 'X') {
                        System.out.println("Você ganhou!");
                        ganhar = true;
                        break;
                    } else if(matrizInteiros[0][0] == 'X' && matrizInteiros[1][0] == 'X' && matrizInteiros[2][0] == 'X') {
                        System.out.println("Você ganhou!");
                        ganhar = true;
                        break;
                    } else if(matrizInteiros[0][1] == 'X' && matrizInteiros[1][1] == 'X' && matrizInteiros[2][1] == 'X') {
                        System.out.println("Você ganhou!");
                        ganhar = true;
                        break;
                    } else if(matrizInteiros[0][2] == 'X' && matrizInteiros[1][2] == 'X' && matrizInteiros[2][2] == 'X') {
                        System.out.println("Você ganhou!");
                        ganhar = true;
                        break;
                    } else if(matrizInteiros[0][0] == 'X' && matrizInteiros[1][1] == 'X' && matrizInteiros[2][2] == 'X') {
                        System.out.println("Você ganhou!");
                        ganhar = true;
                        break;

                    }
                    //verifical velha
                    if(matrizInteiros[0][0] != '_' && matrizInteiros[0][1] != '_' && matrizInteiros[0][2] != '_' && matrizInteiros[1][0] != '_' && matrizInteiros[1][1] != '_' && matrizInteiros[1][2] != '_' && matrizInteiros[2][0] != '_' && matrizInteiros[2][1] != '_' && matrizInteiros[2][2] != '_') {
                        System.out.println("Deu velha!");
                        ganhar = true;
                        break;
                    }

                    System.out.print("\n");
                    System.out.println("Computador responde...");
                    jogando = true;
                    while(jogando) {
                        int coluna = numRand.nextInt(3);
                        int linha = numRand.nextInt(3);
                        if(matrizInteiros[linha][coluna] == '_') {
                            matrizInteiros[linha][coluna] = 'O';
                            jogando = false;
                        } else {
                            jogando = true;
                        }    
                    }

                    for(int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(matrizInteiros[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    System.out.print("\n");

                    // Verificar se ganhou

                    if(matrizInteiros[0][0] == 'O' && matrizInteiros[0][1] == 'O' && matrizInteiros[0][2] == 'O') {
                        System.out.println("Você perdeu!");
                        ganhar = true;
                        break;
                    } else if(matrizInteiros[1][0] == 'O' && matrizInteiros[1][1] == 'O' && matrizInteiros[1][2] == 'O') {
                        System.out.println("Você perdeu!");
                        ganhar = true;
                        break;
                    } else if(matrizInteiros[2][0] == 'O' && matrizInteiros[2][1] == 'O' && matrizInteiros[2][2] == 'O') {
                        System.out.println("Você perdeu!");
                        ganhar = true;
                        break;
                    } else if(matrizInteiros[0][0] == 'O' && matrizInteiros[1][0] == 'O' && matrizInteiros[2][0] == 'O') {
                        System.out.println("Você perdeu!");
                        ganhar = true;
                        break;
                    } else if(matrizInteiros[0][1] == 'O' && matrizInteiros[1][1] == 'O' && matrizInteiros[2][1] == 'O') {
                        System.out.println("Você perdeu!");
                        ganhar = true;
                        break;
                    } else if(matrizInteiros[0][2] == 'O' && matrizInteiros[1][2] == 'O' && matrizInteiros[2][2] == 'O') {
                        System.out.println("Você perdeu!");
                        ganhar = true;
                        break;
                    } else if(matrizInteiros[0][0] == 'O' && matrizInteiros[1][1] == 'O' && matrizInteiros[2][2] == 'O') {
                        System.out.println("Você perdeu!");
                        ganhar = true;
                        break;

                    }

                    

                } //fim da repetição maior
            } else {
                System.out.println("O computador começa! Use o O para jogar!");
                System.out.println("Computador joga...");
                ganhar = false;
                while(!ganhar){
                    jogando = true;
                    while(jogando) {
                        int coluna = numRand.nextInt(3);
                        int linha = numRand.nextInt(3);
                        if(matrizInteiros[linha][coluna] == '_') {
                            matrizInteiros[linha][coluna] = 'X';
                            jogando = false;
                        } else {
                            jogando = true;
                        }   
                    }
                    System.out.print("\n");

                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(matrizInteiros[i][j] + "\t");
                        }
                        System.out.println();
                    }

                    System.out.print("\n");
                    jogando = true;

                    // Verifica se ganhou
                    if(matrizInteiros[0][0] == 'X' && matrizInteiros[0][1] == 'X' && matrizInteiros[0][2] == 'X') {
                        System.out.println("Você perdeu!");
                        ganhar = true;
                        break;
                    } else if(matrizInteiros[1][0] == 'X' && matrizInteiros[1][1] == 'X' && matrizInteiros[1][2] == 'X') {
                        System.out.println("Você perdeu!");
                        ganhar = true;
                        break;
                    } else if(matrizInteiros[2][0] == 'X' && matrizInteiros[2][1] == 'X' && matrizInteiros[2][2] == 'X') {
                        System.out.println("Você perdeu!");
                        ganhar = true;
                        break;
                    } else if(matrizInteiros[0][0] == 'X' && matrizInteiros[1][0] == 'X' && matrizInteiros[2][0] == 'X') {
                        System.out.println("Você perdeu!");
                        ganhar = true;
                        break;
                    } else if(matrizInteiros[0][1] == 'X' && matrizInteiros[1][1] == 'X' && matrizInteiros[2][1] == 'X') {
                        System.out.println("Você perdeu!");
                        ganhar = true;
                        break;
                    } else if(matrizInteiros[0][2] == 'X' && matrizInteiros[1][2] == 'X' && matrizInteiros[2][2] == 'X') {
                        System.out.println("Você perdeu!");
                        ganhar = true;
                        break;
                    } else if(matrizInteiros[0][0] == 'X' && matrizInteiros[1][1] == 'X' && matrizInteiros[2][2] == 'X') {
                        System.out.println("Você perdeu!");
                        ganhar = true;
                        break;
                    }
                    if(matrizInteiros[0][0] != '_' && matrizInteiros[0][1] != '_' && matrizInteiros[0][2] != '_' && matrizInteiros[1][0] != '_' && matrizInteiros[1][1] != '_' && matrizInteiros[1][2] != '_' && matrizInteiros[2][0] != '_' && matrizInteiros[2][1] != '_' && matrizInteiros[2][2] != '_') {
                        System.out.println("Deu velha!");
                        ganhar = true;
                        break;
                    }
                    System.out.print("\n");
                    jogando = true;
                    while(jogando){
                        System.out.print("Digite a coluna e a linha na seguinte formatacao ( %c %l ): ");
                        v1 = entrada.nextInt();
                        v2 = entrada.nextInt();
                        
                        if(matrizInteiros[v2][v1] == '_') {
                            matrizInteiros[v2][v1] = 'O';
                            jogando = false;
                        } else {
                            System.out.println("Casa ocupada!");
                            jogando = true;
                        }
                    }
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(matrizInteiros[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    System.out.print("\n");


                    // Verifica se ganhou
                    if(matrizInteiros[0][0] == 'O' && matrizInteiros[0][1] == 'O' && matrizInteiros[0][2] == 'O') {
                        System.out.println("Você ganhou!");
                        ganhar = true;
                        break;
                    } else if(matrizInteiros[1][0] == 'O' && matrizInteiros[1][1] == 'O' && matrizInteiros[1][2] == 'O') {
                        System.out.println("Você ganhou!");
                        ganhar = true;
                        break;
                    } else if(matrizInteiros[2][0] == 'O' && matrizInteiros[2][1] == 'O' && matrizInteiros[2][2] == 'O') {
                        System.out.println("Você ganhou!");
                        ganhar = true;
                        break;
                    } else if(matrizInteiros[0][0] == 'O' && matrizInteiros[1][0] == 'O' && matrizInteiros[2][0] == 'O') {
                        System.out.println("Você ganhou!");
                        ganhar = true;
                        break;
                    } else if(matrizInteiros[0][1] == 'O' && matrizInteiros[1][1] == 'O' && matrizInteiros[2][1] == 'O') {
                        System.out.println("Você ganhou!");
                        ganhar = true;
                        break;
                    } else if(matrizInteiros[0][2] == 'O' && matrizInteiros[1][2] == 'O' && matrizInteiros[2][2] == 'O') {
                        System.out.println("Você ganhou!");
                        ganhar = true;
                        break;
                    } else if(matrizInteiros[0][0] == 'O' && matrizInteiros[1][1] == 'O' && matrizInteiros[2][2] == 'O') {
                        System.out.println("Você ganhou!");
                        ganhar = true;
                        break;
                    }

                }

            }
        } else {
            if(quemInicia == 0) {
                System.out.println("O jogador 1 começa! Use o X para jogar!");
                ganhar = false;
                while(!ganhar) {
                    jogando = true;
                    while(jogando){
                        System.out.print("Jogador 1, digite a coluna e a linha na seguinte formatacao ( %c %l ): ");
                        v1 = entrada.nextInt();
                        v2 = entrada.nextInt();
                        
                        if(matrizInteiros[v2][v1] == '_') {
                            matrizInteiros[v2][v1] = 'X';
                            jogando = false;
                        } else {
                            System.out.println("Casa ocupada!");
                            jogando = true;
                        }
                    }
                    
                    System.out.print("\n");
                    jogando = true;
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(matrizInteiros[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    System.out.print("\n");

                    // Verifica se alguem ganhou
                    if(matrizInteiros[0][0] == 'X' && matrizInteiros[0][1] == 'X' && matrizInteiros[0][2] == 'X') {
                            System.out.println("O jogador 1 ganhou!");
                            ganhar = true;
                            break;
                        } else if(matrizInteiros[1][0] == 'X' && matrizInteiros[1][1] == 'X' && matrizInteiros[1][2] == 'X') {
                            System.out.println("O jogador 1 ganhou!");
                            ganhar = true;
                            break;
                        } else if(matrizInteiros[2][0] == 'X' && matrizInteiros[2][1] == 'X' && matrizInteiros[2][2] == 'X') {
                            System.out.println("O jogador 1 ganhou!");
                            ganhar = true;
                            break;
                        } else if(matrizInteiros[0][0] == 'X' && matrizInteiros[1][0] == 'X' && matrizInteiros[2][0] == 'X') {
                            System.out.println("O jogador 1 ganhou!");
                            ganhar = true;
                            break;
                        } else if(matrizInteiros[0][1] == 'X' && matrizInteiros[1][1] == 'X' && matrizInteiros[2][1] == 'X') {
                            System.out.println("O jogador 1 ganhou!");
                            ganhar = true;
                            break;
                        } else if(matrizInteiros[0][2] == 'X' && matrizInteiros[1][2] == 'X' && matrizInteiros[2][2] == 'X') {
                            System.out.println("O jogador 1 ganhou!");
                            ganhar = true;
                            break;
                        } else if(matrizInteiros[0][0] == 'X' && matrizInteiros[1][1] == 'X' && matrizInteiros[2][2] == 'X') {
                            System.out.println("O jogador 1 ganhou!");
                        }
                        if(matrizInteiros[0][0] != '_' && matrizInteiros[0][1] != '_' && matrizInteiros[0][2] != '_' && matrizInteiros[1][0] != '_' && matrizInteiros[1][1] != '_' && matrizInteiros[1][2] != '_' && matrizInteiros[2][0] != '_' && matrizInteiros[2][1] != '_' && matrizInteiros[2][2] != '_') {
                        System.out.println("Deu velha!");
                        ganhar = true;
                        break;
                    }
                    
                    
                    
                    while(jogando){
                        System.out.print("Jogador 2, digite a coluna e a linha na seguinte formatacao ( %c %l ): ");
                        v1 = entrada.nextInt();
                        v2 = entrada.nextInt();
                        
                        if(matrizInteiros[v2][v1] == '_') {
                            matrizInteiros[v2][v1] = 'O';
                            jogando = false;
                        } else {
                            System.out.println("Casa ocupada!");
                            jogando = true;
                        }
                    }
                    System.out.print("\n");

                    for(int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                System.out.print(matrizInteiros[i][j] + "\t");
                            }
                            System.out.println();
                        }

                    // Verifica se alguem ganhou
                    System.out.print("\n");

                    if(matrizInteiros[0][0] == 'O' && matrizInteiros[0][1] == 'O' && matrizInteiros[0][2] == 'O') {
                            System.out.println("O jogador 2 ganhou!");
                            ganhar = true;
                            break;

                        } else if(matrizInteiros[1][0] == 'O' && matrizInteiros[1][1] == 'O' && matrizInteiros[1][2] == 'O') {
                            System.out.println("O jogador 2 ganhou!");
                            ganhar = true;
                            break;
                        } else if(matrizInteiros[2][0] == 'O' && matrizInteiros[2][1] == 'O' && matrizInteiros[2][2] == 'O') {
                            System.out.println("O jogador 2 ganhou!");
                            ganhar = true;
                            break;
                        } else if(matrizInteiros[0][0] == 'O' && matrizInteiros[1][0] == 'O' && matrizInteiros[2][0] == 'O') {
                            System.out.println("O jogador 2 ganhou!");
                            ganhar = true;
                            break;
                        } else if(matrizInteiros[0][1] == 'O' && matrizInteiros[1][1] == 'O' && matrizInteiros[2][1] == 'O') {
                            System.out.println("O jogador 2 ganhou!");
                            ganhar = true;
                            break;
                        } else if(matrizInteiros[0][2] == 'O' && matrizInteiros[1][2] == 'O' && matrizInteiros[2][2] == 'O') {
                            System.out.println("O jogador 2 ganhou!");
                            ganhar = true;
                            break;
                        } else if(matrizInteiros[0][0] == 'O' && matrizInteiros[1][1] == 'O' && matrizInteiros[2][2] == 'O') {
                            System.out.println("O jogador 2 ganhou!");
                            ganhar = true;
                            break;
                        }
                }

            } else {
                System.out.println("O jogador 2 começa! Use o O para jogar!");
                ganhar = false;
                while(!ganhar){
                    jogando = true;
                    while(jogando){
                        System.out.print("Jogador 2, digite a coluna e a linha na seguinte formatacao ( %c %l ): ");
                        v1 = entrada.nextInt();
                        v2 = entrada.nextInt();
                        
                        if(matrizInteiros[v2][v1] == '_') {
                            matrizInteiros[v2][v1] = 'X';
                            jogando = false;
                        } else {
                            System.out.println("Casa ocupada!");
                            jogando = true;
                        }
                    }
                    System.out.print("\n");

                    for(int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(matrizInteiros[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    System.out.print("\n");
                    jogando = true;

                    // Verificar
                    if(matrizInteiros[0][0] == 'X' && matrizInteiros[0][1] == 'X' && matrizInteiros[0][2] == 'X') {
                            System.out.println("O jogador 2 ganhou!");
                            ganhar = true;
                            break;
                        } else if(matrizInteiros[1][0] == 'X' && matrizInteiros[1][1] == 'X' && matrizInteiros[1][2] == 'X') {
                            System.out.println("O jogador 2 ganhou!");
                            ganhar = true;
                            break;
                        } else if(matrizInteiros[2][0] == 'X' && matrizInteiros[2][1] == 'X' && matrizInteiros[2][2] == 'X') {
                            System.out.println("O jogador 2 ganhou!");
                            ganhar = true;
                            break;
                        } else if(matrizInteiros[0][0] == 'X' && matrizInteiros[1][0] == 'X' && matrizInteiros[2][0] == 'X') {
                            System.out.println("O jogador 2 ganhou!");
                            ganhar = true;
                            break;
                        } else if(matrizInteiros[0][1] == 'X' && matrizInteiros[1][1] == 'X' && matrizInteiros[2][1] == 'X') {
                            System.out.println("O jogador 2 ganhou!");
                            ganhar = true;
                            break;
                        } else if(matrizInteiros[0][2] == 'X' && matrizInteiros[1][2] == 'X' && matrizInteiros[2][2] == 'X') {
                            System.out.println("O jogador 2 ganhou!");
                            ganhar = true;
                            break;
                        } else if(matrizInteiros[0][0] == 'X' && matrizInteiros[1][1] == 'X' && matrizInteiros[2][2] == 'X') {
                            System.out.println("O jogador 2 ganhou!");
                            ganhar = true;
                            break;
                        }
                        if(matrizInteiros[0][0] != '_' && matrizInteiros[0][1] != '_' && matrizInteiros[0][2] != '_' && matrizInteiros[1][0] != '_' && matrizInteiros[1][1] != '_' && matrizInteiros[1][2] != '_' && matrizInteiros[2][0] != '_' && matrizInteiros[2][1] != '_' && matrizInteiros[2][2] != '_') {
                        System.out.println("Deu velha!");
                        ganhar = true;
                        break;
                    }
                    System.out.print("\n");

                    while(jogando){
                        System.out.print("Jogador 1, digite a coluna e a linha na seguinte formatacao ( %c %l ): ");
                        v1 = entrada.nextInt();
                        v2 = entrada.nextInt();
                        
                        if(matrizInteiros[v2][v1] == '_') {
                            matrizInteiros[v2][v1] = 'O';
                            jogando = false;
                        } else {
                            System.out.println("Casa ocupada!");
                            jogando = true;
                        }
                    }
                    for(int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(matrizInteiros[i][j] + "\t");
                        }
                        System.out.println();
                    }

                    System.out.print("\n");
                    // Verificar
                    if(matrizInteiros[0][0] == 'O' && matrizInteiros[0][1] == 'O' && matrizInteiros[0][2] == 'O') {
                            System.out.println("O jogador 1 ganhou!");
                            ganhar = true;
                            break;
                        } else if(matrizInteiros[1][0] == 'O' && matrizInteiros[1][1] == 'O' && matrizInteiros[1][2] == 'O') {
                            System.out.println("O jogador 1 ganhou!");
                            ganhar = true;
                            break;
                        } else if(matrizInteiros[2][0] == 'O' && matrizInteiros[2][1] == 'O' && matrizInteiros[2][2] == 'O') {
                            System.out.println("O jogador 1 ganhou!");
                            ganhar = true;
                            break;
                        } else if(matrizInteiros[0][0] == 'O' && matrizInteiros[1][0] == 'O' && matrizInteiros[2][0] == 'O') {
                            System.out.println("O jogador 1 ganhou!");
                            ganhar = true;
                            break;
                        } else if(matrizInteiros[0][1] == 'O' && matrizInteiros[1][1] == 'O' && matrizInteiros[2][1] == 'O') {
                            System.out.println("O jogador 1 ganhou!");
                            ganhar = true;
                            break;
                        } else if(matrizInteiros[0][2] == 'O' && matrizInteiros[1][2] == 'O' && matrizInteiros[2][2] == 'O') {
                            System.out.println("O jogador 1 ganhou!");
                            ganhar = true;
                            break;
                        } else if(matrizInteiros[0][0] == 'O' && matrizInteiros[1][1] == 'O' && matrizInteiros[2][2] == 'O') {
                            System.out.println("O jogador 1 ganhou!");
                            ganhar = true;
                            break;
                        }

                    
                }
            }   
        }
        entrada.close();
  }
}