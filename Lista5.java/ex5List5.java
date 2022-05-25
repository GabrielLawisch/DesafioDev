import java.util.Scanner;

public class ex5List5 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    float soma = 0.0f, media = 0.0f, num;

    for(int n = 1; n <= 15; n++){
        System.out.print("Insira um número: ");
        num = entrada.nextFloat();
        soma = soma + num;
    }
    
    media = soma / 15;

    System.out.print("A soma é " + soma + " e a média é " + media);

  entrada.close();
 }
}