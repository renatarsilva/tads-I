package aula4_10032025;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        String turma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a sua turma");
        turma = sc.nextLine();
        switch (turma) {
            case "a":
                System.out.println("Bem-vindo Ã  turma A");
                break;
            case "b":
                System.out.println("Bem-vindo Ã  turma B");
                break;
            case "c":
                System.out.println("Bem-vindo Ã  turma C");
            default:
                System.out.println("NÃ£o reconheÃ§o essa turma");
        }

    }
}
