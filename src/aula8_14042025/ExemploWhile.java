package aula8_14042025;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {
        File arquivo = new File("c:/temp/meuarquivo.txt");
        try {
            Scanner sc = new Scanner(arquivo);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}