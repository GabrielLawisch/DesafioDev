import java.util.Scanner;
/*
Criar um programa para calcular o valor da multa a ser paga de anuidade de uma associação. A anuidade deve ser paga no mês de janeiro. Por mês, é cobrado 5% de juros (com juros sobre juros). Por exemplo, uma associação de R$ 100 paga em janeiro, custa R$ 100; em fevereiro, custa R$ 105; em março, custa R$ 110.25; e, em dezembro, R$171.03.
*/


class ex2List4 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    //Programe a partir daqui
    int escolha;
    float valorMulta;

    System.out.print("Insira o valor inicial da multa: ");
    valorMulta = entrada.nextFloat();

  System.out.println("O mês em que está sendo paga a multa é: ");
  System.out.println("1) Janeiro ");
  System.out.println("2) Fevereiro ");
  System.out.println("3) Março ");
  System.out.println("4) Abril ");
  System.out.println("5) Maio ");
  System.out.println("6) Junho ");
  System.out.println("7) Julho ");
  System.out.println("8) Agosto ");
  System.out.println("9) Setembro ");
  System.out.println("10) Outubro ");
  System.out.println("11) Novembro ");
  System.out.println("12) Dezembro ");
  System.out.print("Escolha um número: ");
  escolha = entrada.nextInt();


    switch(escolha){
      case 2: valorMulta = valorMulta * 1.05f;
        break;
      case 3: valorMulta = valorMulta * 1.1025f;
        break;
      case 4: valorMulta = valorMulta * 1.157625f;
        break;
      case 5: valorMulta = valorMulta * 1.21550625f;
        break;
      case 6: valorMulta = valorMulta * 1.27628156f;
        break;
      case 7: valorMulta = valorMulta * 1.34009564f;
        break;
      case 8: valorMulta = valorMulta * 1.40710042f;
        break;
      case 9: valorMulta = valorMulta * 1.47745544f;
        break;
      case 10: valorMulta = valorMulta * 1.55132822f;
        break;
      case 11: valorMulta = valorMulta * 1.62889463f;
        break;
      case 12: valorMulta = valorMulta * 1.71033946f;
        break;
      
    }

    System.out.print("O valor final da multa é de " + valorMulta + " reais.");
	
	
    //Programe até aqui.
    entrada.close();
  }
}