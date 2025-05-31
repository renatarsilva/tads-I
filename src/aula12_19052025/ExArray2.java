package aula12_19052025;

// 2 - Use o metodo anterior para preencher um array com valores não repetidos.

import java.util.Random;

public class ExArray2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int array[] = new int[10];

        preencher(array, rand);

        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void preencher(int array[], Random rand) {

        for(int i = 0; i < array.length; i++) {

            int num;
            boolean validador;

            do {
                num = rand.nextInt(0,12);
                validador = true;

                for (int j = 0; j < array.length; j++) {
                    if (num == array[j]) {
                        validador = false;
                    }
                }
            } while (validador == false);
            array[i] = num;
        }
    }
}