package Rekursif;

import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bulan: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Bulan harus lebih besar dari 0.");
            return;
        }

        System.out.printf("%-10s %-20s %-20s %-20s%n", 
                          "Bulan", "Pasangan Produktif", "Pasangan Belum Produktif", "Total Pasangan");
        
        int pasanganProduktif = 0;   
        int pasanganBelumProduktif = 1; 
        int totalPasangan;

        for (int bulan = 1; bulan <= n; bulan++) {
            totalPasangan = pasanganProduktif + pasanganBelumProduktif;

            System.out.printf("%-10d %-20d %-20d %-20d%n", 
                              bulan, pasanganBelumProduktif, pasanganProduktif, totalPasangan);

            int pasanganBaruProduktif = pasanganProduktif + pasanganBelumProduktif;
            pasanganBelumProduktif = pasanganProduktif;
            pasanganProduktif = pasanganBaruProduktif;
        }
    }
}