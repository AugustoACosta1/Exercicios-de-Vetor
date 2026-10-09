import java.util.Scanner;
import java.util.Random;

public class Main {

    static Scanner entrada = new Scanner(System.in);
    static Random aleatorio = new Random();

    public static void main(String[] args) {
        Algoritmo01();
        Algoritmo02();
        Algoritmo03();
        Algoritmo04();
        Algoritmo05();
        Algoritmo06();
        Algoritmo07();
        Algoritmo08();
        Algoritmo09();
        Algoritmo10();
        Algoritmo11();
        Algoritmo12();
        Algoritmo13();
        Algoritmo14();
        Algoritmo15();
        Algoritmo16();
        Algoritmo17();
        Algoritmo18();
        Algoritmo19();
        Algoritmo20();
    }

    private static void Algoritmo01() {
        System.out.println("\n--- Algoritmo 01 ---");

        int[] numeros = new int[10];

        for (int posicao = 0; posicao < 10; posicao++) {
            System.out.print("Digite um numero: ");
            numeros[posicao] = entrada.nextInt();
        }

        for (int posicao = 0; posicao < 10; posicao++) {
            int quantidadeDivisores = 0;

            for (int divisor = 1; divisor <= numeros[posicao]; divisor++) {
                if (numeros[posicao] % divisor == 0) {
                    quantidadeDivisores++;
                }
            }

            if (quantidadeDivisores == 2) {
                System.out.println("Numero primo: " + numeros[posicao]
                        + " | Posicao: " + posicao);
            }
        }
    }

    private static void Algoritmo02() {
        System.out.println("\n--- Algoritmo 02 ---");

        int[] numerosA = new int[10];
        int[] numerosB = new int[10];
        int[] numerosIntercalados = new int[20];

        for (int posicao = 0; posicao < 10; posicao++) {
            System.out.print("Digite um numero para A: ");
            numerosA[posicao] = entrada.nextInt();
        }

        for (int posicao = 0; posicao < 10; posicao++) {
            System.out.print("Digite um numero para B: ");
            numerosB[posicao] = entrada.nextInt();
        }

        for (int posicao = 0; posicao < 10; posicao++) {
            numerosIntercalados[posicao * 2] = numerosA[posicao];
            numerosIntercalados[posicao * 2 + 1] = numerosB[posicao];
        }

        for (int posicao = 0; posicao < 20; posicao++) {
            System.out.print(numerosIntercalados[posicao] + " ");
        }

        System.out.println();
    }

    private static void Algoritmo03() {
        System.out.println("\n--- Algoritmo 03 ---");

        int[] numeros = new int[10];
        int somaTotal = 0;
        double mediaCalculada;

        for (int posicao = 0; posicao < 10; posicao++) {
            numeros[posicao] = aleatorio.nextInt(100);
            somaTotal += numeros[posicao];

            System.out.println(numeros[posicao]);
        }

        mediaCalculada = somaTotal / 10.0;

        System.out.println("Media: " + mediaCalculada);
    }

    private static void Algoritmo04() {
        System.out.println("\n--- Algoritmo 04 ---");

        int[] numeros = new int[20];
        boolean numeroEncontrado = false;

        for (int posicao = 0; posicao < 20; posicao++) {
            numeros[posicao] = aleatorio.nextInt(30) + 1;
        }

        for (int posicao = 0; posicao < 20; posicao++) {
            if (numeros[posicao] == 25) {
                numeroEncontrado = true;
                break;
            }
        }

        if (numeroEncontrado) {
            System.out.println("O numero 25 foi encontrado.");
        } else {
            System.out.println("O numero 25 nao foi encontrado.");
        }
    }

    private static void Algoritmo05() {
        System.out.println("\n--- Algoritmo 05 ---");

        int[] numeros = new int[15];
        int posicaoEncontrada = -1;

        for (int posicao = 0; posicao < 15; posicao++) {
            numeros[posicao] = aleatorio.nextInt(50) + 1;
        }

        for (int posicao = 0; posicao < 15; posicao++) {
            if (numeros[posicao] == 20) {
                posicaoEncontrada = posicao;
                break;
            }
        }

        if (posicaoEncontrada != -1) {
            System.out.println("Numero 20 encontrado na posicao: "
                    + posicaoEncontrada);
        } else {
            System.out.println("Numero 20 nao encontrado.");
        }
    }

