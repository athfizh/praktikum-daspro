import java.util.Scanner;

public class hitungKPK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Program Hitung KPK =====");
        System.out.print("Masukkan bilangan pertama: ");
        int a = sc.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int b = sc.nextInt();

        int kpk = a;

        while (kpk % b != 0) {
            kpk += a;
        }

        System.out.println("KPK dari " + a + " dan " + b + " adalah: " + kpk);
    }
}