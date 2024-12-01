import java.util.Scanner;

public class kuis2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double [][] matrix = new double[2][2];

        System.out.println("Masukkan elemen matriks ordo 2x2: ");
        for (int i = 0; i < 2 ; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemen [" + (i + 1) + "][" + (j + 1) + "] : ");
                matrix[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Matriks Asli :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
            }
        }
        System.out.println("| " + matrix[0][0] + "  " + matrix[0][1] + " |");
        System.out.println("| " + matrix[1][0] + "  " + matrix[1][1] + " |");

        double [][] transpose = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transpose[j][i] =  matrix [i][j];
            }
        }
        System.out.println("Transpose Matriks");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
            }
            
        }
        System.out.println("| " + transpose[0][0] + "  " + transpose[0][1] + " |");
        System.out.println("| " + transpose[1][0] + "  " + transpose[1][1] + " |");

        double hitungdeterminan = (matrix[0][0] * matrix [1][1]) - (matrix [0] [1] * matrix[1][0]);

        double [][] invers = new double[2][2];
        if (hitungdeterminan != 0) {
            invers [0][0] = matrix[1][1] / hitungdeterminan;
            invers [0][1] = -matrix[0][1] / hitungdeterminan;
            invers [1][0] = -matrix[1][0] / hitungdeterminan;
            invers [1][1] = matrix[0][0] / hitungdeterminan;
        }
        System.out.println("Invers Matriks:");
        System.out.println("| " + invers[0][0] + "  " + invers[0][1] + " |");
        System.out.println("| " + invers[1][0] + "  " + invers[1][1] + " |");
    }
}