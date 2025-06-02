package aula12_19052025_lista;

import java.util.Random;

public class Ex04 {
    static Random rand = new Random();

    public static void main(String[] args) {
        int [] array = new int [100];

        for(int i =0; i< array.length;i++){
            int contador = 0;

            array[i] = rand.nextInt(0,101);
            for( int j=1; j<= array[i];j++){
                if (array[i]%j==0){
                    contador++;
                } if (contador > 2){
                    break;
                } if(j== array[i] && contador <3){
                    System.out.println(array[i]+"\nPosição: "+i);
                }
            }
        }
    }
}
