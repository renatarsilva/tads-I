package aula12_19052025;


public class Exercicio7Rep {
    public static void main(String[] args) {
        int anoAtual = 2025;
        int anoInicio = 2010;
        int qtdAnos = 2025 - 2010;
        double aumento = 1.5 / 100;
        double[] salarios = new double[qtdAnos];
        salarios[0] = 1000;
        for (int i = 1; i < qtdAnos; i++) {
            salarios[i] = salarios[i-1] + salarios[i-1] * aumento;
            aumento *= 2;
        }
        for(double salario : salarios) {
            System.out.printf("[R$ %7.2f]", salario);
        }

    }
}