    private static void Algoritmo06() {
        System.out.println("\n--- Algoritmo 06 ---");

        int[] numeros = new int[30];
        int valorProcurado;
        int posicaoEncontrada = -1;

        for (int posicao = 0; posicao < 30; posicao++) {
            numeros[posicao] = aleatorio.nextInt(100) + 1;
        }

        System.out.print("Digite o numero que deseja remover: ");
        valorProcurado = entrada.nextInt();

        for (int posicao = 0; posicao < 30; posicao++) {
            if (numeros[posicao] == valorProcurado) {
                posicaoEncontrada = posicao;
                break;
            }
        }

        if (posicaoEncontrada != -1) {
            for (int posicao = posicaoEncontrada; posicao < 29; posicao++) {
                numeros[posicao] = numeros[posicao + 1];
            }

            numeros[29] = 0;

            System.out.println("Numero removido.");
        } else {
            System.out.println("Numero nao encontrado.");
        }

        for (int posicao = 0; posicao < 30; posicao++) {
            System.out.print(numeros[posicao] + " ");
        }

        System.out.println();
    }

    private static void Algoritmo07() {
        System.out.println("\n--- Algoritmo 07 ---");

        double[] numeros = new double[5];

        for (int posicao = 0; posicao < 5; posicao++) {
            System.out.print("Digite um numero decimal: ");
            numeros[posicao] = entrada.nextDouble();
        }

        double maiorValor = numeros[0];
        double menorValor = numeros[0];

        for (int posicao = 1; posicao < 5; posicao++) {
            if (numeros[posicao] > maiorValor) {
                maiorValor = numeros[posicao];
            }

            if (numeros[posicao] < menorValor) {
                menorValor = numeros[posicao];
            }
        }

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
    }

    private static void Algoritmo08() {
        System.out.println("\n--- Algoritmo 08 ---");

        int[] numerosA = new int[15];
        int[] numerosB = new int[15];

        for (int posicao = 0; posicao < 15; posicao++) {
            System.out.print("Digite um numero: ");
            numerosA[posicao] = entrada.nextInt();
        }

        for (int posicao = 0; posicao < 15; posicao++) {
            numerosB[posicao] = numerosA[14 - posicao];
        }

        System.out.println("Vetor invertido:");

        for (int posicao = 0; posicao < 15; posicao++) {
            System.out.print(numerosB[posicao] + " ");
        }

        System.out.println();
    }

    private static void Algoritmo09() {
        System.out.println("\n--- Algoritmo 09 ---");

        int quantidadeRecibos;
        int numeroRecibo = 1;

        System.out.print("Quantos recibos deseja gerar? ");
        quantidadeRecibos = entrada.nextInt();

        while (numeroRecibo <= quantidadeRecibos) {
            System.out.println("Recibo " + numeroRecibo);
            numeroRecibo++;
        }
    }

