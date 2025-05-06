package aula4_10032025;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        // variÃ¡veis
        double nota1, nota2, media;
        Scanner scan = new Scanner(System.in);
        // entrada de dados
        System.out.println("Informe as 2 notas");
        nota1 = scan.nextDouble();
        nota2 = scan.nextDouble();
        // calcular média
        media = (nota1 + nota2) / 2;
        // se media for maior ou igual a 6, aprovado
        // <condiÃ§Ã£o> ? <verdadeiro> : <falso>
        System.out.println(media >= 5 ? "Aprovado" : "Reprovado\nSe deu mal!");
    }
}
