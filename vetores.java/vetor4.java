import java.util.Scanner;
/* 
Faça um programa que leia dez nomes. Mostre os nomes que começam com F e se não houver nenhum mostre uma mensagem na tela.
*/

class vetor4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nomes[];
        nomes = new String[10];
        int contagem = 0;

        for(int n = 0; n < 10; n++){
            System.out.print("Informe o nome " + (n+1) + ": ");
            nomes[n] = entrada.next();
          }

        for(int n = 0; n < 10; n++){
            if(nomes[n].charAt(0) == 'F') {
                System.out.print(nomes[n] + " "); 
                contagem++;
            }
        }
              if (contagem == 0) {
                System.out.print("Não há nomes que começam com F");
            }
          entrada.close();

  }
}