package aula5_17032025;

import java.util.Scanner;

public class Exercicio13_1 {
    public static void main(String[] args) {
        // variáveis
        String tipoPlano;
        double valor;
        Scanner scan = new Scanner(System.in);
        // entrada de dados
        System.out.println("Informe seu plano de saúde");
        tipoPlano = scan.next();
        // transformei para minúsculo a String digitada
        tipoPlano = tipoPlano.toLowerCase();
        switch (tipoPlano) {
            case "básico" -> valor = 150;
            case "bronze" -> valor = 220;
            case "prata" -> valor = 310;
            case "ouro" -> valor = 450;
            default -> {
                System.out.println("Plano inválido");
                // return no main encerra o programa
                return;
            }
        }
        System.out.printf("O valor do plano %s é %6.2f", tipoPlano, valor);
    }
}
