import java.util.Scanner;
public class Tugas1813{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan nilai N (minimal 3): ");
    int N = sc.nextInt();

    if (N < 3) {
        System.out.println("Nilai N minimal 3!!");
    } else {
        for (int i = 0; i < N; i++) {
            System.out.print(N + " ");
        }
        System.out.println();

        for (int i = 0; i < N - 2; i++) {
            for (int j = 0; j < N / 2; j++) {
                if (j == 0) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = 0; j < N / 2; j++) {
                if (j == N / 2 - 1) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < N; i++) {
            System.out.print(N + " ");
        }
        System.out.println();
    }
}
}