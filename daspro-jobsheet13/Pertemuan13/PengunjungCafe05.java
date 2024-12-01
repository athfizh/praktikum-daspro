package Pertemuan13;

public class PengunjungCafe05 {
    public static void daftarPengunjung(String kategori, String... namaPengunjung) {
        System.out.println("Kategori Pengunjung: " + kategori);
        System.out.println("Daftar Nama Pengunjung: ");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }
    
    public static void main(String[] args) {
        daftarPengunjung("Teman", "Ali", "Budi", "Citra");
        daftarPengunjung("Keluarga", "Diana", "Eko");
    }
}