package Rekursif;

import java.util.Scanner;
public class Tugas2 {
    static int hitungPenjumlahan(int a) {
        if (a == 0) {
            return 0;
        } else {
            return a + hitungPenjumlahan(a - 1);
        }
    }
    static void tampilkanDeret(int a) {
        if (a == 1) {
            System.out.print("1");
        } else {
            tampilkanDeret(a - 1);
            System.out.print("+" + a);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int a = sc.nextInt();
        System.out.print("Penjumlahan dari 1 sampai " + a + " adalah: ");
        tampilkanDeret(a);
        System.out.println(" = " + hitungPenjumlahan(a));  
    }
}