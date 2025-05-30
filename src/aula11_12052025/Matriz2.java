package aula11_12052025;

import java.util.Random;

public class Matriz2 {
    public static void main(String[] args) {
        Random rand = new Random();
        // array tridimensional de 5 x 7 x 3
        int[][][] matriz = new int[5][7][3];
        // preenchendo o array
        // for das "linhas"
        for (int i = 0; i < matriz.length; i++) {
            // for das colunas
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz[i][j].length; k++) {
                    matriz[i][j][k] = rand.nextInt(1000);
                }

            }
        }
        // exibir o conteÃºdo do array

        for (int[][] arrBi : matriz) {
            // for das "linhas"
            for (int[] arr : arrBi) {
                // for das colunas
                for (int num : arr) {
                    System.out.printf("%3d ", num);
                }
                // quebra de linha
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }
}
