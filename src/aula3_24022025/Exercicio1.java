/*
* 1. Crie um algoritmo que receba três notas e seus respectivos pesos, calcule e
* mostre a média ponderada entre elas
*/

package aula3_24022025;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float nota1, nota2 ,nota3, media;
        int peso1, peso2, peso3;

        System.out.print("Digite a primeira nota: ");
        nota1 = teclado.nextFloat();
        System.out.print("Digite o peso da nota 1: ");
        peso1 = teclado.nextInt();

        System.out.print("Digite a Segunda nota: ");
        nota2 = teclado.nextFloat();
        System.out.print("Digite o peso da nota 2: ");
        peso2 = teclado.nextInt();

        System.out.print("Digite a Terceira nota: ");
        nota3 = teclado.nextFloat();
        System.out.print("Digite o peso da nota 3: ");
        peso3 = teclado.nextInt();


        media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        System.out.printf("%nNotas | Pesos %n%6.2f|%6d%n%6.2f|%6d%n%6.2f|%6d%n %nMédia  | %6.2f%n",
                nota1, peso1, nota2, peso2, nota3, peso3, media);
    }
}