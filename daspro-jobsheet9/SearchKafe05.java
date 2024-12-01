import java.util.Scanner;
public class SearchKafe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================================================================");
        System.out.println("------------------------------------- Pemesanan Kafe -------------------------------------");
        System.out.println("==========================================================================================");

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        
        System.out.println("\n------------------------------------ Daftar Pesanan ------------------------------------");
        System.out.println("Nasi Goreng, Mie Goreng, Roti Bakar, Kentang Goreng, Teh Tarik, Cappucino, Chocolate Ice");
        
        System.out.print("\nMasukkan nama makanan / minuman yang ingin dicari : ");
        String cari = sc.nextLine();

        String pilih = "";

        for (int i = 0; i < menu.length; i++) {
            if (cari.equalsIgnoreCase(menu[i])) {
                pilih = menu[i];
                System.out.println(pilih + " tersedia di menu.");
                break;
            }
        }
        if (pilih.equalsIgnoreCase("")) {
            System.out.println("Makanan / minuman yang dicari tidak ada di menu.");
        }
    }
}