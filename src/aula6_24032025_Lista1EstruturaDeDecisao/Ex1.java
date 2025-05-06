/* 1. Crie um algoritmo que leia dois números e informe qual deles é o maior.
*  Informe também caso os números sejam iguais.
*/

package aula6_24032025_Lista1EstruturaDeDecisao;

import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Váriaveis
        int num1 =0, num2 = 0;

        // Entrada de dados
        System.out.print("Informe valor 1: ");
        num1 = scan.nextInt();

        System.out.print("Informe valor 2: ");
        num2 = scan.nextInt();

        // Condições
        if (num1 > num2) {
            System.out.println("O valor 1 é maior que valor 2");
        } else if (num2 > num1) {
            System.out.println("O valor 2 é maior que valor 1");
        } else {
            System.out.println("Os dois valores sao iguais");
        }
    }}