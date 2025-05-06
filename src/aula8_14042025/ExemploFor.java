package aula8_14042025;

import java.util.Scanner;

public class ExemploFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Informe o %dÂē valor%n", i);
            media += sc.nextDouble();
        }
        media = media / 10;
        System.out.println("A mÃŠdia ÃŠ " + media);

    }
}
