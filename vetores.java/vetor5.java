import java.util.Scanner;
/*
A) Faça um programa que leia X nomes e mostre ao final da leitura eles na ordem inversa do que foram informados.

B) Qual a letra que inicia e mostrar somente os nomes que começam com essa letra
*/
public class vetor5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nomes[];
        int nNomes, contador = 0;
        char letra;

        System.out.print("Qual o número de nomes que você deseja inserir? ");
        nNomes = entrada.nextInt();

        nomes = new String[nNomes];

        for(int n = 0; n < nNomes; n++){
            contador = contador + 1;
            System.out.print("Informe o nome " + (contador) + ": ");
            nomes[n] = entrada.next();
          }

          contador = nNomes;

        for(int n = 0; n < nNomes; n++){
            contador = contador - 1;
            System.out.print(nomes[contador] + " ");
          }

        System.out.print("\nDeseja mostrar os nomes com uma letra especifica? (S/N) ");
        letra = entrada.next().charAt(0);

        if(letra == 'S'){
        System.out.print("Deseja mostrar apenas os nomes com qual letra? ");
        letra = entrada.next().charAt(0);
        System.out.print("O nomes que começam com " + letra + " são:\n");
        for(int n = 0; n < nNomes; n++){
          contador = contador + 1;
          if(nomes[n].charAt(0) == letra) {
            System.out.println(nomes[n]);
          }
        }

        }

          entrada.close();

    }
  }