package aula2_17022025;

import java.util.Scanner;

public class Somar2Numeros {
    public static void main(String[] args) {

        int num1, num2, soma;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o 1º número");
        num1 = scan.nextInt();
        System.out.println("Informe o 2º número");
        num2 = scan.nextInt();

        soma = num1 + num2;

        System.out.println("A soma é " + soma);

        scan.close();
    }
}