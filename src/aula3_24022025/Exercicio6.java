/*
* 6. Crie um algoritmo que resolva a seguinte equação 𝑥 2 − 5𝑥 + 6 = 0.
*/

package aula3_24022025;

public class Exercicio6 {
    public static void main(String[] args) {

        double a, b, c, delta, x1, x2;

        a = 1;
        b = -5;
        c = 6;
        delta = Math.pow(b, 2) - 4 * a * c;
        x1 = (-b + Math.sqrt(delta)) / 2 * a;
        x2 = (-b - Math.sqrt(delta)) / 2 * a;
        System.out.println("X1 = " + x1 + "X2 = " + x2);
    }
}
