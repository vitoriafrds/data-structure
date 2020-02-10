import java.util.Arrays;
import java.util.Scanner;

public class FatorialVetor {

    static int[] vetor = new int[5];

    public static void main(String[] args) {

        int numero = 0;
        vetor = preencherVetor(vetor);
        vetor = retornarVetorComFatorial(numero);
        System.out.println(Arrays.toString(vetor));

    }

    public static int[] preencherVetor(int[] vetor) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {

            vetor[i] = sc.nextInt();
        }
        sc.close();

        return vetor;
    }

    public static int[] retornarVetorComFatorial(int elemento) {

        for (int i = 0; i < vetor.length; i++) {
            elemento = vetor[i];
            int fatorial = 1;
            for (int x = elemento; x > 1; x--) {
                fatorial *= x;
                vetor[i] = fatorial;

            }
        }

        return vetor;
    }

}
