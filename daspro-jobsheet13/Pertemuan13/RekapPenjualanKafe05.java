package Pertemuan13;
import java.util.Scanner;

public class RekapPenjualanKafe05 {
    static Scanner sc = new Scanner(System.in);
    static String menu[];


    static String[] inputMenu(int jmlMenu) {
        String arr[] = new String[jmlMenu];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }
        return arr;
    }

    
    static void tampilMenu(String[] listMenu) {
        System.out.println("================= Mahasiswa ==================");
        for (int i = 0; i < listMenu.length; i++) {
            System.out.println((i + 1) + ". " + listMenu[i]);
        }
        System.out.println("=========================================");
    }


    static int[][] inputData(int x, int y) {
        int penjualanArr[][] = new int[x][y];
        for (int i = 0; i < penjualanArr.length; i++) {
            System.out.printf("Input Nilai mahasiswa %s\n", menu[i]);
            for (int j = 0; j < penjualanArr[i].length; j++) {
                System.out.printf("Masukkan Nilai matkul ke-%s: ", j + 1);
                penjualanArr[i][j] = sc.nextInt();
            }
            System.out.println("=========================================");
        }
        return penjualanArr;
    }
 
    static void printArr(int arr[][]) {
        System.out.println("=========================================");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Hasil nilai mahasiswa " + menu[i] + " : ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("matkul ke-" + (j + 1) + " : " + arr[i][j]);
            }
            System.out.println("-----------------------------------------");
        }
    }

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMenu = sc.nextInt();
        sc.nextLine(); 
        menu = inputMenu(jumlahMenu);

        tampilMenu(menu);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahHari = sc.nextInt();

        int[][] dataPenjualan = inputData(jumlahMenu, jumlahHari);

        printArr(dataPenjualan);
    }
}