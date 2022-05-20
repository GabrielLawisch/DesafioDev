import java.util.Scanner;
/*
Faça um programa que leia os nomes de dois times de futebol.
Após ler os nomes, peça o número de gols que cada um time fez durante a partida. Ao final do programa informe o resultado da seguinte forma:
O TIMEXXX ganhou por X a Y do TIMEYYY.
Se for empate:
TIMEXXX e TIMEYYY empataram com X gols cada.

*/


class ex3List4 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    //Programe a partir daqui

    String time1, time2;
    int pontos1, pontos2;

    System.out.print("Insira o nome do primeiro time: ");
    time1 = entrada.next();
    System.out.print("Insira o nome do segundo time: ");
    time2 = entrada.next();
    System.out.print("Insira o número de gols feitos pelo " + time1 + ": ");
    pontos1 = entrada.nextInt();
    System.out.print("Insira o número de gols feitos pelo " + time2 + ": ");
    pontos2 = entrada.nextInt();

    if(pontos1 > pontos2){
      System.out.print("O " + time1 + " ganhou por " + pontos1 + " a " + pontos2 + " do " + time2);
    }
    else if(pontos1 == pontos2){
      System.out.print(time1 + " e " + time2 + " empataram com " + pontos1 + " pontos cada.");
    }
    else{
      System.out.print("O " + time2 + " ganhou por " + pontos2 + " a " + pontos1 + " do " + time1);
    }
    
	
	
    //Programe até aqui.
    entrada.close();
  }
}