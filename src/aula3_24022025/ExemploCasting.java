package aula3_24022025;

public class ExemploCasting {
    public static void main(String[] args) {
        // casting de double para int
        double x = 9.99;
        int y = (int) x;
        System.out.println(y);

        // casting de int para byte
        byte b = (byte) 300;
        System.out.println(b);

        // o resultado abaixo serÃ¡ um int armazenado em um double
        int x1 = 10, x2 = 3;
        double y1 = x1 / x2;
        System.out.println(y1);
    }
}
