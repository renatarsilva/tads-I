package aula10_05052025;

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notas[] = new int[3];
        int media = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota " + (i + 1));
            notas[i] = sc.nextInt();
            media += notas[i];
        }
        media /= notas.length;
        System.out.println("A média é " + media);

    }
}
