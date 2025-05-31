package aula12_19052025_lista;

// Prencha um array tridimensional apenas com valores pares. Em seguida, conte quantos valores são divisíveis por 5.

import java.util.Random;

public class Ex07 {
    static Random rand = new Random();
    public static void main(String[] args) {

        int array[][][] = new int[10][10][10];
        preencher(array);
        exibir(array);

    }

    public static void preencher(int array[][][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    do { array[i][j][k] = rand.nextInt(10);
                    }
                    while( array[i][j][k] % 2 != 0 );

                }
            }
        }

    }

    public static void exibir(int array [][][]){
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    if ( array [i][j][k] % 5 == 0){
                        temp ++;
                    }
                }
            }
        }
        System.out.println(temp);
    }
}
