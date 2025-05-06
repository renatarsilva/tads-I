package aula7_07042025;

public class Exercicio2 {
    public static void main(String[] args) {
        if (ehPar(5)) {
            System.out.println("Ã‰ par");
        } else {
            System.out.println("Ã‰ Ã­mpar");
        }
    }

    public static int calcularResto(int n1, int n2) {
        return n1 % n2;
    }

    public static boolean ehPar(int numero) {
        return calcularResto(numero, 2) == 0;
    }

    public static boolean ehMultiplo(int n1, int n2) {
        return calcularResto(n1, n2) == 0;
    }
}
