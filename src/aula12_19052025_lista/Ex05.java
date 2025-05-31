package aula12_19052025_lista;
// Preencha um array bidimensional de 5 x 5 com números reais. Em seguida, exiba os valores e posições dos números maiores que 50.

import java.util.Random;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        double[][] matriz = new double[5][5];
        Random random = new Random();

        for(int i =0; i < 5; i++){// percorrendo linhas
            for(int j =0; j < 5; j++){ //percorre colunas
                matriz[i][j] = Math.round(random.nextDouble() * 10000.0)/100.0;
            }
        }

        for(int i =0; i < 5; i++){// percorrendo linhas
            for(int j =0; j < 5; j++){ // percorre colunas
            }
            System.out.println();
        }

        for(int i=0; i< 5; i++){
            for (int j =0; j < 5; j++){
                if (matriz[i][j] > 50 ){
                    System.out.println("valor: "+ matriz[i][j] + " posiçao: "+i +j );
                }
            }
        }
    }
}
