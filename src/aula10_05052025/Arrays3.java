package aula10_05052025;

import java.util.Random;

public class Arrays3 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        System.out.println("Array1: "+array1);
        int[] array2 = {0,2,4,6,8};
        System.out.println("Array2: "+array2);
        int[] array3 = array2;
        System.out.println("Array3: "+array3);
        array1 = array2;
        // aqui as duas variÃ¡veis apontarÃ£o para o mesmo array
        array1[0] = 4;
        array2[0] = 8;
        System.out.println(array3[0]);
        System.out.println(array1[0]);
        System.out.println(array2[0]);
        // aqui as 3 impressÃµes serÃ£o as mesmas
        System.out.println("Array1: "+array1);
        System.out.println("Array2: "+array2);
        System.out.println("Array3: "+array3);
        // passa o array para o método preencher
        preencher(array1);
        System.out.println(array2[0]);
    }

    public static void preencher(int[] array) {
        System.out.println("Array no mÃ©todo preencher: "+array);
        Random rand = new Random();
        for(int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
    }
}
