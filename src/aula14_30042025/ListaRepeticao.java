package aula14_30042025;

import java.util.Scanner;
import java.util.Random;

public class ListaRepeticao {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
//      ex1(50,9500,3);
//      ex2(1,250, 10);
//      ex3(1, 100);
//      ex4();
//      ex5 (1,15);
//      ex6();
//      ex7(2010, 2025, 1000.0f, 1.5f);
//      ex8(3000, true);
//      ex9();
//      ex10(0);
//      ex11(0);
//      ex12(0,1,2,7,3);
//        ex13();
//      ex14(0, 0, 0);
//       ex15();
    }

    //1. Crie um algoritmo com a função de exibir todos os números que são divisíveis por 3 entre 50 e 9500.
    public static void ex1(int ini, int fim, int divisor) {
        for (int i = ini; i <= fim; i++) {
            if (i % divisor == 0) {
                System.out.printf("%d é divisível por %d%n", i, divisor);
            }
        }
    }

    //2. Crie um algoritmo que exiba os valores de 1 a 250 e em cada múltiplo de 10 exiba a mensagem: “Múltiplo de 10”
    public static void ex2(int ini, int fim, int multiplo) {
        for (int i = ini; i <= fim; i++) {
            if (i % multiplo == 0) {
                System.out.println(i + " Múltiplo de " + multiplo);
            } else {
                System.out.println(i);
            }
        }
    }

    //3. Crie um algoritmo que apresente a soma dos termos da sequência (1 + 2 + 3 + 4 + 5 + 6... + 99 + 100).
    public static void ex3(int ini, int fim) {
        int soma = 0;
        for (int i = ini; i <= fim; ++i) {
            soma += i;
//            System.out.println(i);
        }
        System.out.printf("A soma dos números de %d a %d é %d", ini, fim, soma);
    }

    //4. Complemente o algoritmo criado no exercício 3, solicitando ao usuário até qual termo deverá ser exibida a soma.
    public static void ex4() {
        int termino;
        System.out.println("Informe até qual termo realizar a soma");
        termino = sc.nextInt();
        ex3(1, termino);
    }

    //5. Crie um algoritmo que tenha a função de efetuar a soma dos 15 primeiros termos da sequência. (5,10,15,20...).
    public static void ex5(int ini, int fim) {
        int soma = 0;
        int termo = 5;
        for (int i = ini; i <= fim; i++) {
//            System.out.println(termo * i);
            soma += termo * i;
        }
        System.out.println("A soma dos 15 primeiros termos da sequência, é " + soma);
    }

    //6. Complemente o algoritmo do exercício 5, solicitando o primeiro e o último termo da sequência desejada.
    public static void ex6() {
        int valorInicio;
        int valorFim;
        System.out.println("Digite o primeiro valor da sequência");
        valorInicio = sc.nextInt();

        System.out.println("Digite o último valor da sequência");
        valorFim = sc.nextInt();
        ex5(valorInicio, valorFim);
    }

    /*
    7. Um funcionário de uma empresa recebe aumento salarial anualmente. Sabe-se que:
    • Esse funcionário foi contratado em 2010, com salário inicial de R$ 1.000,00;
    • Em 2011, ele recebeu um aumento de 1,5% sobre o salário inicial;
    • A partir de 2012 (inclusive), os aumentos salariais passaram a ser sempre o dobro do percentual do ano anterior.
    Crie um algoritmo que determine o salário atual desse funcionário.
    */
    public static void ex7(int ini, int fim, float salario, float aumento) {
        for (int i = ini; i <= fim; i++) {
            System.out.printf("\nAno:%d - salário atual ", i);
            if (i != ini) {
                float salarioAtual = salario + (salario * aumento / 100);
                System.out.printf("salario atual %.2f porcentagem de aumento %.2f", salarioAtual, aumento);

                aumento *= 2;
                salario = salarioAtual;
            }
        }
    }

    /*
    8. Crie um algoritmo que receba o salário de um funcionário chamado Carlos.
    Sabe-se que outro funcionário, João, tem um salário equivalente a 1/3 do salário de Carlos.
    Carlos aplicará seu salário integralmente em uma aplicação que rende 2% ao mês,
    enquanto João aplicará seu salário integralmente em um fundo de renda fixa que rende 5% ao mês.
    O algoritmo deve calcular e mostrar a quantidade de meses necessários para que
    o valor acumulado por João iguale ou ultrapasse o valor acumulado por Carlos.
    */
    public static void ex8(float salario, boolean aplicacaoMensal) {
        float salarioCarlos = salario;
        float salarioJoao = (salarioCarlos / 3);
        float investimentoCarlos = salarioCarlos;
        float investimentoJoao = salarioJoao;
        int contadorMeses = 0;

        System.out.printf("Mês: %d, Aporte inicial João: R$%.2f, Aporte inicial Carlos R$%.2f\n", contadorMeses, investimentoJoao, investimentoCarlos);
        while (investimentoJoao <= investimentoCarlos) {
            contadorMeses++;
            investimentoCarlos += investimentoCarlos * 0.02;
            investimentoJoao += investimentoJoao * 0.05;

            if (aplicacaoMensal) {
                investimentoCarlos += salarioCarlos;
                investimentoJoao += salarioJoao;
            }
            System.out.printf("Mês: %d, Investimento João: R$%.2f, Investimento Carlos R$%.2f\n", contadorMeses, investimentoJoao, investimentoCarlos);
        }
        System.out.printf("João ultrapassa Carlos, após %d meses", contadorMeses);
    }

    /*
    9. Crie um algoritmo que leia valores inteiros diferentes de 0 e exiba as
    informações abaixo ao ser informado o número 0.
    a) A soma dos números positivos;
    b) A quantidade de números negativos.
    */
    public static void ex9() {
        int texto = 1;
        int positivos = 0;
        int negativos = 0;

        while (texto != 0) {
            System.out.println("Digite um valor");
            texto = sc.nextInt();

            if (texto > 0) {
                positivos += texto;
//                System.out.println(positivos);
            } else if (texto < 0) {
//                System.out.println(++negativos);
            } else {
                System.out.println("Saindo do looping");
            }
        }
        System.out.printf("Soma de numeros positivos: %d\n", positivos);
        System.out.printf("Quantidade de numeros negativos: %d ", negativos);
    }

    /*
    10.Escreva um algoritmo que receba a nota de um aluno entre 0 e 10 e informe
    se ele está aprovado (maior ou igual a 6),
    de recuperação (maior ou igual a 5 e menor que 6)
    ou reprovado (abaixo de 5). Caso o valor informado não
    esteja entre 0 e 10, o algoritmo deverá solicitar novamente o valor até que
    esteja no intervalo desejado.
    */
    public static void ex10(double nota) {
        System.out.println("Digite a nota:");
        nota = sc.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Digite a nota novamente");
            nota = sc.nextInt();
        }
        if (nota >= 6) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }
    }

    /*
    11.Crie um algoritmo que apresente o menu de opções a seguir, permita ao
    usuário escolher a opção desejada, receba os dados necessários para
    executar a operação e mostre o resultado. Verifique a possibilidade de opção
    inválida e não se preocupe com restrições do tipo salário inválido.
    ----- Menu de opções -----
    Imposto
    Novo salário
    Classificação
    Finalizar o programa
    Digite a opção desejada.
    -----------------------------------
    Na opção 1, receber o salário de um funcionário, calcular e mostrar o valor
    do imposto usando as regras a seguir:
    Salários % do imposto
    Menor ou igual a R$ 1500,00 5
    De R$ 1500,01 a R$ 3000,00 10
    Acima de R$ 3000,00 15
    Na opção 2, receber o salário de um funcionário, calcular e mostrar o valor
    do novo salário usando as regras a seguir:
    Salários Aumento
    Maiores que R$ 4.500,00 R$ 250,00
    De R$ 3.000,01 a R$ 4.500,00 R$ 200,00
    De R$ 2.000,01 a R$ 3.000,00 R$ 150,00
    Menores que R$ 2.000,01 R$ 130,00
    Na opção 3, receber o salário de um funcionário e mostrar sua classificação
    usando esta tabela:
    Salários Classificação
    Maiores que R$ 3.000,00 Bem remunerado
    Até R$ 3.000,00 Mal remunerado
    */

    public static void ex11(int opcao) {
        do {
            System.out.println("""
                    ----- Menu de opções -----
                    1. Imposto
                    2. Novo salário
                    3. Classificação
                    4. Finalizar o programa
                    Digite a opção desejada:
                    """);
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    double salario = 0, imposto, percentual;
                    System.out.print("Digite o salário do funcionário: ");
                    salario = sc.nextDouble();
                    if (salario <= 1500) {
                        percentual = 0.05;
                        imposto = salario * percentual;
                    } else if (salario <= 3000) {
                        percentual = 0.1;
                        imposto = salario * percentual;
                    } else {
                        percentual = 0.15;
                        imposto = salario * percentual;
                    }
                    System.out.printf("""
                            ----- Dados -----
                            Salario - R$ %.2f 
                            Percentual - %.2f
                            Valor Imposto - R$ %.2f
                            -----------------
                            """, salario, percentual, imposto);
                    break;
                case 2:
                    System.out.print("\nDigite o salário do funcionário: ");
                    salario = sc.nextDouble();
                    if (salario > 4500) {
                        salario += 250;
                    } else if (salario > 3000) {
                        salario += 200;
                    } else if (salario > 2000) {
                        salario += 150;
                    } else {
                        salario += 130;
                    }
                    System.out.printf("Novo Salário - R$ %.2f%n%n", salario);
                    break;
                case 3:
                    System.out.print("\nDigite o salário do funcionário: ");
                    salario = sc.nextDouble();
                    if (salario > 3000) {
                        System.out.println("Bem remunerado!\n");
                    } else {
                        System.out.println("Mal Remunerado\n");
                    }
                    break;
                case 4:
                    System.out.println("Finalizando programa\n");
                    return;
                default:
                    System.out.println("Opção inválida...\n");
                    break;
            }
        } while (opcao != 4);

        System.out.print("Digite a nova opção desejada: ");
        opcao = sc.nextInt();

        sc.close();
    }

    /*
    12. Crie um algoritmo que leia o número de termos, determine e mostre os
    valores de acordo com a série a seguir:
    Série = 2, 7, 3, 4, 21, 12, 8, 63, 48, 16, 189, 192, 32, 567...
    */
    public static void ex12(int termo, int contador, int primeiroTermo, int segundoTermo, int terceiroTermo) {
        System.out.print("Digite o número de termos desejados: ");
        termo = sc.nextInt();

        for (int i = 1; i <= termo; i++) {
            if (contador == 1) {
                System.out.println(primeiroTermo);
                primeiroTermo *= 2;
            }
            if (contador == 2) {
                System.out.println(segundoTermo);
                segundoTermo *= 3;
            }
            if (contador == 3) {
                System.out.println(terceiroTermo);
                terceiroTermo *= 4;
            }

            contador++;
            if (contador > 3) {
                contador = 1;
            }
        }
    }

    /*
    13. Em um campeonato de futebol existem cinco times e cada um possui quinze
    jogadores. Faça um algoritmo que receba a idade, o peso e a altura de cada
    um dos jogadores, calcule e mostre:
    • A quantidade de jogadores com idade inferior a 18 anos;
    • A média das idades dos jogadores de cada time;
    • A média das alturas de todos os jogadores do campeonato;
    • O percentual de jogadores com mais de 80 Kg entre todos os jogadores
    do campeonato.
    */
    public static void ex13() {
        int qtdTimes = 5, qtdJogadores = 15, idade, qtdJogadoresMenor18 =0, somaIdadeJogadores = 0, qtdJogador80kg = 0;
        double peso, altura, somaAlturaJogadores = 0,mediaAlturaJogadores, percentualJogador80kg, mediaIdadeTimeA = 0,
                mediaIdadeTimeB = 0, mediaIdadeTimeC = 0, mediaIdadeTimeD = 0, mediaIdadeTimeE = 0;

        for (int i = 1; i <= qtdTimes; i++) {
            for (int j = 1; j <= qtdJogadores; j++) {
                idade = random.nextInt(16, 45);

                peso =  random.nextDouble(55,85);

                altura = random.nextDouble(1.70,2.10);

                if (idade < 18) {
                    qtdJogadoresMenor18++;
                }

                somaIdadeJogadores += idade;
                somaAlturaJogadores += altura;

                if (peso >= 80) {
                    qtdJogador80kg++;
                }
            }

            if (i == 1){
                mediaIdadeTimeA = somaIdadeJogadores / qtdJogadores;
            } else if (i ==2) {
                mediaIdadeTimeB = somaIdadeJogadores / qtdJogadores;
            } else if (i ==3) {
                mediaIdadeTimeC = somaIdadeJogadores / qtdJogadores;
            } else if ( i ==4 ) {
                mediaIdadeTimeD = somaIdadeJogadores / qtdJogadores;
            } else {
                mediaIdadeTimeE = somaIdadeJogadores / qtdJogadores;
            }
            somaIdadeJogadores = 0;
        }

        System.out.printf("Quantidade de jogadores menor que 18 anos: %d\n", qtdJogadoresMenor18);

        System.out.println("A média das idades dos jogadores do time A: "+ mediaIdadeTimeA);
        System.out.println("A média das idades dos jogadores do time B: "+ mediaIdadeTimeB);
        System.out.println("A média das idades dos jogadores do time C: "+ mediaIdadeTimeC);
        System.out.println("A média das idades dos jogadores do time D: "+ mediaIdadeTimeD);
        System.out.println("A média das idades dos jogadores do time E: "+ mediaIdadeTimeE);

        mediaAlturaJogadores = somaAlturaJogadores / (qtdJogadores * qtdTimes);
        System.out.printf("A média das alturas de todos os jogadores do campeonato, é: %.2f\n", mediaAlturaJogadores);

        percentualJogador80kg = ((double) qtdJogador80kg / (qtdJogadores * qtdTimes)) * 100;
        System.out.printf("O percentual de todos os jogadores do campeonato, que pesam mais de 80kg: %.2f%%", percentualJogador80kg);

    }

    /*
    14.Elaborar um algoritmo que efetue a leitura de valores positivos inteiros até
    que um valor negativo seja informado. Ao final devem ser apresentados o
    maior e o menor valor informados pelo usuário
    */
    public static void ex14(int valor, int maior, int menor) {
        System.out.print("Digite um número: ");
        valor = sc.nextInt();

        if (valor < 0) {
            System.out.println("Nenhum valor positivo foi digitado...");
            return;
        }

        maior = valor;
        menor = valor;

        while (valor >= 0) {
            System.out.print("Digite um número: ");
            valor = sc.nextInt();
            if (valor > maior) {
                maior = valor;
            }
            if (valor >= 0) {
                if (valor < menor) {
                    menor = valor;
                }
            }
        }
        System.out.printf("Maior valor: %d e Menor valor: %d%n%n", maior, menor);
    }

    /*
    15. Elabore um algoritmo que leia 15 valores informados via teclado, e apresente
    na tela:
    a) O menor número digitado
    b) O maior número digitado
    c) A média dos números digitados
    d) Quantidade de números pares
    e) Quantidade de números divisíveis por 5
    */
    public static void ex15() {
        int qtdValores = 15;
        int menorNumero = 0;
        int maiorNumero = 0;
        int somaNumeros = 0;
        int mediaNumeros;
        int qtdNumerosPares = 0;
        int qtdNumerosDiv5 = 0;

        for (int i = 0; i < qtdValores; i++) {
            System.out.println("Informe um valor: ");
            int valor = sc.nextInt();

            if (i == 0) {
                menorNumero = valor;
                maiorNumero = valor;
            } else {
                if (valor < menorNumero) {
                    menorNumero = valor;
                }
                if (valor > maiorNumero) {
                    maiorNumero = valor;
                }
            }

            somaNumeros += valor;

            if (valor % 2 == 0) {
                qtdNumerosPares++;
            }
            if (valor % 5 == 0) {
                qtdNumerosDiv5++;
            }
        }

        System.out.println("O menor número digitado é: " + menorNumero);
        System.out.println("O maior número digitado é: " + maiorNumero);

        mediaNumeros = somaNumeros / qtdValores;
        System.out.println("A média dos números digitados é: " + mediaNumeros);

        System.out.println("A quantidade de números pares é: " + qtdNumerosPares);
        System.out.println("A quantidade de números divisíveis por 5: " + qtdNumerosDiv5);
    }
}








