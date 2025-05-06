/* 3.
*  Crie um algoritmo que leia o nome do aluno, suas 4 notas, calcule a média e
*  classifique o resultado conforme a tabela abaixo.
*
*  Ao final, deverão ser
*  exibidos o nome do aluno, suas 4 notas, sua média e sua classificação.
*  Média Classificação
*  Abaixo de 20 (inclusive) Péssimo
*  Maior que 20 e menor que 40 (inclusive) Ruim
*  Maior que 40 e menor que 60 (inclusive) Regular
*  Maior que 60 e menor que 80 (inclusive) Bom
* Acima de 80 Ótimo
* */

package aula6_24032025_Lista1EstruturaDeDecisao;

import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Variáveis
        String nomeAluno;
        double nota1=0, nota2=0, nota3=0, nota4=0, media=0;

        //Entrada de dados
        System.out.println("Digite o nome do aluno:");
        nomeAluno = scan.nextLine();

        System.out.printf("Digite o valor da nota 1 de %s é:", nomeAluno);
        nota1 = scan.nextDouble();

        System.out.printf("Digite o valor da nota 2 de %s é:", nomeAluno);
        nota2 = scan.nextDouble();

        System.out.printf("Digite o valor da nota 3 de %s é:", nomeAluno);
        nota3 = scan.nextDouble();

        System.out.printf("Digite o valor da nota 4 de %s é:", nomeAluno);
        nota4 = scan.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        //Condições
        if (nota1 < 0 || nota1 > 100 || nota2 < 0 || nota2 > 100 || nota3 < 0 || nota3 > 100) {
            System.out.println("Notas inválidas!");
        } else {
            if ( media <= 20) {
                System.out.printf("A classificação de %s é péssima!", nomeAluno);
            } else if (media > 20 && media <= 40){
                System.out.printf("A classificação de %s é ruim!", nomeAluno);
            } else if (media > 40 && media <= 60){
                System.out.printf("A classificação de %s é regular!", nomeAluno);
            } else if (media > 60 && media <= 80) {
                System.out.printf("A classificação de %s é boa!", nomeAluno);
            } else {
                System.out.printf("A classificação de %s é ótima!", nomeAluno);
            }
            System.out.printf("%nA média de %s é %.2f! ", nomeAluno, media);
        }
        }
    }
