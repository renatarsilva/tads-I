/*
* 10. Crie um algoritmo que receba os valores dos catetos de um triângulo, calcule
* e mostre o valor da hipotenusa. c = a2 + b2
*/

package aula3_24022025;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        double a, b, c;

        Scanner leia = new Scanner(System.in);

        System.out.println("Qual o valor do cateto a?");
        a = leia.nextDouble();

        System.out.println("Qual o valor do cateto b?");
        b = leia.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.printf("O valor de c é : %.2f\n", c);
    }
}
