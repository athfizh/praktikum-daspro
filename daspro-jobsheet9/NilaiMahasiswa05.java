import java.util.Scanner;
public class NilaiMahasiswa05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=========================================================");
        System.out.println("-----------------PROGRAM NILAI MAHASISWA-----------------");
        System.out.println("=========================================================");
        
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput : ");
        int jmlNilai = sc.nextInt();

        int[] nilaiMhs = new int[jmlNilai];
        double total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        rata2 = total / nilaiMhs.length;
        System.out.println("Nilai rata-rata : " + rata2);

        int min = nilaiMhs[0];
        int max = nilaiMhs[0];

        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] < min) {
                min = nilaiMhs[i];
            } else if (nilaiMhs[i] > max) {
                max = nilaiMhs[i];
            }
        }
        System.out.println("Nilai tertinggi : " + max);
        System.out.println("Nilai terendah : " + min);

        System.out.println("\nNILAI MAHASISWA YANG DIINPUT");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " : " + nilaiMhs[i]);
        }
    }
}