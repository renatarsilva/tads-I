/*
* 15. Crie um programa que receba:
* • O código de um produto comprado, supondo que a digitação do produto
* seja sempre válida, ou seja, um número inteiro entre 1 e 10;
* • O peso do produto em quilos;
* • O código do país de origem, supondo que a digitação do código seja
* sempre válida, ou seja, um número inteiro entre 1 e 3.
* Cód. país origem Imposto
* 1 0%
* 2 15%
* 3 25%
* Cód. Produto Preço (g)
* 1 a 4 10,00
* 5 a 7 25,00
* 8 a 10 35,00
* Calcule e mostre:
* • O peso do produto convertido em gramas
* • O preço total do produto comprado
* • O valor do imposto, que é cobrado sobre o preço total do produto
* comprado
* • O valor total, preço total do produto mais imposto
*/
package aula6_24032025_Lista1EstruturaDeDecisao;

import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variavéis
        int codigoProdutoComprado, codigoPaisOrigem, imposto =0;
        float pesoProduto =0, precoTotal=0, valorImposto=0, precoTotalImposto=0;

        //Entrada de dados
        System.out.println("Digite o código do produto:");
        codigoProdutoComprado = scan.nextInt();

        //Condições
        if (codigoProdutoComprado < 1 || codigoProdutoComprado > 10){
            System.out.println("O código do produto deve estar entre 1 e 10!");
            System.exit(0);
        };

        System.out.println("Digite o peso dos produtos em kilos: ");
        pesoProduto = scan.nextFloat();

        if (pesoProduto <0){
            System.out.println("O peso do produto dever ser maior que zero!");
            System.exit(0);
        };

        System.out.println("Digite o código do País:");
        codigoPaisOrigem = scan.nextInt();

        switch(codigoPaisOrigem){
            case 1: imposto = 0;
            break;
            case 2: imposto = 15;
            break;
            case 3: imposto = 25;
            break;
            default:
                System.out.println("O código do País de origem é inválido!");
                System.exit(0);
        }

        pesoProduto = pesoProduto * 1000;

        if (codigoProdutoComprado >= 1 && codigoProdutoComprado <=4){
            precoTotal = 10*pesoProduto;
            valorImposto = precoTotal * imposto / 100;
            precoTotalImposto = precoTotal + valorImposto;
        } else if (codigoProdutoComprado >= 5 && codigoProdutoComprado <=7){
            precoTotal = 25*pesoProduto;
            valorImposto = precoTotal * imposto / 100;
            precoTotalImposto = precoTotal + valorImposto;
        } else {
            precoTotal = 35*pesoProduto;
            valorImposto = precoTotal * imposto / 100;
            precoTotalImposto = precoTotal + valorImposto;
        };

        System.out.printf("Peso produto em gramas: %.0f \n", pesoProduto);
        System.out.printf("O preco total do produto comprado é: R$%.2f \n", precoTotal);
        System.out.printf("O valor do imposto sob o produto comprado é de R$%.2f \n", valorImposto);
        System.out.printf("O valor total, preço do produto + imposto: R$%.2f \n", precoTotalImposto);
    }
}
