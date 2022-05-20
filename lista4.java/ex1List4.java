import java.util.Scanner;
/*
Faça um conversor de câmbio de reais/dólar/euro. O usuário deve informar inicialmente a cotação
de cada moeda em relação ao real. Depois apresente o seguinte menu:
a) Converter de Real para Euro
b) Converter de Real para Dólar
c) Converter de Euro para Dólar
d) Converter de Euro para Real
e) Converter de Dólar para Euro
f) Converter de Dólar para Real
Leia o valor a ser convertido na moeda de origem e imprima na tela a quantidade na moeda destino.
*/


class ex1List4 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    //Programe a partir daqui
	
	float euro, dolar, valorOriginal, valorFinal;
  int conversao;

  System.out.print("Informe a cotação do dolar em relação ao real: ");
  dolar = entrada.nextFloat();
  System.out.print("Informe a cotação do euro em relação ao real: ");
  euro = entrada.nextFloat();


  System.out.print("Insira o valor a ser convertido: ");
  valorOriginal = entrada.nextFloat();

  
	System.out.println("A conversão desejada é: ");
  System.out.println("1) Converter de Real para Euro: ");
  System.out.println("2) Converter de Real para Dólar ");
  System.out.println("3) Converter de Euro para Dólar ");
  System.out.println("4) Converter de Euro para Real ");
  System.out.println("5) Converter de Dólar para Euro ");
  System.out.println("6) Converter de Dólar para Real ");
  System.out.print("Escolha um número: ");
	conversao = entrada.nextInt();

  switch(conversao){
    case 1: valorFinal = (valorOriginal / euro);
      System.out.println("Você converteu " + valorOriginal + " Reais em " + valorFinal + " Euros.");
        break;
    case 2: valorFinal = (valorOriginal / dolar);
      System.out.println("Você converteu " + valorOriginal + " Reais em " + valorFinal + " Dólares.");
        break;
    case 3: valorFinal = ((valorOriginal / dolar) * euro);
      System.out.println("Você converteu " + valorOriginal + " Euros em " + valorFinal + " Dólares.");
        break;
    case 4: valorFinal = (valorOriginal * euro);
      System.out.println("Você converteu " + valorOriginal + " Euros em " + valorFinal + " Reais.");
        break;
    case 5: valorFinal = ((valorOriginal / euro) * dolar);
      System.out.println("Você converteu " + valorOriginal + " Dólares em " + valorFinal + " Euros.");
         break;
    case 6: valorFinal = (valorOriginal * dolar);
       System.out.println("Você converteu " + valorOriginal + " Dólares em " + valorFinal + " Reais.");
         break;
  }
	
    //Programe até aqui.
    entrada.close();
  }
}