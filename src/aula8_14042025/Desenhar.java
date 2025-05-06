package aula8_14042025;

public class Desenhar {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            System.out.printf("%d|", i);
            for (int j = 1; j <= (i % 2 == 0 ? 10 : 5); j++) {
                System.out.print("-");
            }
            System.out.println("|");
        }
    }
}
