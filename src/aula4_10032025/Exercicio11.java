package aula4_10032025;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        String strA, strB, strTemp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe uma String");
        strA = sc.nextLine();
        System.out.println("Informe outra String");
        strB = sc.nextLine();
        strTemp = strA;
        strA = strB;
        strB = strTemp;
        System.out.printf("strA: %s%nstrB: %s", strA, strB);
    }
}
