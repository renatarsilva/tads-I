/* 5. Crie um algoritmo que receba como entrada o sexo de uma pessoa (M para
*  Masculino e F para Feminino), sua altura (em centímetros) e calcule o seu
*  peso ideal, utilizando as seguintes fórmulas:
*  a) Homens ➔ 52 + (0,75 * (altura - 152,4))
*  b) Mulheres ➔ 52 + (0,67 * (altura - 152,4))
*/

package aula6_24032025_Lista1EstruturaDeDecisao;

import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variáveis
        String sexo;
        double altura, calculo=0;

        //Entrada de dados
        System.out.println("Digite seu sexo:");
        sexo = scan.nextLine();

        System.out.println("Digite sua altura:");
        altura = scan.nextDouble();

        //Condições
        if (sexo.equalsIgnoreCase("M")) {
            calculo = 52 + (0.75 * (altura - 152.4));
        }
        else if (sexo.equalsIgnoreCase("F")) {
            calculo = 52 + (0.67 * (altura - 152.4));
        }
        System.out.printf("Seu peso ideal é %.3f", calculo);
    }
}
