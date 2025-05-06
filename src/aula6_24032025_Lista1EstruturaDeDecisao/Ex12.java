/*
* 12. Em uma escola, os alunos ganham premiações de acordo com o seu
* desempenho ao longo do ano letivo, conforme tabela abaixo:
* Prêmio Requisito
* Excursão Média acima de 80 e 0% de faltas
* Camiseta Média acima de 80 ou 100% de presença
* Squeeze Média entre 70 e 80 e pelo menos 90% de presença
* Caneta personalizada Média entre 70 e 80 ou pelo menos 90% de presença
* Baseado na tabela, crie um algoritmo que receba 4 notas de um aluno entre 0 e
* 100, quantidade de aulas dadas, quantidade de presenças e informe qual o
* prêmio a ser recebido pelo aluno. Caso o aluno não esteja em nenhuma das
* condições da tabela, o algoritmo deve informar que não há prêmios.
*/

package aula6_24032025_Lista1EstruturaDeDecisao;

import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variavéis
        String nomeAluno;
        double nota1=0, nota2=0, nota3=0, nota4=0, media=0, qtdAulas=0, qtdPresenca=0, qtdFaltas=0, porcentagemFalta=0, porcentagemPresenca=0;

        //Entrada de dados
        System.out.println("Digite o nome do aluno:");
        nomeAluno = scan.nextLine();

        System.out.println("Digite a nota 1:");
        nota1 = scan.nextDouble();

        System.out.println("Digite a nota 2:");
        nota2 = scan.nextDouble();

        System.out.println("Digite a nota 3:");
        nota3 = scan.nextDouble();

        System.out.println("Digite a nota 4:");
        nota4 = scan.nextDouble();

        System.out.println("Qual foi a quantidade de aulas dadas, no ano letivo?");
        qtdAulas = scan.nextDouble();

        System.out.printf("Qual a quantidade de presença de %s:", nomeAluno);
        qtdPresenca = scan.nextDouble();

        media = (nota1+nota2+nota3+nota4)/4;
        qtdFaltas = (qtdAulas - qtdPresenca);
        porcentagemFalta = (qtdFaltas/qtdAulas)*100;
        porcentagemPresenca = (qtdPresenca/qtdAulas)*100;

        //Condições
        if (nota1 < 0 || nota1 > 100 || nota2 < 0 || nota2 > 100 || nota3 < 0 || nota3 > 100) {
            System.out.println("Notas inválidas!");
        } else {
            if (media > 80 && porcentagemFalta == 0) {
                System.out.println("O prêmio para esse aluno é: Excursão");
            } else if (media > 80 || porcentagemPresenca == 100) {
                System.out.println("O prêmio para esse aluno é: Camiseta");
            } else if (media >= 70 && media <= 80 && porcentagemPresenca >= 90) {
                System.out.println("O prêmio para esse aluno é: Squeeze");
            } else if ((media >= 70 && media <= 80) || porcentagemPresenca >= 90) {
                System.out.println("O prêmio para esse aluno é: Caneta personalizada");
            } else {
                System.out.printf("A média de %s é de: %.2f, e a porcentagem de falta é: %.2f, sendo assim não houve prêmio", nomeAluno, media, porcentagemFalta);
            }
        }
    }
}

