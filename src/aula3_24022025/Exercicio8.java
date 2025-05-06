/*
* 8. Pedro comprou um saco de ração com peso em Kg. Ele possui dois gatos,
* para os quais fornece a quantidade de ração em gramas. A quantidade diária
* de ração fornecida para cada gato é sempre a mesma. Crie um algoritmo que
* receba o peso do saco de ração e a quantidade de ração fornecida para cada
* gato, calcule e mostre quanto restará de ração no saco após cinco dias.
*/

package aula3_24022025;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float racao, gato, calculo, resultado;

        System.out.println("Qual o peso do saco de ração? ");
        racao = leia.nextFloat();


        System.out.println("Qual a quantidade de racao?");
        gato = leia.nextFloat();

        calculo = (gato * 2) * 5;
        racao = racao * 1000;

        resultado = racao - calculo;

        System.out.println("Restará: " + resultado);
    }
}

