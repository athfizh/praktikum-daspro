import java.util.Scanner;
public class array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nilaiMhs = new int[3][5];
        int[] total = new int[3];

        System.out.println("== Program Menghitung Rata-Rata Nilai Mahasiswa ==");

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1));
            for (int j = 0; j < nilaiMhs[i].length; j++) {
                System.out.print("Nilai ke-" + (j + 1) + " : ");
                nilaiMhs[i][j] = sc.nextInt();
                total[i] += nilaiMhs[i][j];
            }
            System.out.println();
        }

        for (int i = 0; i < total.length; i++) {
            double rata = total[i] / nilaiMhs[i].length;
            System.out.println("Rata-rata nilai mahasiswa ke-" + (i + 1) + " : " + rata);
        }
    }
}