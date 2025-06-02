package aula13_26052025;

import java.util.Random;
import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        String senha;
        int contador = 0;

        do {
            System.out.print("Digite a senha para rodar o programa: ");
            senha = scan.next();
            contador++;
            if (contador == 3) {
                return;
            }
        } while (!senha.equals("1234"));
        contador = 0;

        int[] pagamento = new int[800];
        int[] idadeClientes = new int[800];
        int[] compraFrequente = new int[800];
        int[] casaPropria = new int[800];

        int pagamentoCartao = 0, pagamentoDinheiro = 0, idadeMaiorCinquenta = 0, clienteQueFazemMaisDeUmaCompraMes = 0, mediaIdade = 0;
        double possuiCasa = 0;

        for (int j = 0; j < pagamento.length; j++) {
            pagamento[j] = rand.nextInt(0, 2);
            compraFrequente[j] = rand.nextInt(0, 2);
            if (compraFrequente[j] == 1) {
                clienteQueFazemMaisDeUmaCompraMes++;
            }
        }

        for (int k = 0; k < pagamento.length; k++) {
            idadeClientes[k] = rand.nextInt(12, 76);

            if (idadeClientes[k] >= 18) {
                casaPropria[k] = rand.nextInt(0, 2);
                if (casaPropria[k] == 1) {
                    possuiCasa++;
                } else {
                    casaPropria[k] = 0;
                }
            } else {
                casaPropria[k] = 0;
            }

            if (idadeClientes[k] > 50) {
                idadeMaiorCinquenta++;
            }

            mediaIdade += idadeClientes[k];
        }

        for (int i : pagamento) {
            if (i == 0) {
                pagamentoCartao++;
            } else {
                pagamentoDinheiro++;
            }
        }

        mediaIdade /= 800;

        possuiCasa /= 8;


        System.out.printf("""
                Clientes que utilizam cartão: %d
                Clientes que utilizam dinheiro: %d
                Clientes maiores de 50 anos: %d
                Média da idade dos clientes: %d
                Clientes que fazem compras mais de uma vez por mês: %d
                Porcentagem de clientes que possuem casa própria: %.2f %%
                
                """, pagamentoCartao, pagamentoDinheiro, idadeMaiorCinquenta, mediaIdade, clienteQueFazemMaisDeUmaCompraMes, possuiCasa);

    }
}