    private static void Algoritmo10() {
        System.out.println("\n--- Algoritmo 10 ---");

        int numeroEscolhido;

        System.out.print("Digite um numero: ");
        numeroEscolhido = entrada.nextInt();

        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            System.out.println(numeroEscolhido + " x " + multiplicador
                    + " = " + (numeroEscolhido * multiplicador));
        }
    }

    private static void Algoritmo11() {
        System.out.println("\n--- Algoritmo 11 ---");

        double[] temperaturas = new double[10];
        double somaTemperaturas = 0;
        double mediaTemperaturas;

        for (int posicao = 0; posicao < 10; posicao++) {
            System.out.print("Digite uma temperatura: ");
            temperaturas[posicao] = entrada.nextDouble();

            somaTemperaturas += temperaturas[posicao];
        }

        mediaTemperaturas = somaTemperaturas / 10;

        System.out.println("Media das temperaturas: " + mediaTemperaturas);
    }

    private static void Algoritmo12() {
        System.out.println("\n--- Algoritmo 12 ---");

        int[] numerosPares = new int[25];
        int proximaPosicao = 0;

        for (int numeroAtual = 1; numeroAtual <= 50; numeroAtual++) {
            if (numeroAtual % 2 == 0) {
                numerosPares[proximaPosicao] = numeroAtual;
                proximaPosicao++;
            }
        }

        for (int posicao = 0; posicao < 25; posicao++) {
            System.out.println(numerosPares[posicao]);
        }
    }

    private static void Algoritmo13() {
        System.out.println("\n--- Algoritmo 13 ---");

        int limiteNumerico;

        System.out.print("Digite um numero inteiro positivo: ");
        limiteNumerico = entrada.nextInt();

        for (int numeroAtual = 2; numeroAtual <= limiteNumerico; numeroAtual++) {
            int quantidadeDivisores = 0;

            for (int divisor = 1; divisor <= numeroAtual; divisor++) {
                if (numeroAtual % divisor == 0) {
                    quantidadeDivisores++;
                }
            }

            if (quantidadeDivisores == 2) {
                System.out.println(numeroAtual);
            }
        }
    }

    private static void Algoritmo14() {
        System.out.println("\n--- Algoritmo 14 ---");

        int quantidadeEtapas;
        int tempoTotal;

        System.out.print("Digite a quantidade de etapas: ");
        quantidadeEtapas = entrada.nextInt();

        tempoTotal = quantidadeEtapas;

        System.out.println("Tempo total de producao: " + tempoTotal);
    }

    private static void Algoritmo15() {
        System.out.println("\n--- Algoritmo 15 ---");

        int quantidadeTermos;
        int primeiroNumero = 0;
        int segundoNumero = 1;

        System.out.print("Quantos termos deseja mostrar? ");
        quantidadeTermos = entrada.nextInt();

        for (int posicao = 0; posicao < quantidadeTermos; posicao++) {
            System.out.print(primeiroNumero + " ");

            int proximoNumero = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = proximoNumero;
        }

        System.out.println();
    }

    private static void Algoritmo16() {
        System.out.println("\n--- Algoritmo 16 ---");

        int[] respostas = new int[5];

        for (int posicao = 0; posicao < 5; posicao++) {
            System.out.print("Digite um numero: ");
            respostas[posicao] = entrada.nextInt();
        }

        System.out.println("Ordem inversa:");

        for (int posicao = 4; posicao >= 0; posicao--) {
            System.out.println(respostas[posicao]);
        }
    }

    private static void Algoritmo17() {
        System.out.println("\n--- Algoritmo 17 ---");

        double[] notas = new double[10];
        double somaNotas = 0;
        double mediaNotas;

        for (int posicao = 0; posicao < 10; posicao++) {
            System.out.print("Digite uma nota: ");
            notas[posicao] = entrada.nextDouble();

            somaNotas += notas[posicao];
        }

        mediaNotas = somaNotas / 10;

        System.out.println("Media das notas: " + mediaNotas);
    }

    private static void Algoritmo18() {
        System.out.println("\n--- Algoritmo 18 ---");

        double[] temperaturas = new double[8];

        for (int posicao = 0; posicao < 8; posicao++) {
            System.out.print("Digite uma temperatura: ");
            temperaturas[posicao] = entrada.nextDouble();
        }

        double maiorTemperatura = temperaturas[0];

        for (int posicao = 1; posicao < 8; posicao++) {
            if (temperaturas[posicao] > maiorTemperatura) {
                maiorTemperatura = temperaturas[posicao];
            }
        }

        System.out.println("Maior temperatura: " + maiorTemperatura);
    }

    private static void Algoritmo19() {
        System.out.println("\n--- Algoritmo 19 ---");

        int[] codigosProdutos = {
                101, 205, 310, 415, 520,
                625, 730, 835, 940, 1050
        };

        int codigoProcurado;
        boolean produtoEncontrado = false;

        System.out.print("Digite o codigo do produto: ");
        codigoProcurado = entrada.nextInt();

        for (int posicao = 0; posicao < 10; posicao++) {
            if (codigosProdutos[posicao] == codigoProcurado) {
                produtoEncontrado = true;
                break;
            }
        }

        if (produtoEncontrado) {
            System.out.println("Produto encontrado.");
        } else {
            System.out.println("Produto nao encontrado.");
        }
    }

    private static void Algoritmo20() {
        System.out.println("\n--- Algoritmo 20 ---");

        double[] precosProdutos = new double[10];

        for (int posicao = 0; posicao < 10; posicao++) {
            System.out.print("Digite o preco do produto: ");
            precosProdutos[posicao] = entrada.nextDouble();
        }

        for (int posicao = 0; posicao < 9; posicao++) {
            for (int proximaPosicao = posicao + 1;
                 proximaPosicao < 10; proximaPosicao++) {

                if (precosProdutos[posicao] > precosProdutos[proximaPosicao]) {
                    double valorTemporario = precosProdutos[posicao];

                    precosProdutos[posicao] = precosProdutos[proximaPosicao];
                    precosProdutos[proximaPosicao] = valorTemporario;
                }
            }
        }

        System.out.println("Precos em ordem crescente:");

        for (int posicao = 0; posicao < 10; posicao++) {
            System.out.println(precosProdutos[posicao]);
        }
    }
}