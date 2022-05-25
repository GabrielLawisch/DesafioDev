import java.util.Scanner;

public class ex7List5 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int positivos = 0, negativos = 0, num = 1;

    while(num != 0) {
        System.out.print("Insira um número: ");
        num = entrada.nextInt();
        if(num > 0){
            positivos = positivos + 1;
            System.out.println(num + " POSITIVO");
        }else if(num < 0){
            negativos = negativos + 1;
            System.out.println(num + " NEGATIVO");
        }
    }
    
    System.out.print("O total de positivos é " + positivos + " e o total de negativos é " + negativos);

  entrada.close();
 }
}