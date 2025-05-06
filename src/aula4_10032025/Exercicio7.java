package aula4_10032025;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        // að‘¥Â² + bð‘¥ + c = 0
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta, x1, x2;
        System.out.println("Informe os valores de a, b e c");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        delta = Math.pow(b, 2) - 4 * a * c;
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.printf("x1 = %.2f%nx2 = %.2f",x1,x2);
    }
}
