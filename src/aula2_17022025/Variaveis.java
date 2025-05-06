package aula2_17022025;

public class Variaveis {
    public static void main(String[] args) {
        // declaração de variáveis
        byte numero = 100;
        short ano = 2025;
        int num2 = 100000;
        long num3 = 100000000000L;
        float num4 = 5.5f;
        double num5 = 199.99;
        String aluno = "João";
        // atribuir o caractere explicitamente
        char letra = 'A';
        // atribuir pelo código ASCII
        char letra2 = 70;
        // atribuir pelo código Unicode
        char letra3 = '\u01f6';

        // imprimindo os valores das variáveis
        System.out.println("char: " + letra);
        System.out.println("char: " + letra2);
        System.out.println("char: " + letra3);
        System.out.println("byte: " + numero);
        System.out.println("short: " + ano);
        System.out.println("int: " + num2);
        System.out.println("long: " + num3);
        System.out.println("float: " + num4);
        System.out.println("double: " + num5);
        System.out.println("String: " + aluno);
    }
}