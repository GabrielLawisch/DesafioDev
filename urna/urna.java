import java.util.Scanner;
public class urna {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        int candidato, gabriel, felix, thomas, joao, nulo;

        candidato = 0;
        gabriel = 0;
        felix = 0;
        thomas = 0;
        joao = 0;
        nulo = 0;

        while(candidato != 6){
            System.out.println("Selecione o candidato");
            System.out.println("1 - Gabriel");
            System.out.println("2 - Félix");
            System.out.println("3 - Thomas");
            System.out.println("4 - João");
            System.out.println("5 - Nulo");
            System.out.println("6 - Encerrar votação");
            System.out.print("Informe o candidato que você deseja votar: ");
            candidato = entrada.nextInt();
            
            switch(candidato){
                case 1: System.out.println("O candidato selecionado foi Gabriel.");
                gabriel = gabriel + 1;
                break;
                case 2: System.out.println("O candidato selecionado foi Félix.");
                felix = felix + 1;
                break;
                case 3: System.out.println("O candidato selecionado foi Thomas.");
                thomas = thomas + 1;
                break;
                case 4: System.out.println("O candidato selecionado foi Joao.");
                joao = joao + 1;
                break;
                case 5: System.out.println("Você votou nulo.");
                nulo = nulo + 1;
                break;
                case 6: System.out.println("Você escolheu encerrar a votação.");
                break;

                default: System.out.println("A opção escolhida não é válida");

            }

        }
        System.out.println("Gabriel recebeu " + gabriel + " votos");
        System.out.println("Félix recebeu " + felix + " votos");
        System.out.println("Thomas recebeu " + thomas + " votos");
        System.out.println("João recebeu " + joao + " votos");
        System.out.println("O total de votos nulos foi " + nulo + " votos");
        
        entrada.close();
    }
}

