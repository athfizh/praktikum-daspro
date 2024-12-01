import java.util.Scanner;
public class PemesananKafe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("----------------- Pemesanan Kafe -----------------");
        System.out.println("==================================================");

        System.out.print("Jumlah pesanan : ");
        int pesanan = sc.nextInt();
        sc.nextLine();

        String[] daftarPesanan = new String[pesanan];
        int[] daftarHarga = new int[pesanan];

        for (int i = 0; i < pesanan; i++) {
            System.out.println("Pesanan ke-" + (i + 1));
            System.out.print("Masukkan nama makanan / minuman : ");
            daftarPesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga " + daftarPesanan[i] + " : ");
            daftarHarga[i] = sc.nextInt();
            sc.nextLine();
        }

        int totalHarga = 0;
        System.out.println("\n----------------- Daftar Pesanan -----------------");
        for (int i = 0; i < pesanan; i++) {
            System.out.println(daftarPesanan[i] + " dengan harga : " + daftarHarga[i]);
            totalHarga += daftarHarga[i];
        }
        System.out.println();
        System.out.println("Total Harga : " + totalHarga);
        System.out.println("--------------------------------------------------");
    }
}