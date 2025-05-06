package avaliacao1;

import java.util.Scanner;

public class FelizPark {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // variáveis

        String placaVeiculo, tipoVaga;

        int horaInicial, minutoInicial, horaFinal, minutoFinal, duracaoHora, duracaoMinuto, totalMinuto;

        double valorCobrado = 0;

        System.out.println("""
                
                     *****************************
                
                     *  BEM-VINDO AO FELIZ PARK  *
                
                     *****************************      
                
                Horário de Funcionamento: 06:00 às 22h00
                
                """);

        // Entrada de dados

        System.out.println("Digite a placa do veiculo:");

        placaVeiculo = scan.nextLine();

        System.out.println("Horario de entrada do veículo:");

        horaInicial = scan.nextInt();

        if (horaInicial < 6 || horaInicial > 21) {

            System.out.println("Estacionamento fechado");

            System.exit(0);

        }

        System.out.println("Minuto de entrada do veículo:");

        minutoInicial = scan.nextInt();

        if (minutoInicial < 0 || minutoInicial > 59) {

            System.out.println("Minutos inválidos");

            System.exit(0);

        }

        System.out.println("Horario de saída do veículo:");

        horaFinal = scan.nextInt();

        if (horaFinal < 6 || horaFinal > 21) {

            System.out.println("Estacionamento fechado");

            System.exit(0);

        }

        System.out.println("Minuto de saída do veículo:");

        minutoFinal = scan.nextInt();

        if (minutoFinal < 0 || minutoFinal > 59) {

            System.out.println("Minutos inválidos");

        }

        if ((horaInicial * 60) + minutoInicial > (horaFinal * 60) + minutoFinal) {

            System.out.println("Horário inválido");

            System.out.println("Tempo de saída não pode ser menor que tempo de entrada...");

            System.exit(0);

        }

        System.out.println("Vaga com cobertura? [S/N]: ");

        tipoVaga = scan.next().toUpperCase();

        duracaoHora = (((horaFinal * 60) + minutoFinal) - ((horaInicial * 60) + minutoInicial)) / 60;

        duracaoMinuto = (((horaFinal * 60) + minutoFinal) - ((horaInicial * 60) + minutoInicial)) % 60;

        if (duracaoHora == 0 && duracaoMinuto < 10) {

            System.out.println("Não há cobranças\n");

            System.exit(0);

        }

        totalMinuto = duracaoHora * 60 + duracaoMinuto;

        valorCobrado = (5 * (double) totalMinuto) / 60;

        if (valorCobrado > 25) {

            valorCobrado = 25;

        } else if (5 > valorCobrado) {

            valorCobrado = 5;

        }

        System.out.println("Valor a ser cobrado sem taxa:" + valorCobrado);


        switch (tipoVaga) {

            case "S", "SIM":

                valorCobrado *= 1.25;

                System.out.println("Valor a ser cobrado com taxa:" + valorCobrado);

                break;

            case "NAO", "N", "NÃO":

                System.out.println("Não há cobranças");

                break;

            default:

                System.out.println("opção inválida");

                System.exit(0);

        }


        System.out.printf("""
                
                --------- RECIBO ----------
                
                Placa do Carro: %3S
                
                Hora entrada:  %02d:%02d
                
                Hora saída:    %02d:%02d
                
                Duração total: %02d:%02d
                
                Total R$ %.2f
                
                ---------------------------
                
                """, placaVeiculo, horaInicial, minutoInicial, horaFinal, minutoFinal, duracaoHora, duracaoMinuto, valorCobrado);

    }

}