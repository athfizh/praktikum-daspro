import java.util.Scanner;

public class urutanBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Program Urutan Bilangan =====");
        System.out.print("Masukkan bilangan pertama: ");
        int a = sc.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int b = sc.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int c = sc.nextInt();

        if (a <= b && a <= c) {
            if (b <= c) {
                System.out.println("Urutan bilangan secara ascending : " + a + ", " + b + ", " + c);
            } else {
                System.out.println("Urutan bilangan secara ascending : " + a + ", " + c + ", " + b);
            }
        } else if (b <= a && b <= c) {
            if (a <= c) {
                System.out.println("Urutan bilangan secara ascending : " + b + ", " + a + ", " + c);
            } else {
                System.out.println("Urutan bilangan secara ascending : " + b + ", " + c + ", " + a);
            }
        } else {
            if (a <= b) {
                System.out.println("Urutan bilangan secara ascending : " + c + ", " + a + ", " + b);
            } else {
                System.out.println("Urutan bilangan secara ascending : " + c + ", " + b + ", " + a);
            }
        }
    }
}