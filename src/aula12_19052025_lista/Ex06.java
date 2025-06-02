package aula12_19052025_lista;

import java.util.Random;

public class Ex06 {

    /*
     * Preencha um array bidimensional de 10 x 10 com números
     * inteiros positivos em todas as posições, exceto na diagonal
     * principal que deverá ser preenchida com o valor -1
     */
    public static void main(String[] args) {
        Random rand = new Random();

        String[][] array = new String[10][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (i == j) {
                    array[i][j] = "\\";
                } else {
                    array[i][j] = String.valueOf(rand.nextInt(9));
                }

                System.out.printf("%s ", array[i][j]);

            }
            System.out.println("");
        }
    }
}


