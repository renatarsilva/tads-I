/*
* 12. Crie um algoritmo que receba como entrada o valor do saque a ser realizado
* pelo cliente de um banco e retorne quantas notas de cada valor serão
* necessárias para atender ao saque com a menor quantidade de notas
* possível. Serão utilizadas notas de 100, 50, 20, 10 e 5 reais. Dica ➔ lembrese do operador de resto da divisão de inteiros (%). Considere que os valores
* informados para saque serão sempre múltiplos de 5.
*/

package aula3_24022025;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);

        int saque, nota100, nota50, nota20, nota10, nota5;

        System.out.println("Digite o valor do saque: ");
        saque = leia.nextInt();

        nota100 =  saque / 100;
        System.out.println("Qtd. notas de 100 " + nota100);

        nota50 = (saque % 100) / 50;
        System.out.println("Qtd. notas de 50 " + nota50);

        nota20 =  ((saque % 100) % 50) / 20;
        System.out.println("Qtd. notas de 20 " + nota20);

        nota10 = (((saque % 100) % 50) % 20) / 10;
        System.out.println("Qtd. notas de 10 " + nota10);

        nota5 = ((((saque % 100) % 50) % 20) % 10) / 5;
        System.out.println("Qtd. notas de 5 " + nota5);
    }
}
