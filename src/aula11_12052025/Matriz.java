import java.util.Random;

public class Matriz {
    public static void main(String[] args) {
        Random rand = new Random();
        // array bidimensional de 10 x 10
        int[][] matriz = new int[10][10];
        // preenchendo o array
        // for das "linhas"
        for (int i = 0; i < matriz.length; i++) {
            // for das colunas
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(1000);
            }
        }
        // exibir o conteÃºdo do array
        // for das "linhas"
        for (int[] arr : matriz) {
            // for das colunas
            for (int num : arr) {
                System.out.printf("%3d ", num);
            }
            // quebra de linha
            System.out.println();
        }
    }
}
