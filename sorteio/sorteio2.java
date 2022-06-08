import java.util.*;
/*
Fazer um simulador de “Bola 8”. A ideia é fazer uma pergunta e o computador responder com as seguintes respostas: Sim. Certamente. Lógico que sim. Minhas fontes dizem que sim. Acho 
que sim. Talvez. Um dia quem sabe. Você descobrirá em breve. Você sabe a resposta. Não estou certo. Acho que não. Possivelmente não. Se você se empenhar. Não. Desista. Nunca. Claro 
que não.’
*/

class sorteio2 {
    public static void main(String[] args) {
      Random numRand = new Random();
      Scanner entrada = new Scanner(System.in);
      int sorteado;

      System.out.print("Qual a sua pergunta? ");
      entrada.next();

      sorteado = numRand.nextInt((17) + 1);

      switch(sorteado){
          case 1 : System.out.println("Sim.");
            break;
            case 2 : System.out.println("Certamente.");
            break;
            case 3 : System.out.println("Lógico que sim.");
            break;
            case 4 : System.out.println("Minhas fontes dizem que sim.");
            break;
            case 5 : System.out.println("Acho que sim.");
            break;
            case 6 : System.out.println("Talvez.");
            break;
            case 7 : System.out.println("Um dia quem sabe.");
            break;
            case 8 : System.out.println("Você descobrirá em breve.");
            break;
            case 9 : System.out.println("Você sabe a resposta.");
            break;
            case 10 : System.out.println("Não estou certo.");
            break;
            case 11 : System.out.println("Acho que não.");
            break;
            case 12 : System.out.println("Possivelmente não.");
            break;
            case 13 : System.out.println("Se você se empenhar.");
            break;
            case 14 : System.out.println("Não.");
            break;
            case 15 : System.out.println("Desista.");
            break;
            case 16 : System.out.println("Nunca.");
            break;
            case 17 : System.out.println("Claro que não.");
            break;
      }

      entrada.close();
    }
}