import java.util.*;
/*
Leia uma matriz 5x10 que se refere respostas de 10 questões de múltipla escolha, referentes a 5 alunos. Leia também um vetor de 10 posições contendo o gabarito de respostas que 
podem ser a, b, c ou d. Seu programa deverá comparar as respostas de cada candidato com o gabarito e emitir um vetor denominado resultado, contendo a pontuação correspondente a 
cada aluno.
*/

class matriz5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char matriz [][], gabarito [];
        int resultado [], contador = 0;
        matriz = new char [5][10];
        gabarito = new char [10];
        resultado = new int [5];

        for(int l = 0; l < 5; l++){
            for(int c = 0; c < 10; c++){
                System.out.print("Digite a resposta da questão " + (c + 1) + " do aluno " + (l + 1) + ": ");
                matriz[l][c] = entrada.next().charAt(0);
            }
        }
        for(int l = 0; l < 10; l++){
            System.out.print("Digite o gabarito da questão " + (l + 1) + ": ");
            gabarito[l] = entrada.next().charAt(0);
        }

        for(int l = 0; l < 5; l++){
            for(int c = 0; c < 10; c++){
                if(matriz[l][c] == gabarito[c]){
                    contador++;
                }
            }
            resultado[l] = contador;
            contador = 0;
        }

        for(int l = 0; l < 5; l++){
            System.out.println("O aluno " + (l + 1) + " acertou " + resultado[l] + " questões.");
        }

        entrada.close();
    }
  }