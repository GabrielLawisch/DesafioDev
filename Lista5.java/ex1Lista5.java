import java.util.Scanner;
/*
Escrever um programa que calcule todos os números divisíveis por certo valor indicado pelo usuário (o resto da divisão por este número deve ser igual a zero), compreendidos em um intervalo também especificado pelo usuário. O usuário deve entrar com um primeiro valor correspondente ao divisor e após ele vai fornecer o valor inicial do intervalo, seguido do valor final deste intervalo.
Exemplo de tela de saída:
Entre com o valor do divisor: 3
Início do intervalo: 17
Final do intervalo: 29
Números divisíveis por 3 no intervalo de 17 a 29:
18 21 24 27


pedir divisor
pedir inicio intervalo
pedir final intervalo
for(int n = iPeriodo; n == fPeriodo + 1; n++){
      if(n % divisor == 0){
        System.out.println(n);
      }
*/

public class ex1Lista5 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int divisor, iPeriodo, fPeriodo;

    System.out.print("Insira o divisor: ");
    divisor = entrada.nextInt();

    System.out.print("Insira o início do intervalo: ");
    iPeriodo = entrada.nextInt();

    System.out.print("Insira o final do intervalo: ");
    fPeriodo = entrada.nextInt();

    while(iPeriodo <= fPeriodo){
      if(iPeriodo % divisor == 0){
        System.out.println(iPeriodo);
          iPeriodo++;
        } 
      
      else {
        iPeriodo++;
        }
      }
  

    entrada.close();

  }
}