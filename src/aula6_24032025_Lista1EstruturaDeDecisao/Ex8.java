/*
8. Crie um algoritmo que dados três valores X, Y e Z, verifique se eles podem
ser os comprimentos dos lados de um triângulo e, se forem, verifique se é um
triângulo equilátero, isósceles ou escaleno. Considere que:

• O comprimento de cada lado de um triângulo é menor do que a soma
dos outros dois lados;

• Chama-se equilátero o triângulo que tem três lados iguais;
• Chama-se isósceles o triângulo que tem o comprimento de dois lados
iguais;
• Recebe o nome de escaleno o triângulo que tem os três lados
diferentes.
 */

package aula6_24032025_Lista1EstruturaDeDecisao;

import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variavéis
        float X, Y, Z;

        //Entrada de dados
        System.out.println("Digite o valor da X: ");
        X = scan.nextFloat();

        System.out.println("Digite o valor da Y: ");
        Y = scan.nextFloat();

        System.out.println("Digite o valor da Z: ");
        Z = scan.nextFloat();

        //Condições
        if (X == Y && Y == Z) {
            System.out.println("Triagulo equilátero.");
        }
        else if (X == Y || X == Z || Z == Y){
            System.out.println("Triagulo isósceles.");
        }
        else {
            System.out.println("Triagulo escaleno.");
    }
}}
