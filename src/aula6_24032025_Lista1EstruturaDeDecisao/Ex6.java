/* 6. Crie um algoritmo que leia o salário de um funcionário, calcule e mostre seu
*  novo salário acrescido de bonificação e auxílio escola:
*
*  Salário Bonificação
*  Abaixo de R$ 2000,00 (inclusive) 10%
*  Entre R$ 2000,00 e R$ 3000,00 (inclusive) 8%
*  Acima de R$ 3000,00 5%
*
*  Salário Auxílio Escola
*  Abaixo de R$ 2500,00 (inclusive) R$ 350,00
*  Acima de R$ 2500,00 R$ 300,00
* */

package aula6_24032025_Lista1EstruturaDeDecisao;

import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variáveis
        double salario = 0, bonificacao = 0, auxilio = 0, calculo = 0, valorFinal =0;

        //Entrada de dados
        System.out.println("Digite o salário:");
        salario = scan.nextFloat();

        //Condições bonificaçã0
        if (salario < 2000) {
            bonificacao = (salario * 10) / 100;
            calculo = (salario + bonificacao);
        } else if (salario >= 2000 && salario <= 3000) {
            bonificacao = (salario * 8) / 100;
            calculo = (salario + bonificacao);
        } else {
            bonificacao = (salario * 5) / 100;
            calculo = (salario + bonificacao);
        };

        //Condições auxilio escola
        if (salario <= 2500 ) {
            auxilio = 350;
            valorFinal = calculo + auxilio;
        } else {
            auxilio = 300;
            valorFinal = calculo + auxilio;
        }

        System.out.printf("Salário R$%.2f + bonificação R$%.2f + auxílio R$%.2f, valor Total R$%.2f.", salario, bonificacao, auxilio, valorFinal);
        }
}
