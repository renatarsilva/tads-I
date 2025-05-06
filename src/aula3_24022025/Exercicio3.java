/*
* Crie um algoritmo que receba o salário bruto de um funcionário e exiba o seu
* salário líquido, sabendo que ele tem 10% de gratificação sobre o salário bruto
* e tem 15% de descontos sobre o salário após a gratificação.
*/

package aula3_24022025;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double salarioBruto, gratificacao, desconto, salario; //variavel

        System.out.println("Digite o salário bruto: ");
        salarioBruto = leia.nextDouble();

        gratificacao = salarioBruto * 0.10; // Recebe o valor da gratificacao
        salario = salarioBruto + gratificacao; // Recebe o valor do salario + Gratificacao
        desconto = salario - (salario * 0.15); // Recebe o valor do desconto

        System.out.printf("O valor do salário liquido: R$ %.2f\n", desconto);
    }
}
