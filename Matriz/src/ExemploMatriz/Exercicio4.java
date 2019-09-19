package ExemploMatriz;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        String[][] matrizAgenda = new String[5][2];
        Scanner leitor = new Scanner(System.in);
        boolean encontrado;

        for (int linha = 0; linha < matrizAgenda.length; linha++) {
            for (int coluna = 0; coluna < matrizAgenda[0].length; coluna++) {
                System.out.println(linha + "," + coluna);
                if(coluna == 0) {
                    System.out.println("Digite o nome do seu amigo");
                } else {
                    System.out.println("Digite o telefone do seu amigo");
                }
                matrizAgenda[linha][coluna] = leitor.nextLine();

            }
        }

        System.out.println("Digite um nome:");
        String nome = leitor.nextLine();

        for (int coluna = 0; coluna < matrizAgenda[0].length; coluna++) {
            for (int linha = 0; linha < matrizAgenda.length; linha++) {
                if (matrizAgenda[linha][coluna].equals(nome)) {
                    System.out.println("O numero do seu amigo é " + matrizAgenda[linha][coluna+1]);
                    encontrado = true;
                }

            }
            if(encontrado = false){
                System.out.println("Numero não encontrado");
            }

        }



    }
    }
