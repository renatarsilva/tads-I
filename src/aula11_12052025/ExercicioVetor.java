package aula11_12052025;

import java.util.Arrays;
import java.util.Random;

/*
Criar um vetor com 10 elementos inteiros. Construir um outro vetor de mesmo tipo e tamanho e com os mesmos elementos do primeiro vetor.

Criar dois vetores com 100 elementos do tipo inteiro cada um, gerados aleatoriamente. Criar um terceiro vetor tambÃ©m com 100 elementos, e em cada posiÃ§Ã£o deste terceiro vetor, somar os valores das respectivas posiÃ§Ãµes no primeiro e segundo vetores.

Criar um metodo que identifica o menor elemento em um vetor de inteiros.

Criar um metodo que realiza a soma de todos os elementos de um vetor.
*/
public class ExercicioVetor {
    public static Random rand = new Random();

    public static void main(String[] args) {
        int[] vetor = { 5, 7, 9, 8, 1, 6, 4, 3 };
        ex1();
        ex2();
        System.out.println("Menor: " + ex3(vetor));
        System.out.println("Soma: " + ex4(vetor));
    }

    public static void ex1() {
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[vetor1.length];
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = rand.nextInt(100);
        }

        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = vetor1[i];
        }
        System.out.println(Arrays.toString(vetor1));
        System.out.println(Arrays.toString(vetor2));
    }

    public static void ex2() {
        int[] vetor1 = new int[100];
        int[] vetor2 = new int[vetor1.length];
        int[] vetor3 = new int[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = rand.nextInt(100);
            vetor2[i] = rand.nextInt(100);
            vetor3[i] = vetor1[i] + vetor2[i];
        }

        System.out.println(Arrays.toString(vetor1));
        System.out.println(Arrays.toString(vetor2));
        System.out.println(Arrays.toString(vetor3));
    }

    public static int ex3(int[] vetor) {
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    public static int ex4(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }
}
