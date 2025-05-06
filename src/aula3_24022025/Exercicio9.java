/*
* Sabe-se que
* 1 𝑝é = 12 𝑝𝑜𝑙𝑒𝑔𝑎𝑑𝑎𝑠,
* 1 𝑗𝑎𝑟𝑑𝑎 = 3 𝑝é𝑠,
* 1 𝑚𝑖𝑙ℎ𝑎 = 1760 𝑗𝑎𝑟𝑑𝑎𝑠 .
* Crie um algoritmo que receba uma medida em pés, faça as conversões e
* mostre os resultados em:
* a) Polegadas;
* b) Jardas;
* c) Milhas.
*/

package aula3_24022025;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Double pes, polegadas, jarda, milha;

        System.out.println("Qual o valor da medida em pés?");
        pes = leia.nextDouble();

        polegadas = pes * 12;
        jarda = pes / 3;
        milha = jarda / 1760;

        System.out.printf("O resultado de polegas é: " + polegadas + "O resultado de jarda: " + jarda + "O resultado de milha: " + milha);
    }
}
