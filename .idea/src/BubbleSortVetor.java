import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortVetor {

    public static void main(String[] args) {

        int[] vetor = new int[5];
        vetor = preencheVetor(vetor);
        vetor = ordenarVetor(vetor);

        System.out.println(Arrays.toString(vetor));
    }

    private static int[] preencheVetor(int[] vetor) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }

        return vetor;
    }

    private static int[] ordenarVetor(int[] vetor) {

        int aux = 0;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }

        return vetor;
    }
}
