package aula4_10032025;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        // variÃ¡veis
        double nota1, nota2, media;
        String conceito;
        Scanner scan = new Scanner(System.in);
        // entrada de dados
        System.out.println("Informe as 2 notas");
        nota1 = scan.nextDouble();
        nota2 = scan.nextDouble();
        // validar dados
        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
            System.err.println("VocÃª inseriu uma nota invÃ¡lida. Encerrando...");
            // encerrar o programa
            System.exit(0);
        }
        // se chegou aqui, nota1 e nota2 sÃ£o entre 0 e 10
        // calcular mÃ©dia
        media = (nota1 + nota2) / 2;

        conceito = media > 8 ? "A" : media > 6 ? "B" : media > 5 ? "C" : media > 3 ? "D" : "E";

        if (media > 8) {
            conceito = "A";
        } else if (media > 6) {
            conceito = "B";
        } else if (media > 5) {
            conceito = "C";
        } else if (media > 3) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        System.out.println("Conceito: " + conceito);
        System.out
                .println("Conceito: " + (media > 8 ? "A" : media > 6 ? "B" : media > 5 ? "C" : media > 3 ? "D" : "E"));
    }
}
