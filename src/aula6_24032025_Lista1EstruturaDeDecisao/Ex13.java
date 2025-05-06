/*
* 13. Crie um algoritmo em que o usuário digite seu plano de saúde, e seja exibido
* o valor da sua respectiva mensalidade, de acordo com a tabela abaixo. Caso
* seja informado um plano inválido, avise o usuário.
* Tipo do Plano Valor do Plano
* Básico R$ 150,00
* Bronze R$ 220,00
* Prata R$ 310,00
* Ouro R$ 450,00
*/

package aula6_24032025_Lista1EstruturaDeDecisao;

import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variavéis
        String plano;
        float valor;

        //Entrada de dados
        System.out.println("Digite seu plano: ");
        plano = scan.next();
        plano = plano.toLowerCase();

        //Condições
        switch(plano) {
            case "basico", "básico" -> valor = 150;
            case "bronze" -> valor = 220;
            case "prata" -> valor = 310;
            case "ouro" -> valor = 450;
            default -> {
                System.out.println("Plano inválido!");
                return;
            }
        }
        System.out.printf("O valor do plano %s é %6.2f", plano, valor);
    }
}
