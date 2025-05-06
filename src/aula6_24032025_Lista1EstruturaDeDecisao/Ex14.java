/* Um vendedor precisa de um algoritmo que calcule o preço total devido por
*  um cliente.
*
* O algoritmo deve receber o código de um produto, a quantidade
*  comprada e calcular o preço total de acordo com a tabela abaixo. Mostre uma
*  mensagem no caso de código inválido.
*  Código Valor do Produto
*  A001 R$ 7,50
*  A002 R$ 9,90
*  A003 R$ 14,00
*  A004 R$ 19,99
*/

package aula6_24032025_Lista1EstruturaDeDecisao;

import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variavéis
        String codigoProduto;
        int qtdProduto;
        double valorCompra;

        //Entrada de Dados
        System.out.println("Digite o código do produto:");
        codigoProduto = scan.nextLine();
        codigoProduto = codigoProduto.toUpperCase();

        //Condições
        if (!codigoProduto.equals("A001") && !codigoProduto.equals("A002") && !codigoProduto.equals("A003") && !codigoProduto.equals("A004")) {
            System.out.println("Código inválido!");
        } else {
            System.out.println("Digite a quantidade do produto: ");
            qtdProduto = scan.nextInt();

        switch (codigoProduto) {
            case "A001":
                double valorA001 = 7.50;
                valorCompra = valorA001 * qtdProduto;

                System.out.printf("Quantidade item = %s, Valor unitário = R$%.2f, Valor total de itens = R$%.2f", qtdProduto, valorA001, valorCompra);
                break;
            case "A002":
                double valorA002 = 9.90;
                valorCompra = valorA002 * qtdProduto;

                System.out.printf("Quantidade item = %s, Valor unitário = R$%.2f, Valor total de itens = R$%.2f", qtdProduto, valorA002, valorCompra);
                break;
            case "A003":
                double valorA003 = 14.00;
                valorCompra = valorA003 * qtdProduto;

                System.out.printf("Quantidade item = %s, Valor unitário = R$%.2f, Valor total de itens = R$%.2f", qtdProduto, valorA003, valorCompra);
                break;
            case "A004":
                double valorA004 = 19.99;
                valorCompra = valorA004 * qtdProduto;

                System.out.printf("Quantidade item = %s, Valor unitário = R$%.2f, Valor total de itens = R$%.2f", qtdProduto, valorA004, valorCompra);
                break;
        }
        }
    }
}

