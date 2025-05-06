package aula2_17022025;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        // variáveis
        double celsius, kelvin;
        Scanner sc = new Scanner(System.in);

        // entrada de dados
        System.out.println("Informe a temperatura em Celsius");
        celsius = sc.nextDouble();

        // calcula kelvin
        kelvin = celsius + 273.15;
        // saída de dados
        System.out.println
                (celsius + "°C equivalem a " + kelvin + "K");
    }
}