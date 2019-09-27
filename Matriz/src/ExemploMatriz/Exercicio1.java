package ExemploMatriz;

import java.util.Scanner;

public class Exercicio1 {

        public static void exibeMatriz (int[][] m) {
            System.out.println("Exibi��o da matriz");
            for (int linha=0; linha < m.length; linha++) {
                for (int coluna=0; coluna < m[0].length;coluna++) {
                    System.out.print(m[linha][coluna] + "\t");
                }
                System.out.println();
            }
        }

        public static  void exibeMatrizTransposta (int[][] m) {
            System.out.println("Exibi��o da matriz transposta");
            for (int coluna=0; coluna < m[0].length; coluna++) {
                for (int linha=0; linha < m.length;linha++) {
                    System.out.print(m[linha][coluna] + "\t");
                }
                System.out.println();
            }

        }

        public static void main(String[] args) {

            // Cria uma matriz de inteiros de 3 linhas e 4 colunas
            int[][] matriz = new int[3][4];

            // Cria uma outra matriz, j� inicializando os valores
            int[][] matriz2 = { {1,2}, {3,4}, {5,6}, {7,8} };

            // Cria objeto Scanner
            Scanner leitor = new Scanner(System.in);

            // Pede para o usu�rio digitar os valores para preencher
            // a matriz
            for (int linha=0; linha < matriz.length; linha++) {
                for (int coluna=0; coluna < matriz[0].length;coluna++) {
                    System.out.println("Digite o valor de matriz["+
                            linha+"]["+coluna+"]");
                    matriz[linha][coluna]= leitor.nextInt();
                }
            }

            // Exibe a primeira matriz
            exibeMatriz(matriz);

            // Exibe a segunda matriz
            exibeMatriz(matriz2);

            // Exibe a primeira matriz transposta
            exibeMatrizTransposta(matriz);

            // Exibe a segunda matriz transposta
            exibeMatrizTransposta(matriz2);





        }

    }


