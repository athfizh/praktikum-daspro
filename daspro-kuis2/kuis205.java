import java.util.Scanner;

public class kuis205 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan elemen matriks ordo 2x2:");
        int[][] matriks = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemen [" + (i + 1) + "]["+ (j + 1) + "]: ");
                matriks[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatriks Asli:");
        hasil(matriks);

        int[][] transpose = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transpose[i][j] = matriks[j][i];
            }
        }

        System.out.println("\nTranspose Matriks:");
        hasil(transpose);

        int determinan = (matriks[0][0] * matriks[1][1]) - (matriks[0][1] * matriks[1][0]);
        if (determinan != 0) {
            double[][] invers = {
                {matriks[1][1] / (double) determinan, -matriks[0][1] / (double) determinan},
                {-matriks[1][0] / (double) determinan, matriks[0][0] / (double) determinan}
            };

            System.out.println("\nInvers Matriks:");
            hasil(invers);
        } else {
            System.out.println();
        }
    }

    public static void hasil(double[][] matriks) {
        for (double[] baris : matriks) {
            for (double elemen : baris) {
                System.out.printf("%.2f ", elemen);
            }
            System.out.println();
        }
    }

    public static void hasil(int[][] matriks) {
        for (int[] baris : matriks) {
            for (int elemen : baris) {
                System.out.print(elemen + " ");
            }
            System.out.println();
        }
    }
}