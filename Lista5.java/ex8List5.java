import java.util.Scanner;

public class ex8List5 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int vezes;
    float soma = 0.0f, num;

    System.out.print("Quantos números você deseja somar? ");
    vezes = entrada.nextInt();

    while(vezes > 0){
        System.out.print("Insira um número: ");
        num = entrada.nextFloat();
        soma = soma + num;
        vezes = vezes - 1;
    }

    System.out.print("A soma é " + soma);

  entrada.close();
 }
}