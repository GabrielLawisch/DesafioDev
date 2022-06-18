import java.util.*;
/*
Fazer um programa que armazene os valores arrecadados por uma loja em cada um dos três turnos (manhã, tarde, noite) durante uma semana (segunda até sábado). Ao final da semana indicar:

a) Exibir todas as vendas de cada dia da semana (na forma de tabela)
b) Qual o turno com maior venda
c) Qual o turno com menor venda
d) Qual o dia da semana com maior venda
e) Qual o dia da semana com menor venda
f) Qual o total arrecadado durante a semana

Resolver o problema utilizando uma matriz com um tamanho definido por você.


*/
class matriz6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int turnos[][], totalSemana = 0, totalDia[], totalTurno1 = 0, totalTurno2 = 0, totalTurno3 = 0, maiorVenda, menorVenda;
        turnos = new int[6][3];
        totalDia = new int[6];

        for(int dia = 0; dia < 6; dia++){
            for(int turno = 0; turno < 3; turno++){
                System.out.print("Informe o valor arrecadado no turno " + (turno+1) + " do dia " + (dia+1) + " da semana: ");
                turnos[dia][turno] = entrada.nextInt();
                totalSemana = totalSemana + turnos[dia][turno];
                totalDia[dia] = totalDia[dia] + turnos[dia][turno];
            }
        }

        System.out.println("A tabela com todas as vendas semanais é: ");

        for(int dia = 0; dia < 6; dia++){
            for(int turno = 0; turno < 3; turno++){
                System.out.print(turnos[dia][turno] + "\t");
            }
            System.out.println();
        }

        for(int dia = 0; dia < 6; dia++){
            totalTurno1 = turnos[dia][0] + totalTurno1;
        }
        for(int dia = 0; dia < 6; dia++){
            totalTurno2 = turnos[dia][1] + totalTurno2;
        }
        for(int dia = 0; dia < 6; dia++){
            totalTurno3 = turnos[dia][2] + totalTurno3;
        }


        if(totalTurno1 > totalTurno2 && totalTurno1 > totalTurno3){
            System.out.println("O turno com maior venda é o turno 1");
        }else if(totalTurno2 > totalTurno1 && totalTurno2 > totalTurno3){
            System.out.println("O turno com maior venda é o turno 2");
        }else{
            System.out.println("O turno com maior venda é o turno 3");
        }

        if(totalTurno1 < totalTurno2 && totalTurno1 < totalTurno3){
            System.out.println("O turno com menor venda é o turno 1");
        }else if(totalTurno2 < totalTurno1 && totalTurno2 < totalTurno3){
            System.out.println("O turno com menor venda é o turno 2");
        }else{
            System.out.println("O turno com menor venda é o turno 3");
        }

        maiorVenda = totalDia[0];
        for(int dia = 1; dia < 6; dia++){
            if(totalDia[dia] > maiorVenda){
                maiorVenda = totalDia[dia];
            }
        }
        for(int dia = 0; dia < 6; dia++){
            if(totalDia[dia] == maiorVenda){
                System.out.println("O dia da semana com maior venda é o dia " + (dia+1));
            }
        }

        menorVenda = totalDia[0];
        for(int dia = 1; dia < 6; dia++){
            if(totalDia[dia] < menorVenda){
                menorVenda = totalDia[dia];
            }
        }
        for(int dia = 0; dia < 6; dia++){
            if(totalDia[dia] == menorVenda){
                System.out.println("O dia da semana com menor venda é o dia " + (dia+1));
            }
        }

        System.out.println("O total arrecadado durante a semana é: " + totalSemana);
    
        entrada.close();
    }
  }