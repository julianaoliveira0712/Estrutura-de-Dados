import java.util.Scanner;

public class Provinha {

// Escreva um programa que realize o processo de compra de ingressos de 5 usuários para a BGS.
// O programa deve pedir o nome a idade e a quantidade de ingressos que o usuário vai querer,
// depois exibir uma mensagem como essa:
    //" O "Usuário" comprou um total de "x" engressos, cada um custando "yyy" e com o custo total de R$"zz"
    // Onde "Usuário" é o nome do usuário
    // "x" é a quantidade de ingressos comprados
    // "yyy" é o preço dos ingressos por unidade
    // "zz" é o valor total
    // cada ingresso tem uma taxa de R$ 30 reais caso tenha sido comprado depois do prazo;
    // o prazo é até 25/11
    // cada ingresso custa 60 reais


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);
        int[] qtdIngressos= new int[5];
        double ingresso = 60;
        double taxa = 30;
        int dia =0;
        int mes=0;
        double totalPagar =0;
        String nome;
        int compraingresso=0;

//        System.out.println("Qual a quantidade de usuários que vão comprar engressos?");
//        int qtdUser = leitor2.nextInt();


        String[] nomes= new String[5];
        int cont =1;
        for (int i = 0; i < nomes.length ; i++) {
            System.out.println("Qual o nome do usuário numero "+cont+"?");
            nomes[i] = leitor.nextLine();
            System.out.println("Quantos Ingressos "+nomes[i]+" quer comprar?");
            compraingresso = leitor2.nextInt();
            qtdIngressos[i] = compraingresso;
            cont++;

        }
        System.out.println("Digite o nome de um usuário:");
        nome = leitor.nextLine();

        for (int i = 0; i < nomes.length; i++) {
            if(nomes[i].equals(nome)) {
                System.out.println("Usuario Encontrado");
                System.out.println("");
                System.out.println(nome+" Qual dia você comprou o ingresso?");
                dia = leitor2.nextInt();

                System.out.println(nome+ "Qual mês você comprou o ingresso?");
                mes = leitor2.nextInt();

                for (int j = 0; j <qtdIngressos.length ; j++) {
                    if(dia >25 && mes > 11){
                        totalPagar += (ingresso* qtdIngressos.length) + taxa * qtdIngressos.length;
                    }else{
                        totalPagar = ingresso* qtdIngressos.length;
                    }

                }

                System.out.println(nome+" comprou cada ingresso custando "+ingresso+" e com o custo total de R$"+totalPagar);





        } else {
                System.out.println("usuario não encontrado");
            }







    }


    }



}
