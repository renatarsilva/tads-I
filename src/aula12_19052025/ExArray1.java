package aula12_19052025;

// 1 - Crie um metodo que verifica se um array possui um determinado valor.

import java.util.Random;
public class ExArray1 {

    static Random random = new Random();
    public static void main(String[] args) {
        int[] array = new int[3];
        preencher(array);
        verifica(array);
    }

    public static void preencher(int array[]){
        for (int j = 0; j < array.length; j++) {
            array[j] = random.nextInt(0,3);
            System.out.println(array[j]);
        }
    }

    public static void verifica (int array[]) {
    for (int i =0 ; i< array.length; i++ ){
        if (array [i] == 2){
            System.out.println("valor encontrado");
        } else {
            System.out.println("valor nao encontrado");
        }
        }
    }
}
