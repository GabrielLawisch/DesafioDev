
import java.util.Scanner;
/*
Criar um programa para identificar o valor a ser pago por um plano de saúde dada a idade do conveniado considerando que todos pagam no mínimo R$ 300 e mais um adicional (se tiver dependentes) conforme a seguinte tabela (para cada dependente e pode ter mais do que um):
a)	crianças com menos de 10 anos pagam R$100;
b)	dependentes com idade entre 10 e 30 anos pagam R$220;
c)	dependentes com idade entre 31 e 60 anos pagam R$ 395; e
d)	dependentes com mais de 60 anos pagam R$ 480
*/


class ex9 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    //Programe a partir daqui

    int idade, valor, contador;
    valor = 300;
    
    System.out.print("Digite a quantidade de dependentes: ");
    contador = entrada.nextInt();

    for (int x = 1; x <= contador; x ++){
    System.out.print("Insira a idade do dependente: ");
    idade = entrada.nextInt();

    if(idade < 10){
      valor = valor + 100;
    }
    else if(idade <= 30){
      valor = valor + 220;
    }
    else if(idade <= 60){
      valor = valor + 395;
    }
    else{
      valor = valor + 480;
    }
  }

    System.out.print("O valor a ser pago é " + valor);

    //Programe até aqui.
    entrada.close();
  }
}