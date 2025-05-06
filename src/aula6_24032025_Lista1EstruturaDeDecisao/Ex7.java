/*
* 7. Você foi solicitado a criar um programa para acompanhamento de peso, no
* qual através do peso e da altura calcula-se o IMC.
*
*  Após o cálculo, deverá ser
* informada a classificação, conforme tabela abaixo. (IMC = Peso / Altura²)
*
* IMC Classificação
* Menor ou igual a 16 Magreza Severa
* Entre 16 e 17 Magreza Moderada
* Entre 17 e 18.5 Magreza Leve
* Entre 18.5 e 25 Normal
* Entre 25 e 30 Obesidade Leve
* Entre 30 e 40 Obesidade Severa
* Acima de 40 Obesidade Mórbida
*/

package aula6_24032025_Lista1EstruturaDeDecisao;

import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variáveis
        float peso = 0, altura = 0;
        double IMC = 0;

        //Entrada de dados
        System.out.println("Informe seu peso, (exemplo: 60,0): ");
        peso = scan.nextFloat();

        System.out.println("Informe sua altura (exemplo: 1,60): ");
        altura = scan.nextFloat();

        IMC = peso / Math.pow(altura, 2);

        //Condições
        if (peso <= 0 || altura <= 0) {
            System.out.println("Valores inválidos!");
            System.exit(0);
        };

        if (IMC <= 16) {
            System.out.printf("Seu IMC é de %f, classificação:Magreza severa", IMC);

        } else if (IMC <= 17) {
            System.out.printf("Seu IMC é de %f, classificação:Magreza moderada", IMC);

        } else if (IMC <= 18.5) {
            System.out.printf("Seu IMC é de %f classificação:Magreza leve", IMC);

        } else if (IMC <= 25) {
            System.out.printf("Seu IMC é de %f classificação:Normal", IMC);

        } else if (IMC <= 30) {
            System.out.printf("Seu IMC é de %f classificação:Obesidade leve", IMC);

        } else if (IMC <= 40) {
            System.out.printf("Seu IMC é de %f classificação:Obesidade severa", IMC);

        } else {
            System.out.printf("Seu IMC é de %f classificação:Obesidade mórbida", IMC);
        }

    }
}
