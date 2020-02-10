import java.util.Scanner;

public class MediaVetor {

    public static void main(String[] args) {

        int[] vetor = new int[10];
        int soma = 0;
        double media = 0;

        vetor = carregarVetor(vetor);
        media = calcularMediaValores(vetor);
        soma = somarValoresNegativos(vetor);

        System.out.println("Media dos valores é " + media);
        System.out.println("Soma dos valores é " + soma);


    }

    public static int[] carregarVetor(int[] vetor) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }

        scanner.close();
        System.out.println("vetor carregado");

        return vetor;
    }

    public static double calcularMediaValores(int[] vetor) {
        int quantidade = 0;
        int soma = 0;
        double media = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] >= 100 && vetor[i] <= 1000) {
                quantidade++;
                soma =+ vetor[i];
                media = soma / quantidade;
            }
        }
        System.out.println("Medias calculadas");

        return media;
    }

    public static int somarValoresNegativos(int[] vetor) {
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                soma += vetor[i];
            }
        }
        System.out.println("Soma dos valores negativos realizadas");
        return soma;
    }
}
