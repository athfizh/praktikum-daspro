import java.util.Scanner;
public class ArrayRataNilai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
        double totalLulus = 0, totalTdkLulus = 0;
        double rataLulus = 0, rataTdkLulus = 0;
        int lulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                lulus++;
                totalLulus += nilaiMhs[i];
            } else {
                totalTdkLulus += nilaiMhs[i];
            }
        }

        if (lulus > 0 && jmlMhs - lulus > 0) {
            rataLulus = totalLulus / lulus;
            System.out.println("Rata-rata nilai lulus = " + rataLulus);
            rataTdkLulus = totalTdkLulus / (jmlMhs - lulus);
            System.out.println("Rata-rata nilai tidak lulus = " + rataTdkLulus);
        }
    }
}