package ExemploMatriz;

import java.util.Scanner;

public class Exercicio2 {
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

        int[][] matriz = new int[2][3];

        int[][] matriz2 = new int[2] [3];

        Scanner leitor = new Scanner(System.in);


        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.println("Digite o valor da matriz 1[" +
                        linha + "][" + coluna + "]");
                matriz[linha][coluna] = leitor.nextInt();


            }
        }

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                 System.out.println("Digite o valor da matriz 2[" +
                 linha + "][" + coluna + "]");
                 matriz2[linha][coluna] = leitor.nextInt();
            }
        }


        int[] [] matriz3 = new int[2] [3];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
               matriz3[linha][coluna]= matriz2[linha] [coluna]+ matriz[linha] [coluna];
            }
        }

        exibeMatriz(matriz);
        exibeMatriz(matriz2);
        exibeMatriz(matriz3);

    }
}
