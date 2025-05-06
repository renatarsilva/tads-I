/*
* 11. Crie um algoritmo que receba dois valores literais, armazene-os em variáveis
* distintas e após o armazenamento troque os conteúdos das variáveis. Ao
* término, o algoritmo deve mostrar o novo conteúdo de cada variável.
*/

package aula3_24022025;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float a, b, c=0;

        System.out.println("Deposite o valor de a: ");
        a = leia.nextFloat();

        System.out.println("Deposite o valor de b: ");
        b = leia.nextFloat();

        c = a;
        a = b;
        b = c;

        System.out.println("O valor de a é = " + a + "O valor de b = " + b);
    }
}
