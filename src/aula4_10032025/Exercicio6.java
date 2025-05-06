package aula4_10032025;

public class Exercicio6 {
    public static void main(String[] args) {
        // ð‘¥Â² âˆ’ 5ð‘¥ + 6 = 0
        double a, b, c, delta, x1, x2;
        a = 1;
        b = -5;
        c = 6;
        delta = Math.pow(b, 2) - 4 * a * c;
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.printf("x1 = %.2f%nx2 = %.2f", x1, x2);
    }
}
