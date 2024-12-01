package Rekursif;

import java.util.Scanner;
public class Tugas1 {
    
    public static void deretDescendingRekursif(int n) {
        if (n < 0) {
        return;
        }
        System.out.println(n);
        deretDescendingRekursif(n - 1);
    }
    public static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
        System.out.println(i);
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       
    System.out.print("Masukkan bilangan n: ");
    int a = sc.nextInt();
        
    System.out.println("Deret descending dengan rekursif:");
    deretDescendingRekursif(a);
        
    System.out.println("Deret descending dengan iteratif:");
    deretDescendingIteratif(a);
    }
}