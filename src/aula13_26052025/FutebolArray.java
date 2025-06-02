package aula13_26052025;

import java.util.Random;
import java.util.Scanner;

public class FutebolArray {
    public static void main(String[] args) {

        // variáveis
        int[][] idades;
        double[][] pesos, alturas;
        Random rand = new Random();
        int qtdTime, qtdJog, qtd18 = 0, mediaIdade = 0;
        double mediaAltura = 0, qtd80 = 0, perc80;
        Scanner sc = new Scanner(System.in);

        // entrada de dados
        System.out.println("Quantos times serão?");
        qtdTime = sc.nextInt();
        System.out.println("Quantos jogadores serão?");
        qtdJog = sc.nextInt();

        // criar os arrays
        idades = new int[qtdTime][qtdJog];
        pesos = new double[qtdTime][qtdJog];
        alturas = new double[qtdTime][qtdJog];

        // receber os dados
        for (int time = 0; time < qtdTime; time++) {
            mediaIdade = 0;
            for (int jog = 0; jog < qtdJog; jog++) {
                idades[time][jog] = rand.nextInt(14, 22);
                if (idades[time][jog] < 18) {
                    qtd18++;
                }
                mediaIdade += idades[time][jog];
                pesos[time][jog] = rand.nextDouble(55, 90);
                if (pesos[time][jog] > 80) {
                    qtd80++;
                }
                alturas[time][jog] = rand.nextDouble(1.5, 1.9);
                mediaAltura += alturas[time][jog];
            }
            mediaIdade = mediaIdade / qtdJog;
            System.out.printf("Média de idade do time %d é %d%n", time + 1, mediaIdade);
        }
        mediaAltura = mediaAltura / (qtdTime * qtdJog);
        System.out.printf("Média de altura do campeonato: %.2f%n", mediaAltura);
        perc80 = qtd80 / (qtdTime * qtdJog) * 100;
        System.out.printf("%% de jogadores com mais de 80kg: %.2f%n", perc80);
    }
}