package Rekursif;

import java.util.Scanner;

public class Tugas3 {
    static boolean cekPrima(int n) {
        if (n <= 1) return false;
        boolean[] isPrima = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrima[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrima[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrima[j] = false;
                }
            }
        }
        return isPrima[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan yang akan dicek: ");
        int bilangan = sc.nextInt();
        if (cekPrima(bilangan)) {
            System.out.println(bilangan + " adalah bilangan prima");
        } else {
            System.out.println(bilangan + " bukan bilangan prima");
        }
    }
}