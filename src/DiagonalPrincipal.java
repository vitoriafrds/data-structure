
public class DiagonalPrincipal {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        matriz = preencheDiagonalPrincipal(matriz);
        print(matriz);
    }


    private static int[][] preencheDiagonalPrincipal(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int x = 0; x < matriz.length; x++) {
                if (i == x) {
                    matriz[i][x] = i * 3;
                }
            }
        }

        return matriz;
    }

    private static void print(int[][] matriz) {
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println(" ");
        }
    }
}
