/* 4. Crie um algoritmo que leia 3 valores e informe se o 3º valor informado está
*  entre os 2 primeiros.
*/

package aula6_24032025_Lista1EstruturaDeDecisao;

import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variáveis
        int num1, num2, num3;

        //Entrada de Dados
        System.out.println("Digite o valor 1:");
        num1 = scan.nextInt();

        System.out.println("Digite o valor 2:");
        num2 = scan.nextInt();

        System.out.println("Digite o valor 3:");
        num3 = scan.nextInt();

        //Condições
        if (num3 >= num1 && num3 <= num2 || num3 >= num2 && num3 <= num1) {
            System.out.print("O terceiro valor está entre o primeiro e o segundo.");
        } else {
            System.out.println("O terceiro valor não está entre o primeiro e o segundo.");
        }
    }
}

