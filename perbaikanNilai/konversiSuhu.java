import java.util.Scanner;

public class konversiSuhu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Program Konversi Suhu =====");
        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);
    }
}