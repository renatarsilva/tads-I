package aula7_07042025;

import java.util.Scanner;

public class Exercicio1 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // variÃ¡vel local
        String pessoa;
        System.out.println("Informe o nome da pessoa");
        pessoa = sc.next();
        exibirSaudacao(pessoa);
        exibirSaudacao(pessoa, 18);
        exibirSaudacao(90, pessoa);
        double soma = somar(7, 8, 5);
        System.out.println(soma);
    }

    /**
     * Este mÃ©todo soma dois valores e retorna o resultado
     *
     * @param n1 primeiro valor a ser somado
     * @param n2 segundo valor a ser somado
     * @return soma dos dois valores
     */
    public static double somar(double n1, double n2) {
        double resultado = n1 + n2;
        return resultado;
    }

    /**
     * Este mÃ©todo soma trÃªs valores e retorna o resultado
     *
     * @param n1 primeiro valor a ser somado
     * @param n2 segundo valor a ser somado
     * @param n3 terceiro valor a ser somado
     * @return soma dos trÃªs valores
     */
    public static double somar(double n1, double n2, double n3) {
        double resultado = n1 + n2 + n3;
        return resultado;
    }

    /**
     * Este mÃ©todo exibe uma saudaÃ§Ã£o na tela
     *
     * @param nome nome da pessoa a ser saudada
     */
    public static void exibirSaudacao(String nome) {
        System.out.println("********************");
        System.out.println("Ola " + nome);
        System.out.println("********************");
    }

    /**
     * Este mÃ©todo exibe uma saudaÃ§Ã£o na tela
     *
     * @param nome  nome da pessoa a ser saudada
     * @param idade idade da pessoa a ser saudada
     */
    public static void exibirSaudacao(String nome, int idade) {
        System.out.printf("OlÃ¡ %s. VocÃª tem %d anos%n", nome, idade);
    }

    /**
     * Este mÃ©todo exibe uma saudaÃ§Ã£o na tela
     *
     * @param peso peso da pessoa a ser saudada
     * @param nome nome da pessoa a ser saudada
     */
    public static void exibirSaudacao(int peso, String nome) {
        System.out.printf("OlÃ¡ %s. VocÃª pesa %d kg%n", nome, peso);
    }
}

