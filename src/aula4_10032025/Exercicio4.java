package aula4_10032025;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        String turma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a sua turma");
        turma = sc.nextLine();
        if (turma.equals("a")) {
            System.out.println("Bem-vindo Ã  turma A");
        } else if (turma.equals("b")) {
            System.out.println("Bem-vindo Ã  turma B");
        } else if (turma.equals("c")) {
            System.out.println("Bem-vindo Ã  turma C");
        } else {
            System.out.println("NÃ£o reconheÃ§o essa turma");
        }
    }
}
