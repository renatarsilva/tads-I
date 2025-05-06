package aula7_07042025;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        double peso, altura, imc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o peso e a altura");
        peso = sc.nextDouble();
        altura = sc.nextDouble();
        imc = calcularIMC(altura, peso);
        System.out.println("Seu IMC Ã© " + imc);
        System.out.println(classificarIMC(imc));
        System.out.println(calculaEclassificaIMC(altura, peso));
    }

    public static String calculaEclassificaIMC(double altura, double peso) {
        double imc = calcularIMC(altura, peso);
        String classificacao = classificarIMC(imc);
        String retorno = "IMC: " + imc + "\nClassificaÃ§Ã£o: " + classificacao;
        return retorno;
    }

    public static double calcularIMC(double altura, double peso) {
        double imc = peso / (altura * altura);
        return imc;
    }

    public static String classificarIMC(double imc) {
        String cImc;
        if (imc <= 16) {
            cImc = "Magreza Severa";
        } else if (imc <= 17) {
            cImc = "Magreza Moderada";
        } else if (imc <= 18.5) {
            cImc = "Magreza Leve";
        } else if (imc <= 25) {
            cImc = "Normal";
        } else if (imc <= 30) {
            cImc = "Obesidade Leve";
        } else if (imc <= 40) {
            cImc = "Obesidade Severa";
        } else {
            cImc = "Obesidade MÃ³rbida";
        }
        return cImc;
    }
}
