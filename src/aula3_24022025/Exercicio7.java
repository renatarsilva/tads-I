/*
* 7. Crie um algoritmo que receba os valores de 𝑎, 𝑏 𝑒 𝑐 e calcule a equação de
* segundo grau formada por 𝑎𝑥2 + 𝑏𝑥 + 𝑐 = 0.
*/

package aula3_24022025;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        double a, b, c, delta, x1, x2;

        Scanner leia = new Scanner(System.in);
        System.out.println ("Digite o valor de a: ");
        a = leia.nextDouble();
        System.out.println("Digite o valor de b: ");
        b = leia.nextDouble();
        System.out.println("Digite o valor de c: ");
        c =  leia.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;
        x1 = (-b + Math.sqrt(delta)) / 2 * a;
        x2 = (-b - Math.sqrt(delta)) / 2 * a;

        System.out.println("X1 =" + x1 + "X2 = " + x2);
    }
}
