package provinha3;

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
public class Provinha3 {

    //<editor-fold defaultstate="collapsed" desc="static attributes...">
    public static Scanner scanner = new Scanner(System.in);
    //</editor-fold>
    
    public enum Mes{
        JANEIRO, FEVEREIRO, MARCO;
        
        public static String getMesAtual(int ordinal){
            switch (ordinal) {
                case 0:
                    return "Janeiro";
                
                case 1:
                    return "Fevereiro";
                
                case 2:
                    return "Março";
                
                default:
                    return "Janeiro";
            }
        }
    }
    
    //<editor-fold desc="executable method...">
    public static void main(String[] args) {        
        /**
         * 1) Escreva o código que solicita que o usuário digite o valor de 
         *      número máximo de funcionários maxFun que serão cadastrados no sistema. 
         *      Esse valor deverá ser um número maior ou igual a 3 e menor ou igual a 25. 
         *      Enquanto não for um número nesse intervalo, solicite que o usuário digite novamente.
         */        
        int maxFun = 0;
       
        do {
            try {
                maxFun = Integer.parseInt(readLine(
                        "Quantos funcionários você deseja cadastrar?"
                        + "\nObs.: Digite um número >= 3 e <= 25\n")
                );
            } catch (Exception e) { }            
        } while (maxFun < 3 || maxFun > 26);
        
        /**
         * 2) Depois, o programa deverá criar: 
         *      - o vetor funcionario, de String, com maxFun posições, 
         *          onde serão armazenados os nomes dos funcionários
         *      - a matriz ganho, de float ou double, com maxFun linhas e 3 colunas, 
         *          uma coluna para cada mês (janeiro, fevereiro, março), que vai 
         *          armazenar o valor ganho pelos funcionários em cada mês, supondo 
         *          que o valor ganho varie de mês para mês.
         *      - o vetor total, de float, com maxFun posições
         */
        String[] funcionario = new String[maxFun];
        double[][] ganho = new double[maxFun][3];
        float[] total = new float[maxFun];
                
        /**
         * 3) Solicite que o usuário digite os nomes dos funcionários, e depois 
         *      os valores que eles receberam em cada mês. 
         *      Os nomes dos funcionários devem ser inseridos no vetor funcionario 
         *      e os valores da remuneração na matriz ganho. 
         *      Cada linha da matriz ganho conterá os valores ganhos de um funcionário.
         * 4) Some os valores ganhos por cada funcionário (cada linha da matriz) 
         *      e armazene esse total no vetor total, no índice correspondente à linha da matriz. 
         *      Os valores ganhos pelo primeiro funcionário estão na linha zero da matriz. 
         *      A soma dos valores ganhos pelo primeiro funcionário deverá ser colocada 
         *      na posição zero do vetor total e assim sucessivamente.
         */
        for (int contLinha = 0; contLinha < ganho.length; contLinha++) {
            funcionario[contLinha] = readLine("Qual o nome do " + (contLinha + 1) + "º funcionário? ");
            
            for (int contColuna = 0; contColuna < ganho[contLinha].length; contColuna++) {
                try {
                    ganho[contLinha][contColuna] = parseDouble(readLine(
                            funcionario[contLinha] + ", quanto você ganhou em " + Mes.getMesAtual(contColuna) + "? "
                    ));
                } catch (Exception e) { 
                }
                
                total[contLinha] += ganho[contLinha][contColuna];
            }
        }
        
        /**
         * 5) Exiba todos os dados, em forma de tabela, apresentando na primeira coluna 
         *      os nomes dos funcionários, na segunda coluna, os ganhos de janeiro, 
         *      na terceira coluna, os ganhos de fevereiro, e assim sucessivamente. 
         *      A última coluna deverá exibir os totais dos ganhos de cada funcionário. 
         *      Não se esqueça de exibir os títulos das colunas.
         * 
         *      +------------+------------+------------+------------+------------+
         *      |   NOMES    |   JANEIRO  |  FEVEREIRO |    MARÇO   |     TOTAL  |
         *      +------------+------------+------------+------------+------------+
         * 
         * 
         */
        String cabecalhoElementoMatriz = "+------------";
        String desenhoMatriz = 
                "+------------+------------+------------+------------+------------+\n" +
                "|   NOMES    |   JANEIRO  |  FEVEREIRO |    MARÇO   |     TOTAL  |\n";
        
        for (int contLinha = 0; contLinha < maxFun; contLinha++) {
            //adicionado desenho coluna
            for (int contColuna = 0; contColuna < 5; contColuna++) {
                desenhoMatriz += cabecalhoElementoMatriz;
            }
            desenhoMatriz += "+\n";
            
            //inserindo nomes
            desenhoMatriz += String.format("|%12s", funcionario[contLinha]);
            
            //inserindo valores mensais
            for (int contColuna = 0; contColuna < ganho[contLinha].length; contColuna++) {
                desenhoMatriz += String.format("|%12s", String.format("%.2f", ganho[contLinha][contColuna]));
            }
                        
            //adicionado total salarial        
            desenhoMatriz += String.format("|%12s", String.format("%.2f", total[contLinha]));
            desenhoMatriz += "|\n";
        }
        
        for (int contColuna = 0; contColuna < 5; contColuna++) {
            desenhoMatriz += cabecalhoElementoMatriz;
        }
        desenhoMatriz += "+";
        
        println(desenhoMatriz);
        
        
        
        
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
