package ExemploMatriz;

import java.util.Scanner;

public class ExercicioSuper {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);
        int maxAluno=0;
        boolean numeroOk = false;
        int maxAlunoPosicao=0;
        String nome;
        int cont=1;

        do {
            if(maxAluno < 5 ||  maxAluno > 15){
                System.out.println("Qual o valor maximo de alunos?");
                maxAluno = leitor.nextInt();
                maxAlunoPosicao = maxAluno;
            }else{
                numeroOk = true;
            }
        }while(numeroOk == false);

        String [] alunos = new String [maxAlunoPosicao];
        double [][] notas = new double[maxAlunoPosicao][2];

        double [] media = new double[2];

        for (int i = 0; i < maxAlunoPosicao ; i++) {
            System.out.println("Digite o nomes dos alunos:");
            nome = leitor2.nextLine();
            alunos[i] = nome;
        }

        for (int linha = 0; linha < notas.length; linha++) {
            for (int coluna = 0; coluna < notas[0].length; coluna++) {
                System.out.println(linha + "," + coluna);
                if(coluna == 0) {
                    System.out.println("Digite a primeira nota do aluno numero "+cont);
                } else {
                    System.out.println("Digite a segunda nota do aluno numero "+cont);
                }
                notas[linha][coluna] = leitor.nextDouble();
            }
        }
        System.out.println("nome: "+ "nota 1:" + "nota 2:");
        for (int coluna = 0; coluna < notas.length; coluna++) {
//            String texto = "";
//            texto += alunos[coluna];
            System.out.printf(alunos[coluna]);
            for (int linha = 0; linha < notas[0].length; linha++) {
                System.out.printf(":" + notas[coluna][linha]);
//                texto += ":" + notas[coluna][linha];
//                System.out.println("nome: "+ "nota 1:" + "nota 2:");
//                    System.out.print(alunos[coluna]+":" + notas[coluna][linha]);
            }
//            System.out.println(texto);
            System.out.println();
        }

        for (int i = 0; i < alunos[0].length() ; i++) {

        }


    }
}
