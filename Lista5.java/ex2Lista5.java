import java.util.Scanner;
/*
Em uma pesquisa de campo, uma editora solicitou os seguintes dados para os entrevistados: sexo, idade e quantidade de livros que leu no ano de 2021. Faça um programa que leia os dados digitados pelo usuário, sendo que deverão ser solicitados dados até que a idade digitada seja zero.
Depois, calcule e imprima:

a) A quantidade total de livros lidos pelos entrevistados menores de 15 anos.
b) A quantidade de mulheres que leram 5 livros ou mais.
c) A média de idade dos homens que leram menos que 5 livros.
d) O percentual de pessoas que não leram livros.
*/

public class ex2Lista5 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    char sexo;
    float idade, qtdLivros, qtdLivros15 = 0.0f, qtdLivrosF = 0.0f, qtdLivrosM = 0.0f, totalIdade = 0.0f, qtdPessoas = 0.0f, qtdLivro0 = 0.0f, mediaM = 0.0f, percentual = 0.0f;

    System.out.print("Informe a sua idade: ");
    idade = entrada.nextInt();
    while(idade != 0){ 
    System.out.print("Informe o seu sexo (m ou f): ");
    sexo = entrada.next().charAt(0);

    System.out.print("Informe o número de livros que você leu em  2021: ");
    qtdLivros = entrada.nextInt();
  
     
      qtdPessoas = qtdPessoas + 1;

      if(idade < 15){
        qtdLivros15 = qtdLivros15 + qtdLivros;
        //qtdLivros15 += qtdLivros;        
        }

      if(qtdLivros == 0){
        qtdLivro0++;
      }

      switch(sexo){
        case 'f': if(qtdLivros >= 5){
          qtdLivrosF = qtdLivrosF + 1;
        }
        break;
        case 'm': if(qtdLivros < 5){
          qtdLivrosM = qtdLivrosM + 1;
          totalIdade = totalIdade + idade;
        break;
        }

      }
      System.out.print("Informe a sua idade: ");
      idade = entrada.nextInt();
    }
    

      mediaM = totalIdade / qtdLivrosM;
      
    if(qtdLivro0 != 0){  
    percentual = (qtdLivro0 / qtdPessoas) * 100;
      }

    
System.out.println("A quantidade de livros lidos por  menores de 15 anos é de " + qtdLivros15+ " em 2021");

System.out.println("A quantidade de mulheres que leram 5 livros ou mais em 2021 é de " + qtdLivrosF);

System.out.println("A média de idade dos homens que leram menos do que 5 livros em 2021 é de " + mediaM );

System.out.println("O percentual de pessoas que não leram nenhum livro em 2021 é de " + percentual + "%.");

 

    entrada.close();

  }
}