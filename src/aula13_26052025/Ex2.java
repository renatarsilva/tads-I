package aula13_26052025;
import java.util.Scanner;

// andre

public class Ex2 {
        static Scanner userInput = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("Olá, informe a quantidade de linhas e colunas:");

            // Inputs
            int qtdDeLinhas = userInput.nextInt();
            int qtdDeColunas = userInput.nextInt();

            String [][] array = new String[qtdDeLinhas][qtdDeColunas];
            String tempString = "";

            /* Preencher/Exibir */

            for (int linha = 0; linha < array.length; linha++) {
                tempString = "";
                for (int coluna = 0; coluna < array[linha].length; coluna++) {
                    if (linha == 0) {
                        array[linha][coluna] = ":";
                        tempString += array[linha][coluna];
                    } else if (linha == array.length - 1) {
                        array[linha][coluna] = "-";
                        tempString += array[linha][coluna];
                    } else {
                        if (coluna == 0) {
                            array[linha][coluna] = ".";
                            tempString += array[linha][coluna];
                        } else if (coluna == qtdDeColunas - 1) {
                            array[linha][coluna] = "-";
                            tempString += array[linha][coluna];
                        } else {
                            array[linha][coluna] = " ";
                            tempString += array[linha][coluna];
                        }
                    }
                }
                System.out.println(tempString);
            }
        }
    }
