import java.util.Scanner;

/*
A ONG Roda Viva resolveu fazer um levantamento em cinco cidades que possuem os maiores índices de acidentes de trânsito. Para isso foram coletados a cidade, o mês do acidente, o número de pessoas feridas em cada acidente, a idade e o sexo do motorista.
Faça um programa que leia esses dados até que o mês informado seja igual a FIM. 
Ao terminar a execução do programa informe:
a) o número total de pessoas feridas nos acidentes
b) o mês com mais acidentes de trânsito
c) O percentual de motoristas de cada sexo envolvidos em acidentes
d) a cidade com menos acidentes
e) a idade do motorista mais jovem, do mais idoso e a média de idade dos motoristas envolvidos em acidentes.

Observação: utilizar apenas comandos de seleção e de repetição, SEM o uso de vetores.
*/

public class ex5Lista5 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    char sexo;
    String mes;
    int feridos, idade, cidade, totalFeridos = 0, janeiro = 0, fevereiro = 0, marco = 0, abril = 0, maio = 0, junho = 0, julho = 0, agosto = 0, setembro = 0, outubro = 0, novembro = 0, dezembro = 0, jovem = 100000, idoso = 0, c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, totalAcidentes = 0, totalIdade = 0, cidadeMenos = 0, mesMais = 0;
    float percentualM = 0.0f, percentualF = 0.0f, mediaIdade = 0.0f, acidenteM = 0.0f, acidenteF = 0.0f;
    
    System.out.print("Qual o mês do acidente? ");
      mes = entrada.next();

    while (!"FIM".equals(mes)) {
      totalAcidentes = totalAcidentes + 1;
      System.out.print("1- São Paulo \n 2- Rio de Janeiro \n 3- Santa Cruz do Sul \n 4- Capão da Canoa \n 5- Rio Pardinho \n");
      System.out.print("Qual o número da cidade? ");
      cidade = entrada.nextInt();
      System.out.print("Qual o número de pessoas feridas no acidente? ");
      feridos = entrada.nextInt();
      System.out.print("Qual a idade do motorista? ");
      idade = entrada.nextInt();
      System.out.print("Qual o sexo do motorista (m ou f)? ");
      sexo = entrada.next().charAt(0);

      totalFeridos = totalFeridos + feridos;

      switch(mes){
        case "janeiro": janeiro = janeiro + 1;
          break;
        case "fevereiro": fevereiro = fevereiro + 1;
          break;
        case "março":
        case "marco": marco = marco + 1;
          break;
        case "abril": abril = abril + 1;
          break;
        case "maio": maio = maio + 1;
          break;
        case "junho": junho = junho + 1;
          break;
        case "julho": julho = julho + 1;
          break;
        case "agosto": agosto = agosto + 1;
          break;
        case "setembro": setembro = setembro + 1;
          break;
        case "outubro": outubro = outubro + 1;
          break;
        case "novembro": novembro = novembro + 1;
          break;
        case "dezembro": dezembro = dezembro + 1;
          break;
      }

      switch(sexo){
        case 'm': acidenteM = acidenteM + 1;
          break;
        case 'f': acidenteF = acidenteF + 1;
          break;
      }

      switch(cidade){
        case 1: c1 = c1 + 1;
          break;
        case 2: c2 = c2 + 1;
          break;
        case 3: c3 = c3 + 1;
          break;
        case 4: c4 = c4 + 1;
          break;
        case 5: c5 = c5+ 1;
          break;
      }

      totalIdade = totalIdade + idade;

      if(idade < jovem){
        jovem = idade;
      }
      if(idade > idoso){
        idoso = idade;
      }
      System.out.print("Qual o mês do acidente?(Digite FIM para finalizar o programa ) ");
      mes = entrada.next();
    }

    mesMais = janeiro;
    if(mesMais < fevereiro){
      mesMais = fevereiro;
    }
    if(mesMais < marco){
      mesMais = marco;
    }
    if(mesMais < abril){
      mesMais = abril;
    }
    if(mesMais < maio){
      mesMais = maio;
    }
    if(mesMais < junho){
      mesMais = junho;
    }
    if(mesMais < julho){
      mesMais = julho;
    }
    if(mesMais < agosto){
      mesMais = agosto;
    }
    if(mesMais < setembro){
      mesMais = setembro;
    }
    if(mesMais < outubro){
      mesMais = outubro;
    }
    if(mesMais < novembro){
      mesMais = novembro;
    }
    if(mesMais < dezembro){
      mesMais = dezembro;
    }

    cidadeMenos = c1;
    if(cidadeMenos > c2){
      cidadeMenos = c2;
    }
    if(cidadeMenos > c3){
      cidadeMenos = c3;
    }
    if(cidadeMenos > c4){
      cidadeMenos = c4;
    }
    if(cidadeMenos > c5){
      cidadeMenos = c5;
    }
       
    percentualM = (acidenteM / totalAcidentes) * 100;
    percentualF = (acidenteF / totalAcidentes) * 100;
    mediaIdade = totalIdade / totalAcidentes;

    System.out.println("O total de feridos nos acidentes foi de " + totalFeridos);
    System.out.println("O(s) mês(es) com mais acidentes foi/foram");
    if(mesMais == janeiro){
      System.out.println("Janeiro");
    }
    if(mesMais == fevereiro){
      System.out.println("Fevereiro");
    }
    if(mesMais == marco){
      System.out.println("Março");
    }
    if(mesMais == abril){
      System.out.println("Abril");
    }
    if(mesMais == maio){
      System.out.println("Maio");
    }
    if(mesMais == junho){
      System.out.println("Junho");
    }
    if(mesMais == julho){
      System.out.println("Julho");
    }
    if(mesMais == agosto){
      System.out.println("Agosto");
    }
    if(mesMais == setembro){
      System.out.println("Setembro");
    }
    if(mesMais == outubro){
      System.out.println("Outubro");
    }
    if(mesMais == novembro){
      System.out.println("Novembro");
    }
    if(mesMais == dezembro){
      System.out.println("Dezembro");
    }
    System.out.println("Com um total de " + mesMais + " acidentes");
    System.out.println("O percentual de motoristas homens é de " + percentualM + "% e o de motoristas mulheres é de " + percentualF + "%");
    System.out.println("A(s) cidade(s) com menos acidentes foi/foram");
    if(cidadeMenos == c1){
    System.out.println("São Paulo");
    }
    if(cidadeMenos == c2){
    System.out.println("Rio de Janeiro");
    }
    if(cidadeMenos == c3){
    System.out.println("Santa Cruz do Sul");
    }
    if(cidadeMenos == c4){
    System.out.println("Capão da Canoa");
    }
    if(cidadeMenos == c5){
    System.out.println("Rio Pardinho");
    }
    System.out.println("Com um total de " + cidadeMenos + " acidentes");
    System.out.println("A idade do motorista mais jovem é " + jovem + ", a idade do motorista mais velho é " + idoso + " e a média da idade dos motoristas é de " + mediaIdade);

    entrada.close();
  }
}