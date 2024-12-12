import java.util.Scanner;

public class PencatatanPrestasiMahasiswa {
    static String[][] dataMhs = new String[50][5];
    static int jumlahData = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== PENCATATAN PRESTASI MAHASISWA ===");
            System.out.println("1. Tambah Data Prestasi");
            System.out.println("2. Tampilkan Semua Prestasi");
            System.out.println("3. Analisis Prestasi Berdasarkan Jenis");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tambahPrestasi();
                    break;
                    
                case 2:
                    tampilkanSemuaPrestasi();
                    break;

                case 3:
                    analisisPrestasi();
                    break;

                case 4:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (pilihan != 4);
    }

    static void tambahPrestasi() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nama Mahasiswa: ");
        dataMhs[jumlahData][0] = sc.nextLine();

        System.out.print("Masukkan NIM Mahasiswa: ");
        dataMhs[jumlahData][1] = sc.nextLine();

        System.out.print("Masukkan Jenis Prestasi: ");
        dataMhs[jumlahData][2] = sc.nextLine();

        System.out.print("Masukkan Tingkat Prestasi (Lokal/Nasional/Internasional): ");
        dataMhs[jumlahData][3] = sc.nextLine();

        int tahunPrestasi;
        while (true) {
            System.out.print("Masukkan Tahun Prestasi (2010 - 2024): ");
            tahunPrestasi = sc.nextInt();
            sc.nextLine();
            if (tahunPrestasi >= 2010 && tahunPrestasi <= 2024) {
                break;
            }
            System.out.println("Tahun tidak valid. Coba lagi.");
        }
        dataMhs[jumlahData][4] = "" + tahunPrestasi;
        jumlahData++;
        System.out.println("Data prestasi berhasil ditambahkan.");
    }

    static void tampilkanSemuaPrestasi() {
        if (jumlahData == 0) {
            System.out.println("Belum ada data prestasi.");
            return;
        }
    
        System.out.println("\n=== DAFTAR SEMUA PRESTASI ===");
        for (int i = 0; i < jumlahData; i++) {
            for (int j = 0; j < dataMhs[0].length; j++) {
                switch (j) {
                    case 0:
                        System.out.print("Nama: " + dataMhs[i][j]);
                        break;
                    case 1:
                        System.out.print(" | NIM: " + dataMhs[i][j]);
                        break;
                    case 2:
                        System.out.print(" | Jenis: " + dataMhs[i][j]);
                        break;
                    case 3:
                        System.out.print(" | Tingkat: " + dataMhs[i][j]);
                        break;
                    case 4:
                        System.out.print(" | Tahun: " + dataMhs[i][j]);
                        System.out.println();
                        break;
                }
            }
        }
    }    

    static void analisisPrestasi() {
        if (jumlahData == 0) {
            System.out.println("Tidak ada data prestasi untuk dianalisis.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jenis Prestasi yang ingin dianalisis: ");
        String jenisDicari = sc.nextLine();

        System.out.println("\n=== ANALISIS PRESTASI ===");
        boolean ditemukan = false;
        for (int i = 0; i < jumlahData; i++) {
            if (dataMhs[i][2].equalsIgnoreCase(jenisDicari)) {
                System.out.println("Nama: " + dataMhs[i][0] + " | NIM: " + dataMhs[i][1] + " | Tingkat: " + dataMhs[i][3] + " | Tahun: " + dataMhs[i][4]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada data dengan jenis prestasi: " + jenisDicari);
        }
        
    }
}