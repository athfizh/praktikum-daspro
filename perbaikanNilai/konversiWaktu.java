import java.util.Scanner;

public class konversiWaktu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Program Konversi Waktu =====");
        System.out.print("Masukkan waktu dalam detik: ");
        int detik = sc.nextInt();

        int jam = detik / 3600;
        int menit = (detik % 3600) / 60;
        int sisaDetik = detik % 60;

        System.out.println(detik + " detik = " + jam + " jam : " + menit + " menit : " + sisaDetik + " detik");
    }
}