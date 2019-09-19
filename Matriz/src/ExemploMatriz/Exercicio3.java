package ExemploMatriz;

import java.util.Scanner;

public class Exercicio3 {
    public static void exibeMatriz(int[][] m) {
        System.out.println("Exibi��o da matriz");
        for (int linha = 0; linha < m.length; linha++) {
            for (int coluna = 0; coluna < m[0].length; coluna++) {
                System.out.print(m[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] matriz = new int[3][3];
        Scanner leitor = new Scanner(System.in);
        int [] vetor = new int[3];


        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.println("Digite o valor da matriz [" +
                        linha + "][" + coluna + "]");
                matriz[linha][coluna] = leitor.nextInt();


            }
        }

            for (int coluna=0; coluna < matriz[0].length; coluna++) {
                for (int linha = 0; linha < matriz.length; linha++) {
                    vetor[linha] += matriz[coluna][linha];
                }

            }
            exibeMatriz(matriz);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+"\t");
        }

    }
}
