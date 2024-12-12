import java.util.Scanner;

class Prestasi {
    String nama;
    String nim;
    String jenis;
    String tingkat;
    int tahun;

    Prestasi(String nama, String nim, String jenis, String tingkat, int tahun) {
        this.nama = nama;
        this.nim = nim;
        this.jenis = jenis;
        this.tingkat = tingkat;
        this.tahun = tahun;
    }
}

public class PrestasiMahasiswa {
    static Prestasi[] daftarPrestasi = new Prestasi[100]; // Array untuk menyimpan hingga 100 prestasi
    static int count = 0; // Menyimpan jumlah prestasi yang ditambahkan
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== Menu Utama ===");
            System.out.println("1. Tambah Prestasi");
            System.out.println("2. Tampilkan Daftar Prestasi");
            System.out.println("3. Analisis Prestasi");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline

            switch (pilihan) {
                case 1:
                    tambahPrestasi();
                    break;
                case 2:
                    tampilkanPrestasi();
                    break;
                case 3:
                    analisisPrestasi();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih lagi.");
            }
        } while (pilihan != 4);
    }

    static void tambahPrestasi() {
        if (count >= daftarPrestasi.length) {
            System.out.println("Tidak dapat menambah prestasi, kapasitas penuh!");
            return;
        }

        System.out.println("=== Tambah Prestasi Mahasiswa ===");
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Jenis Prestasi (Juara 1, Juara Harapan, dll): ");
        String jenis = scanner.nextLine();
        
        String tingkat;
        while (true) {
            System.out.print("Masukkan Tingkat Prestasi (Lokal, Nasional, Internasional): ");
            tingkat = scanner.nextLine();
            if (tingkat.equals("Lokal") || tingkat.equals("Nasional") || tingkat.equals("Internasional")) {
                break;
            } else {
                System.out.println("Input tidak valid! Silakan masukkan 'Lokal', 'Nasional', atau 'Internasional'.");
            }
        }

        int tahun;
        int tahunSekarang = 2024; // Ganti dengan tahun saat ini jika diperlukan
        while (true) {
            System.out.print("Masukkan Tahun Prestasi (2010 - " + tahunSekarang + "): ");
            tahun = scanner.nextInt();
            if (tahun >= 2010 && tahun <= tahunSekarang) {
                break;
            } else {
                System.out.println("Input tidak valid! Silakan masukkan tahun antara 2010 hingga " + tahunSekarang + ".");
            }
        }

        daftarPrestasi[count] = new Prestasi(nama, nim, jenis, tingkat, tahun);
        count++;
        System.out.println("Data prestasi berhasil ditambahkan!");
    }

    static void tampilkanPrestasi() {
        System.out.println("=== Daftar Prestasi Mahasiswa ===");
        for (int i = 0; i < count; i++) {
            Prestasi p = daftarPrestasi[i];
            System.out.println("Nama: " + p.nama + ", NIM: " + p.nim + ", Jenis: " + p.jenis + ", Tingkat: " + p.tingkat + ", Tahun: " + p.tahun);
        }
    }

    static void analisisPrestasi() {
        System.out.println("=== Analisis Prestasi Mahasiswa ===");
        System.out.print("Masukkan Jenis Prestasi yang ingin dianalisis: ");
        String jenisPrestasi = scanner.nextLine();
        System.out.println("Hasil Analisis:");
        boolean ditemukan = false; // Flag untuk mengecek apakah ada prestasi yang ditemukan
        for (int i = 0; i < count; i++) {
            Prestasi p = daftarPrestasi[i];
            if (p.jenis.equalsIgnoreCase(jenisPrestasi)) { // Menggunakan equalsIgnoreCase untuk mengabaikan case
                System.out.println("Nama: " + p.nama + ", NIM: " + p.nim + ", Tingkat: " + p.tingkat + ", Tahun: " + p.tahun);
                ditemukan = true; // Menandai bahwa prestasi ditemukan
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada prestasi dengan jenis '" + jenisPrestasi + "' yang ditemukan.");
        }
    }
}