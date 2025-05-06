/*
* 4. Crie um algoritmo que receba como entrada a base e a altura de um triângulo,
* calcule e mostre a sua área.
*/

package aula3_24022025;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        Double base, altura, area;
        System.out.println("Digite o valor da base:");
        base = leia.nextDouble();

        System.out.println("Digite o valor da altura");
        altura = leia.nextDouble();

        area = base * altura / 2;

        System.out.println("O valor da area é:" + area);
    }
}
