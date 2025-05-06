/* 2. Crie um algoritmo que leia 3 números e informe qual o menor.*/

package aula6_24032025_Lista1EstruturaDeDecisao;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Variáveis
        int num1 = 0, num2 = 0, num3 = 0, menor = 0;

        // Entrada de dados
        System.out.println("Digite o primeiro valor:");
        num1 = scan.nextInt();

        System.out.println("Digite o segundo valor:");
        num2 = scan.nextInt();

        System.out.println("Digite o terceiro valor:");
        num3 = scan.nextInt();

        //Condições
        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
        } else {
            menor = num3;
        }
        System.out.printf("O menor valor é: %d", menor);
    }
}
