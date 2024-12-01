import java.util.Scanner;
public class Porseni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaAtlet, namaCabor, namaPoliteknik;
        String daftarAtlet = ""; 
        int jumlahCabor = 0;

        System.out.println("================================================================================");
        System.out.println("----------------------------PENDAFTARAN PORSENI 2024----------------------------");
        System.out.println("================================================================================");

        System.out.println();
        System.out.print("Masukkan asal politeknik : ");
        namaPoliteknik = sc.nextLine();

        while (jumlahCabor < 4) {
            System.out.println("nb : Silahkan isi data di masing-masing cabor!");
            System.out.print("Masukkan nama cabor (badminton, tenis meja, basket, bola voly) : ");
            namaCabor = sc.nextLine().toLowerCase();

            if (namaCabor.equalsIgnoreCase("badminton") || 
                namaCabor.equalsIgnoreCase("tenis meja") || 
                namaCabor.equalsIgnoreCase("basket") || 
                namaCabor.equalsIgnoreCase("bola voly")) {
                
                for (int i = 1; i <= 5; i++) {
                    System.out.print("Masukkan nama atlet ke-" + i + " : ");
                    namaAtlet = sc.nextLine();
                    daftarAtlet += "Nama Atlet ke-" + i + " untuk cabor " + namaCabor + " : " + namaAtlet + "\n";
                }
                jumlahCabor++;
            } else {
                System.out.println("Cabor tidak tersedia! Silakan coba lagi.");
            }
        }

        System.out.println("\n Informasi Nama Atlet Dari " + namaPoliteknik + " :");
        System.out.println("\n" + daftarAtlet);
    }
}