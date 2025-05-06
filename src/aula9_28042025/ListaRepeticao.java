package aula9_28042025;

import java.util.Scanner;

public class ListaRepeticao {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // ex1();
        // ex2();
        // ex3();
        // ex4();
    }

    // exibe a soma dos nÃºmeros de 1 atÃ© o valor informado pelo usuÃ¡rio
    public static void ex4() {
        int termino;
        System.out.println("Informe atÃ© qual termo realizar a soma");
        termino = sc.nextInt();
        ex3(1, termino);
    }

    // exibe a soma dos nÃºmeros de "ini" atÃ© "fim"
    public static void ex3(int ini, int fim) {
        int soma = 0;
        for (int i = ini; i <= fim; i++) {
            soma += i;
        }
        System.out.printf("A soma dos nÃºmeros de %d a %d Ã© %d", ini, fim, soma);
    }

    // exibe a soma dos nÃºmeros de 1 atÃ© 100
    public static void ex3() {
        ex3(1, 100);
    }

    // mostra os divisÃ­veis por "divisor" entre "ini" e "fim"
    public static void ex1(int ini, int fim, int divisor) {
        for (int i = ini; i < fim; i++) {
            if (i % divisor == 0) {
                System.out.printf("%d Ã© divisÃ­vel por %d%n", i, divisor);
            }
        }
    }

    // mostra os divisÃ­veis por 3 entre 50 e 9500
    public static void ex1() {
        // chama o mÃ©todo passando como parÃ¢metros, 50, 9500 e 3
        ex1(50, 9500, 3);
    }

    // exibe os nÃºmeros de "ini" ao "fim", e a cada mÃºltiplo de
    // "multiplo" exibe a mensagem que Ã© mÃºltiplo
    public static void ex2(int ini, int fim, int multiplo) {
        for (int i = ini; i <= fim; i++) {
            System.out.print(i);
            if (i % multiplo == 0) {
                System.out.print(" - MÃºltiplo de " + multiplo);
            }
            System.out.println();
        }
    }

    // exibe os nÃºmeros de 1 a 250 e a cada mÃºltiplo de 10 exibe a
    // mensagem que Ã© mÃºltiplo de 10
    public static void ex2() {
        ex2(1, 250, 10);
    }
}
