import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan waktu kedatangan");
        System.out.print("Masukkan jam: ");
        int jamDatang = sc.nextInt();
        System.out.print("Masukkan menit: ");
        int menitDatang = sc.nextInt();
        System.out.print("Masukkan detik: ");
        int detikDatang = sc.nextInt();

        System.out.println("Masukkan waktu keberangkatan");
        System.out.print("Masukkan jam: ");
        int jamBerangkat = sc.nextInt();
        System.out.print("Masukkan menit: ");
        int menitBerangkat = sc.nextInt();
        System.out.print("Masukkan detik: ");
        int detikBerangkat = sc.nextInt();

        // Calculate the differences
        int selisihJam = jamBerangkat - jamDatang;
        int selisihMenit = menitBerangkat - menitDatang;
        int selisihDetik = detikBerangkat - detikDatang;

        // Adjust for negative seconds
        if (selisihDetik < 0) {
            selisihDetik += 60;
            selisihMenit--;
        }

        // Adjust for negative minutes
        if (selisihMenit < 0) {
            selisihMenit += 60;
            selisihJam--;
        }

        // If the result is negative, set it to zero
        if (selisihJam < 0) {
            selisihJam = 0;
            selisihMenit = 0;
            selisihDetik = 0;
        }

        System.out.println("Lama rentang waktu = " + selisihJam + " jam " + selisihMenit + " menit " + selisihDetik + " detik");
    }
}