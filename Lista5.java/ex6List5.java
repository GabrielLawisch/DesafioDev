import java.util.Scanner;

public class ex6List5 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int pares = 0, impares = 0, num;

    for(int n = 1; n <= 10; n++){
        System.out.print("Insira um número: ");
        num = entrada.nextInt();
        if((num %= 2) == 0){
            pares = pares + 1;
        }else{
            impares = impares + 1;
        }
    }
    
    System.out.print("O total de pares é " + pares + " e o total de ímpares é " + impares);

  entrada.close();
 }
}