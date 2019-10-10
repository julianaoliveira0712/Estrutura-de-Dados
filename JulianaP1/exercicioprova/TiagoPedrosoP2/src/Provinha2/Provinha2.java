package Provinha2;

//<editor-fold defaultstate="collapsed" desc="imports...">
import static java.lang.Double.parseDouble;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.Scanner;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 * 
 * Description: ...
 * 
 * @version 1.0.0
 * @author tiago, 26/09/2019, 20:16:54
 * Last update: -
 *///</editor-fold>
public class Provinha2 {

    //<editor-fold defaultstate="collapsed" desc="static attributes...">
    public static Scanner scanner = new Scanner(System.in);
    //</editor-fold>

    //<editor-fold desc="executable method...">
    public static void main(String[] args) {        
        /**
         * 1) Solicite que o usuário digite um valor n, que deverá ser maior ou igual a 3. 
         *      Enquanto não for um número maior ou igual a 3, solicite que o usuário digite novamente.
         */        
        int numDigitado = 0;
       
        do {
            try {
                numDigitado = Integer.parseInt(readLine(
                        "Qual será o tamanho da sua matriz?"
                        + "\nObs.: Digite um número >= 3\n")
                );
            } catch (Exception e) { }            
        } while (numDigitado < 3);
        
        /**
         * 2) Crie uma matriz de inteiros, com n linhas e n colunas.
         */
        int[][] matriz = new int[numDigitado][numDigitado];
                
        /**
         * 3) Solicite que o usuário digite os valores para preencher a matriz.
         */
        for (int contLinha = 0; contLinha < matriz.length; contLinha++) {
            for (int contColuna = 0; contColuna < matriz[contLinha].length; contColuna++) {
                try {
                    matriz[contLinha][contColuna] = Integer.parseInt(readLine(
                            "Digite um número para a posição [" + contLinha + "][" + contColuna + "]: ")
                    );
                } catch (Exception e) { 
                }  
            }
        }
        
        /**
         * 4) Exiba os valores da matriz, no formato de matriz.
         */
        String cabecalhoElementoMatriz = "+------------";
        String desenhoMatriz = "";
        
        for (int contLinha = 0; contLinha < matriz.length; contLinha++) {
            //adicionado desenho coluna
            for (int contColuna = 0; contColuna < matriz[contLinha].length; contColuna++) {
                desenhoMatriz += cabecalhoElementoMatriz;
            }
            desenhoMatriz += "+\n";
            
            //inserindo números no desenho
            for (int contColuna = 0; contColuna < matriz[contLinha].length; contColuna++) {
                desenhoMatriz += String.format("|%12d", matriz[contLinha][contColuna]);
            }
            
            desenhoMatriz += "|\n";
        }
        
        //adicionado desenho coluna
        for (int contColuna = 0; contColuna < matriz[0].length; contColuna++) {
            desenhoMatriz += cabecalhoElementoMatriz;
        }
        desenhoMatriz += "+";
        
        println(desenhoMatriz);
        
        /**
         * 5) Solicite que o usuário digite um número x, 
         *      que deve representar um índice válido de linha ou coluna. 
         *      Enquanto não for válido, solicite que o usuário digite novamente. 
         *      Para que x seja válido, ele deve ser maior ou igual a zero e menor do que  n.
         */
        do {
            try {
                numDigitado = Integer.parseInt(readLine(
                        "Qual índice da matriz você está procurando?"
                        + "\nObs.: Digite um número >= 0 e < " + matriz.length + "\n")
                );
            } catch (Exception e) { }            
        } while (numDigitado < 0 || numDigitado >= matriz.length);
        
        /**
         * 6) Chame o método contaImparesLinha, passando como argumentos a matriz 
         *      e o valor de x. Esse método deverá retornar a quantidade de valores 
         *      ímpares que estão na linha x da matriz. 
         *      Exiba no main o valor retornado pelo método.
         * 8) Implemente o método contaImparesLinha, como foi descrito acima.
         */
        println("Na linha " + numDigitado + " existem " + contaImparesLinha(numDigitado, matriz) + " números ímpares");
        
        /**
         * 7) Chame o método somaParesColuna, passando como argumentos 
         *      a matriz e o valor de x. 
         *      Esse método deverá retornar a soma dos valores pares que estão 
         *      na coluna x da matriz. 
         *      Exiba no main o valor retornado pelo método.
         * 9) Implemente o método somaParesColuna, como foi descrito acima.
         */
        println("A soma dos números pares na coluna " + numDigitado + " é " + somaParesColuna(numDigitado, matriz));
        
        
    }//main
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="static and auxiliary methods...">
    public static int contaImparesLinha(int linhaProcurada, int[][] matriz){
        int contaImpares = 0;
        
        for (int contColuna = 0; contColuna < matriz[linhaProcurada].length; contColuna++) {
            if ((matriz[linhaProcurada][contColuna] % 2) != 0) {
                contaImpares++;
            }
        }
        
        return contaImpares;
    }
    
    public static int somaParesColuna(int colunaProcurada, int[][] matriz){
        int somaPares = 0;
        
        for (int contLinha = 0; contLinha < matriz.length; contLinha++) {
            if ((matriz[contLinha][colunaProcurada] % 2) == 0) {
                somaPares += matriz[contLinha][colunaProcurada];
            }
        }
        
        return somaPares;
    }
    
    //métodos auxiliares iniciais
    public static void print(Object message) {
        System.out.print(message);
    }

    public static void println(Object message) {
        System.out.println(message);
    }

    public static String readLine(Object message) {
        print(message);
        String readValue = "";
        try {
            readValue = scanner.nextLine();
        } catch (Exception e) {
        }
        print("");
        return readValue;
    }
    
    public static void showMessageDialog(Object message){
        JOptionPane.showMessageDialog(null, message, "Write Operation", JOptionPane.PLAIN_MESSAGE);
    }
    
    public static String showInputDialog(Object message){
        String readValue = "";
        try {
            readValue = JOptionPane.showInputDialog(null, message, "Read Operation", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception e) {
        }
        return readValue;
    }
    //</editor-fold>

}//class
