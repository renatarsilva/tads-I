package aula12_19052025;

import java.util.Random;

//5 - Preencha um array bidimensional de 5 x 5 com nÃºmeros reais. Em seguida, exiba os valores e posiÃ§Ãµes dos nÃºmeros maiores que 50.
public class ExArray5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] valores = new int[5][5];
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                valores[i][j] = rand.nextInt(70);
                if (valores[i][j] > 50) {
                    System.out.printf
                            ("Valor %d. PosiÃ§Ã£o [%d,%d]%n", valores[i][j], i, j);
                }
            }
        }
    }

}
