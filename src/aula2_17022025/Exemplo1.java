package aula2_17022025;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        double n1, n2, n3, n4, media;
        Scanner ler = new Scanner(System.in);
        String nome;

        // entrada de dados
        System.out.println("Informe o seu nome:");
        nome = ler.nextLine();

        System.out.println("Informe as suas 4 notas:");
        n1 = ler.nextDouble();
        n2 = ler.nextDouble();
        n3 = ler.nextDouble();
        n4 = ler.nextDouble();

        // calcular média
        media = (n1 + n2 + n3 + n4) / 4;

        // saída de dados
        System.out.println(nome + ", sua média é " + media);
        ler.close();
    }
}
