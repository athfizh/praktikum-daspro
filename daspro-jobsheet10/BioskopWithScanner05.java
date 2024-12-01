import java.util.Scanner;
public class BioskopWithScanner05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu Bioskop:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();

                while (true) {
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Baris dan kolom harus dalam rentang yang valid (Baris: 1-4, Kolom: 1-2)!");
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil disimpan.");
                        break;
                    }
                }
            } else if (pilihan == 2) {
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String penontonNama = penonton[i][j] != null ? penonton[i][j] : "***";
                        System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penontonNama);
                    }
                }
            } else if (pilihan == 3) {
                System.out.println("Keluar dari program.");
                return;
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}