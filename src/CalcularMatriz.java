import java.util.Scanner;

public class CalcularMatriz {
    static int[][] matriz = new int[4][4];

    public static void main(String[] args) {
        int maior = 0;
        matriz = preencheMatriz(matriz);
        int soma = somarElementos(matriz);
        int numerosImpares = quantidadeNumerosImpares(matriz);
        int divisiveisPorOito = quantidadeNumerosDivisiveisPorOito(matriz);
        int imparesEDivisivelPorTres = quantidadeImparesEDivisiveisPorTres(matriz);
        int fatorial = fatorialDoMaiorNumero(maior);

        System.out.println("Soma dos elementos entre 1 e 100 na matriz " + soma);
        System.out.println("quantidade de numeros impares " + numerosImpares);
        System.out.println("quantidade de numeros divisiveis por oito " + divisiveisPorOito);
        System.out.println("quantidade de numeros impares e diviseis por tres " + imparesEDivisivelPorTres);
        System.out.println("fatorial do maior numero da matriz " + fatorial);

    }

    private static int[][] preencheMatriz(int[][] matriz) {

        Scanner sc = new Scanner(System.in);

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                matriz[l][c] = sc.nextInt();
            }
        }

        return matriz;
    }

    private static int somarElementos(int[][] matriz) {
        int soma = 0;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                if (matriz[l][c] <= 100) {
                    soma = soma + matriz[l][c];
                }
            }
        }
        return soma;
    }

    private static int quantidadeNumerosImpares(int[][] matriz) {
        int quantidade = 0;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                if (matriz[l][c] >= 30 && matriz[l][c] <= 50 && matriz[l][c] % 2 == 1) {
                    quantidade++;
                }
            }
        }
        return quantidade;
    }

    private static int quantidadeNumerosDivisiveisPorOito(int[][] matriz) {
        int quantidade = 0;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                if (matriz[l][c] % 8 == 0) {
                    quantidade++;
                }
            }
        }
        return quantidade;
    }

    private static int quantidadeImparesEDivisiveisPorTres(int[][] matriz) {
        int quantidade = 0;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                if (matriz[l][c] % 2 == 1 && matriz[l][c] % 3 == 0) {
                    quantidade++;
                }
            }
        }

        return quantidade;
    }

    private static int fatorialDoMaiorNumero(int maior) {
        int fatorial = 1;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {

                if (matriz[l][c] > maior) {
                    maior = matriz[l][c];
                }

            }
        }
        for (int i = maior; i > 1; i--) {
            fatorial *= i;
        }

        return fatorial;
    }
}
