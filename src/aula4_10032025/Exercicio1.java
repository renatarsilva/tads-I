package aula4_10032025;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = 0, num2 = 0;

        System.out.println("Digite número1:");
        num1 = scan.nextInt();

        System.out.println("Digite número2:");
        num2 = scan.nextInt();

        if (num1 > num2){
            System.out.println("número 1, maior que número 2");
        } else if (num2 > num1){
            System.out.println("número 2, maior que número 1");
        } else{
            System.out.println("os dois números sao iguais");
        }
    }
}
