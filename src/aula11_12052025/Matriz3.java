package aula11_12052025;

import java.util.Random;

public class Matriz3 {
    public static void main(String[] args) {
        Random rand = new Random();
        // array de 5 dimensÃµes
        int[][][][][] matriz = new int[3][3][3][3][3];
        // preenchendo o array

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz[i][j].length; k++) {
                    for (int l = 0; l < matriz[i][j][k].length; l++) {
                        for (int m = 0; m < matriz[i][j][k][l].length; m++) {
                            matriz[i][j][k][l][m] = rand.nextInt(1000);
                        }

                    }
                }
            }
        }
        // exibir o conteÃºdo do array

        for (int[][][][] arrQua : matriz) {
            System.out.println("Array de Quatro");
            for (int[][][] arrTri : arrQua) {
                System.out.println("Array de TrÃªs");
                for (int[][] arrBi : arrTri) {
                    // for das "linhas"
                    for (int[] arrUn : arrBi) {
                        // for das colunas
                        for (int num : arrUn) {
                            System.out.printf("%3d ", num);
                        }
                        // quebra de linha
                        System.out.println();
                    }
                    System.out.println();
                }
            }
        }
    }
}
