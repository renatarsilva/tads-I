package aula10_05052025;

import java.util.Random;

public class Arrays4 {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        preencher(numeros);
        // exibir(numeros);
        // exibirForEach(numeros);
        System.out.println(buscar(18, numeros));
    }

    public static int buscar(int valor, int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public static void exibirForEach(int[] vetor) {
        // foreach
        for (int n : vetor) {
            System.out.println(n);
        }
    }

    public static void exibir(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    // preenche o vetor com valores nÃ£o repetidos
    public static void preencher(int[] vetor) {
        Random rand = new Random();
        int aleat;
        for (int i = 0; i < vetor.length; i++) {
            do {
                aleat = rand.nextInt(100);
            } while (buscar(aleat, vetor) != -1);
            vetor[i] = aleat;
        }
    }
}
