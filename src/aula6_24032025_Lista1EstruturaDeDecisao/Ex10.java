/*
* 10. Crie um algoritmo que receba a hora de início e a hora de término de um jogo
* (cada hora é composta por duas variáveis hora e minuto). Calcule e mostre a
* duração do jogo (horas e minutos), sabendo-se que o tempo máximo da
* duração do jogo é de 24 horas e que ele pode iniciar-se em um dia e terminar
* no dia seguinte.
*/

package aula6_24032025_Lista1EstruturaDeDecisao;

import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variavéis
        int startHour, startMinute, endHour, endMinute, durationHour, durationMinute;

        //Entrada de dados
        System.out.print("Digite a hora de ínicio do jogo: ");
        startHour = scan.nextInt();

        if (startHour <0 || startHour > 23) {
            System.out.printf("Hora de ínicio %d inválida!", startHour);
            System.exit(0);
        };

        System.out.print("Digite o minuto de ínicio do jogo: ");
        startMinute = scan.nextInt();

        if (startMinute <0 || startMinute > 59){
            System.out.printf("Minuto de ínicio %d inválido!", startMinute);
            System.exit(0);
        };

        System.out.print("Digite a hora de término do jogo: ");
        endHour = scan.nextInt();

        if (endHour <0  || endHour > 23){
            System.out.printf("Hora de término %d inválida!", endHour);
            System.exit(0);
        }

        System.out.print("Digite o minuto do término do jogo: ");
        endMinute = scan.nextInt();

        if (endMinute <0 || endMinute > 59){
            System.out.printf("Minuto de término %d inválido!", endMinute);
            System.exit(0);
        }

        durationHour = endHour - startHour;

        if (endHour < startHour) {
            durationHour = durationHour + 24;
        }

        durationMinute = endMinute - startMinute;

        if (durationMinute<0){
            durationMinute = durationMinute + 60;
            durationHour = durationHour - 1;
        }

        System.out.printf("A hora do jogo foi: %02d horas e %02d minutos", durationHour, durationMinute);
    }
}
