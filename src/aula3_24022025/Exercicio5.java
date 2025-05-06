/*
* 5. Crie um algoritmo que receba o raio de um círculo, calcule e mostre a sua
* área e o seu perímetro.
*/

package aula3_24022025;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double raio, area, perimetro;

        System.out.println("Qual o valor do raio do Circulo?");
        raio = leia.nextDouble();

        area = Math.PI * Math.pow(raio, 2);

        perimetro = 2 * Math.PI * raio;

        System.out.printf("A area do circulo é: " + area + "%n O perimetro do circulo é: " + perimetro);
    }
}

