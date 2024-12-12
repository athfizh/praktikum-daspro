import java.util.Scanner;

public class hitungAir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalHarga = 0;

        System.out.println("=========== Program Hitung Air ===========");
        System.out.print("Masukkan jumlah air dalam meter kubik: ");
        int a = sc.nextInt();

        if (a > 0 && a <= 50) {
            totalHarga = a * 1000;
        } else if (a <= 100) {
            totalHarga = (50 * 1000) + ((a - 50) * 1500);
        } else if (a <= 150) {
            totalHarga = (50 * 1000) + (50 * 1500) + ((a - 100) * 2000);
        } else if (a > 150) {
            totalHarga = (50 * 1000) + (50 * 1500) + (50 * 2000) + ((a - 150) * 3000);
        } else {
            System.out.println("Jumlah air tidak valid.");
        }

        System.out.println("Total harga yang harus dibayar: Rp. " + totalHarga);
    }
}