/*
 * Crie um algoritmo que receba o nome e o salário de um funcionário. Após
 * isso, calcule seu novo salário sabendo que ele recebeu um aumento de 25%
 * e mostre uma frase com o nome, o valor do aumento e o novo salário.
 */

package aula3_24022025;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome;
        double salario, aumento;

        System.out.println("Informe o nome do funcionário");
        nome = scan.nextLine();

        System.out.println("Informe o salário do funcionário");
        salario = scan.nextDouble();

        aumento = salario * 0.25;

        salario += aumento;

        System.out.printf
                ("O funcionário %s teve um aumento de R$ %7.2f e seu novo salário é R$ %7.2f", nome,
                        aumento, salario);
    }
}