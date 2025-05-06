/*
* 9. Crie um algoritmo que mostre o menu de opções a seguir, receba a opção do
*    usuário e os dados necessários para executar cada operação.
*
*    **** Menu de Opções *****
*    1. Somar dois números
*    2. Raiz quadrada de um número
*    3. Elevar um número a uma potência
*    **** Digite a opção desejada ****
*/

package aula6_24032025_Lista1EstruturaDeDecisao;

import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variavéis
        int opcao;

        //Entrada de dados
        System.out.println(
                "**** Menu de Opções *****\n" +
                        " 1. Somar dois números\n" +
                        " 2. Raiz quadrada de um número\n" +
                        " 3. Elevar um número a uma potência\n" +
                        " **** Digite a opção desejada ****");
        opcao = scan.nextInt();

        //Condições
        switch (opcao) {
            case 1:
                double num1, num2, soma;

                System.out.println("Digite o valor 1:");
                num1 = scan.nextDouble();

                System.out.println("Digite o valor 2:");
                num2 = scan.nextDouble();
                soma = num1 + num2;

                System.out.printf("A soma de %.2f + %.2f é %.2f", num1, num2, soma);
                break;
            case 2:
                double num4, raiz;

                System.out.println("Digite um valor para raiz:");
                num4 = scan.nextDouble();
                raiz = Math.sqrt(num4);
                System.out.printf("A raiz quadrada de %.2f é %.4f.", num4, raiz);
                break;
            case 3:
                double num5, elevar;

                System.out.println("Digite um valor para elevar:");
                num5 = scan.nextDouble();
                elevar = Math.pow(num5, 2);
                System.out.printf("A potência de %.2f, é %.2f.", num5, elevar);
                break;
            default:
                System.out.println("Opção invalida!");
                System.exit(0);
        }
    }
}
