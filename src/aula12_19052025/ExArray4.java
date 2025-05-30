package aula12_19052025;

import java.util.Random;

//4 - Preencha um array unidimensional com 100 nÃºmeros inteiros. Em seguida, escreva os elementos que sÃ£o primos e suas respectivas posiÃ§Ãµes.
public class ExArray4 {

    static Random rand = new Random();

    public static void main(String[] args) {
        int[] array = new int[100];
        preencher(array);
        exibir(array);
    }

    public static void preencher(int[] arrayRef) {
        for (int i = 0; i < arrayRef.length; i++) {
            arrayRef[i] = rand.nextInt(1000);
        }
    }

    public static void exibir(int[] arrayRef) {
        for (int i = 0; i < arrayRef.length; i++) {
            if (isPrimo(arrayRef[i])) {
                System.out.printf("O valor %d Ã© primo. PosiÃ§Ã£o [%d]\n", arrayRef[i], i);
            }
        }
    }

    // verifica se um nÃºmero Ã© primo
    public static boolean isPrimo(int n) {
        boolean primo = true;
        int div = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                div++;
                if (div > 2) {
                    primo = false;
                    break;
                }
            }
        }
        return primo;
    }
}