package aula4_10032025;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        int saque, nota100, nota50, nota20, nota10, nota5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor a ser sacado!");
        saque = sc.nextInt();
        // descobrir qtd de notas de 100
        nota100 = saque / 100;
        // armazena na variÃ¡vel saque o resto da divisÃ£o de saque por 100
        saque %= 100;
        // notas de 50
        nota50 = saque / 50;
        saque %= 50;
        // notas de 20
        nota20 = saque / 20;
        saque %= 20;
        // notas de 10
        nota10 = saque / 10;
        saque %= 10;
        // notas de 5
        nota5 = saque / 5;
        System.out.printf(
                "Notas de 100 = %d%nNotas de  50 = %d%nNotas de  20 = %d%nNotas de  10 = %d%nNotas de   5 = %d%n",
                nota100, nota50, nota20, nota10, nota5);
    }
}

