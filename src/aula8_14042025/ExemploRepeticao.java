package aula8_14042025;

import java.util.Scanner;

public class ExemploRepeticao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        // uma forma de validaÃ§Ã£o
        do {
            System.out.println("Informe um nÃºmero primo");
            numero = sc.nextInt();
        } while (!isPrimo(numero));

        // outra forma de validaÃ§Ã£o
        do {
            System.out.println("Informe um nÃºmero primo");
            numero = sc.nextInt();
            if (!isPrimo(numero)) {
                System.out.println("NÃºmero invÃ¡lido");
                // continua no loop
                continue;
            }
            // interrompe o loop
            break;
        } while (true);
    }

    // tabuada sem repetiÃ§Ã£o
    public static void tabuada(int n) {
        System.out.printf("%2d x %2d = %2d%n", n, 1, n * 1);
        System.out.printf("%2d x %2d = %2d%n", n, 2, n * 2);
        System.out.printf("%2d x %2d = %2d%n", n, 3, n * 3);
        System.out.printf("%2d x %2d = %2d%n", n, 4, n * 4);
        System.out.printf("%2d x %2d = %2d%n", n, 5, n * 5);
        System.out.printf("%2d x %2d = %2d%n", n, 6, n * 6);
        System.out.printf("%2d x %2d = %2d%n", n, 7, n * 7);
        System.out.printf("%2d x %2d = %2d%n", n, 8, n * 8);
        System.out.printf("%2d x %2d = %2d%n", n, 9, n * 9);
        System.out.printf("%2d x %2d = %2d%n", n, 10, n * 10);
    }

    // tabuada usando o for
    public static void tabuadaFor(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d x %2d = %2d%n", n, i, n * i);
        }
    }

    // tabuada usando o while
    public static void tabuadaWhile(int n) {
        int i = 1;
        while (i <= 10) {
            System.out.printf("%2d x %2d = %2d%n", n, i, n * i);
            i++;
        }
    }

    // tabuada usando o do...while
    public static void tabuadaDoWhile(int n) {
        int i = 1;
        do {
            System.out.printf("%2d x %2d = %2d%n", n, i, n * i);
            i++;
        } while (i <= 10);
    }

    // fatorial
    public static int fatorial(int n) {
        int fat = 1;
        for (int i = n; i >= 1; i--) {
            // abaixo equivale a fat = fat * i
            fat *= i;
        }
        return fat;
    }

    // verifica se um nÃºmero Ã© primo
    public static boolean isPrimo(int n) {
        boolean primo = true;
        int div = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                div++;
                if (div > 2) {
                    primo = false;
                    break;
                }
            }
        }
        return primo;
    }
}