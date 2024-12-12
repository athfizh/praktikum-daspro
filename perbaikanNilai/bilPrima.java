import java.util.Scanner;

public class bilPrima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Program Bilangan Prima =====");
        System.out.print("Masukkan sebuah bilangan: ");
        int a = sc.nextInt();

        if (a < 2) {
            System.out.println(a + " bukan bilangan prima");
        } else {
            boolean prima = true;

            for (int i = 2; i * i <= a; i++) {
                if (a % i == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                System.out.println(a + " adalah bilangan prima");
            } else {
                System.out.println(a + " bukan bilangan prima");
            }
        }
    }
}