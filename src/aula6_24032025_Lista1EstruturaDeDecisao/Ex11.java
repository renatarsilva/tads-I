/*
* 11. Crie um algoritmo que receba 3 notas de um aluno e calcule a média. Caso
* a média calculada seja maior ou igual a 6, o algoritmo deverá exibir a
* mensagem de aluno aprovado. Caso a média seja abaixo de 5, o algoritmo
* deverá exibir a mensagem de aluno reprovado.
* Caso a média esteja entre 5
* e 6, o algoritmo deverá exibir que o aluno está de recuperação e solicitar a
* nota da atividade de recuperação, calcular uma nova média entre a média
* inicial e a nota de recuperação e caso esta nova média seja abaixo de 6
* informar que o aluno está reprovado, caso contrário, informar que o aluno
* está aprovado por recuperação.
*/

package aula6_24032025_Lista1EstruturaDeDecisao;

import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variáveis
        String nomeAluno;
        double nota1 = 0 , nota2 = 0, nota3 = 0, media=0;

        //Entrada de dados
        System.out.println("Digite o nome do aluno: ");
        nomeAluno = scan.nextLine();

        System.out.println("Digite a nota1:");
        nota1 = scan.nextDouble();

        System.out.println("Digite a nota2:");
        nota2 = scan.nextDouble();

        System.out.println("Digite a nota3:");
        nota3 = scan.nextDouble();

        media = (nota1 + nota2 +nota3)/3;

        //Condições
        if (nota1 < 0 || nota1 > 100 || nota2 < 0 || nota2 > 100 || nota3 < 0 || nota3 > 100) {
            System.out.println("Notas inválidas!");
        } else {
        if (media > 6 ){
            System.out.printf("A média de %s é: %.2f, e a aprovação foi alcançada.", nomeAluno, media);
        } else if (media < 5){
            System.out.printf("A média de %s é: %.2f, e não atingiu a média necessária para aprovação.", nomeAluno, media);
        }
        else
        {
            double notaRecuperacao =0;
            System.out.printf("A média de %.2f indica que %s está de recuperação. Digite a nota de recuperação: ", media, nomeAluno);
            notaRecuperacao = scan.nextDouble();

            media = (media + notaRecuperacao)/2;

        if  (media < 6) {
                System.out.printf("A média de %s é: %.2f, e não atingiu a média necessária para aprovação.",  nomeAluno, media);
            }
        else {
            System.out.printf("A média de %s é: %.2f, e a aprovação foi alcançada.", nomeAluno, media);
            }
    }
}}}
