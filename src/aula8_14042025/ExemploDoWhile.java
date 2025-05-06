package aula8_14042025;

import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numero, cont = 0;
        do {
            System.out.println("Informe um nÃºmero entre 10 e 1000");
            numero = rand.nextInt();
            cont++;
        } while (numero < 10 || numero > 1000);
        System.out.printf("Foram necessÃ¡rias %d repetiÃ§Ãµes", cont);
    }
}
